package Trabalho;

import Trabalho.Aluno;

//Lista de alunos
public class ListaAluno {
	Aluno[] alunos = new Aluno[60];
	int contadorTamanhoLista = 0;
	
	public boolean listaVoid() {
		return(contadorTamanhoLista == 0);
	}
	
	public boolean listaCheia() {
		return (contadorTamanhoLista == alunos.length);
	}
	public int tamanhoLista() {
		return contadorTamanhoLista;
	}
	public Aluno buscar(int posicao) {
		if((posicao >= contadorTamanhoLista) || (posicao < 0)) {
			return null;
		}
		return alunos[posicao];
	}
	
	//L[ogica para comparar o RGM do aluno com o RGM do aluno que está na posição pos
	public boolean comparar(Aluno a1, Aluno a2) {
		if(a1.rgm == a2.rgm) {
			return false;
		}
		else {
			return true;
		}
	}
	public int retornarPosicao(Aluno aluno) {
		for (int i= 0; i<contadorTamanhoLista; i++) {
			if(comparar(alunos[i], aluno)) {
				return i;
			}
			
		}
		return -1;
	}
	public void moverDireita(int posicao) {
		for(int i = contadorTamanhoLista; i > posicao; i--) {
			alunos[i] = alunos[i-1];
		}
		
	}
	public boolean inserirAluno(int posicao, Aluno a1) {
		if(listaCheia() || (posicao> contadorTamanhoLista) || (posicao < 0)) {
			return false;
		}
		moverDireita(posicao);
		alunos[posicao] = a1;
		contadorTamanhoLista++;
		return true;
	}
	public void moverEsquerda(int posicao) {
		for(int i = posicao; i <(contadorTamanhoLista -1); i++) {
			alunos[i] = alunos[i+1];
		}
	}
	public boolean remover(int posicao) {
		if( (posicao>= contadorTamanhoLista) || (posicao < 0)) {
			return false;
		}
		moverEsquerda(posicao);
		
		contadorTamanhoLista--;
		return true;
	}
	public void verLista() {
        for (int i=0; i<contadorTamanhoLista; i++) {
            System.out.println("\nAluno: " + (alunos[i].nome) + "\nRGM: " + alunos[i].rgm);
            System.out.println("Disciplinas: ");
            alunos[i].getMaterias().getLista();
        }
    }
}
