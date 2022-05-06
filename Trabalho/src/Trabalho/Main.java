package Trabalho;

/*
  Aluno: Daniel de Araújo Torres
  RGM:26778670
  Cadeira: Estrutura de Dados
  Professor: Thiago Medeiros
*/
import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        ListaAluno listaAlunos = new ListaAluno();
        String resposta = null;
        int rgmBusca = 0;
        int escolha;
        
        do {
        
	        System.out.println("Informe uma escolha dentre as opções:\n");
	        System.out.println("1 - Inserir um aluno na lista\n ");
	        System.out.println("2 - Procurar por um aluno específico na lista\n ");
	        System.out.println("3 - Mostrar todos os alunos: \n");
	        System.out.println("4 - Excluir um aluno especifico da lista\n");
	        System.out.println("5 - Cancelar \n");
	        System.out.println("Escolha: ");
	        escolha = teclado.nextInt();
	        
        
	        switch(escolha) {
	        // Lógica para inclusão de alunos
	    	case 1:   
	    		
	    		System.out.print("Quantos alunos deseja inserir:  ");
	    		int studentsQuant = teclado.nextInt();
	    		
	    		for(int i = 0; i < studentsQuant ; i++) {
	                Aluno aluno = new Aluno();
	                
	                System.out.println("\nInforme o nome do aluno: ");
	                aluno.nome = teclado.next();
	                
	                System.out.println("\nInforme o RGM do aluno: ");
	                aluno.rgm = teclado.nextInt();
	                do {
	                    Materia disciplina = new Materia();
	                    System.out.println("Informe o nome da disciplina: ");
	                    disciplina.setNome(teclado.next());
	
	                    System.out.println("Informe a nota na disciplina: ");
	                    disciplina.setNotas(teclado.nextDouble());
	
	                    aluno.materias.insertEnd(disciplina);
	
	                    teclado.nextLine();
	                    System.out.println("Você quer adicionar outra disciplina? (S/N) ");
	                    resposta = teclado.next();
	                 
	                }while(resposta.equals("S") || resposta.equals("s"));
	                listaAlunos.inserirAluno(i, aluno);
	    		}
	            
	           
	    		break;
	    	//Lógica para busca pelo RGM
	    	case 2: 
	    		
	    		System.out.println("Digite o RGM do aluno: ");
	            rgmBusca = teclado.nextInt();
	            Aluno alunoBuscado = null;
	            for(int i = 0; i<listaAlunos.contadorTamanhoLista; i++) {
	                if(rgmBusca == listaAlunos.buscar(i).rgm) {
	                    alunoBuscado = listaAlunos.buscar(i);
	                }
	            }
	            if(alunoBuscado != null) {
	                System.out.println("Aluno encontrado: " + alunoBuscado.rgm);
	                System.out.println("Disciplinas: " );
	                alunoBuscado.materias.getLista();
	            }
	            else {
	                System.out.println("RGM não existente!");
	            }

	    		break;
	    	//Lógica para mostrar a lista de todos os alunos 
	    	case 3: 
	    		
	    		 if(!listaAlunos.listaVoid()) {
	                 listaAlunos.verLista();
	             }
	             else {
	                 System.out.println("A lista está vazia!");
	             }
	    		break;
	    	//Lógica para remoção de aluno pelo RGM
	    	case 4:  
	    		
	    		System.out.println("Digite o RGM do aluno que voc� quer remover: ");
	            rgmBusca = teclado.nextInt();
	            int posicao = 0;
	            boolean find = false;
	            for(int i = 0; i<listaAlunos.contadorTamanhoLista;i++) {
	                if(rgmBusca == listaAlunos.buscar(i).rgm) {
	                    find = true;
	                    posicao = i;
	                }
	            }
	            if(find == true) {
	                listaAlunos.remover(posicao); 
	            }
	            else {
	                System.out.println("RGM incorreto");
	            }
	    		break;
	    		
	    	default:
	    		if(escolha == 5) {
	    			System.out.println("Execução cancelada!");
	    		} else {
	    			System.out.println();
	    			System.out.println("Número inválido!");
	    		}
	        }
	        
    } while (escolha != 5);

        teclado.close();
    }
}