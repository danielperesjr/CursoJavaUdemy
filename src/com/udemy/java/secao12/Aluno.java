package com.udemy.java.secao12;

//Classe específica, sub-classe de Pessoa, classe filha...

public class Aluno extends Pessoa{
	private String ra;
	
	//Extends Pessoa: Aluno é uma pessoa
	public Aluno(String nome, String email, int ano_nascimento, String ra) {
		super(nome, email, ano_nascimento);
		this.ra = ra;
	}
	
	//Overriding / Sobrescrita de Método
	public String getNome() {
		return "Aluno: " + super.getNome();
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	//Overriding / Sobrescrita de Método
	public String toString() {
		return super.toString() + "\nRA: " + this.ra;
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
	}

}