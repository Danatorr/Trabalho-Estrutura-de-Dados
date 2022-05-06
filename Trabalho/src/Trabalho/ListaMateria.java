package Trabalho;

import Trabalho.Materia;

public class ListaMateria {


	Materia primeiro = null;
	Materia ultimo = null;
	int tamanho = 0;
	
	//Lógica para checar se está vazia
	public boolean verificaVoid() {
		if (tamanho == 0)
			return true;
		
		return false;
	}
	//Lógica para identificar tamanho da Lista
	public int tamanhoLista() {
		return (tamanho);
	}


	
	
	// Inserir no inicio da lista

	public void insertSubjectStart(Materia item) {
		if (verificaVoid())
			primeiro = ultimo = item;
		else {
			item.proximo = primeiro;
			primeiro = item;
		}
		tamanho++;
	}
	// Inserir no fim da lista

	public void insertEnd(Materia item) {
		if (verificaVoid())
			primeiro = ultimo = item;
		else {
			ultimo.proximo = item;
			ultimo = item;
		}
		tamanho++;
	}
	
	public void getLista() {
		Materia temp = primeiro;
		if (!verificaVoid()) {
			for (int i = 0; i < tamanho; i++) {
				System.out.println("Disciplina "+(i+1)+" | nome: "+temp.nome+" | nota: "+temp.nota);
				temp = temp.proximo;
			}
		}
	}
}	
