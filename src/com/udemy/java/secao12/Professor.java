package com.udemy.java.secao12;

//Classe específica, sub-classe de Pessoa, classe filha...

public class Professor extends Pessoa{
	private String matricula;
	
	public Professor(String nome, String email, int ano_nascimento, String matricula) {
		super(nome, email, ano_nascimento);
		this.matricula = matricula;
	}
	
	//Overriding / Sobrescrita de Método
	public String getNome() {
		return "Professor: " + super.getNome();
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//Overriding / Sobrescrita de Método
	public String toString() {
		return super.toString() + "\nMatrícula: " + this.matricula;
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
	}

}