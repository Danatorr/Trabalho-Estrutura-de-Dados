package Trabalho;

import Trabalho.ListaMateria;

public class Aluno {
	int rgm;
	String nome;
	
	ListaMateria materias = new ListaMateria();
	
	public ListaMateria getMaterias() {
		return materias;
	}

	public void setMaterias(ListaMateria materias) {
		this.materias = materias;
	}

	
	public int getRgm() {
		return rgm;
	}

	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
