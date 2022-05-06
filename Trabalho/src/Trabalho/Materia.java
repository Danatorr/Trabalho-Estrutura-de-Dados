package Trabalho;


import Trabalho.Materia;

public class Materia {

	//Atributos do objeto matéria
	String nome;
	Double nota;
	Materia proximo;
	
	//Lógica para Getters and Setters do nome

	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}

	//Lógica para Getters e Setters da nota

	public Double getNotas() {
		return nota;
	}
	public void setNotas(Double grade) {
		this.nota = grade;
	}
	//Lógica para Getters and Setters do próximo
	
	public Materia getProximo() {
		return proximo;
	}
	public void setProximo(Materia proximo) {
		this.proximo = proximo;
	}
	
}
