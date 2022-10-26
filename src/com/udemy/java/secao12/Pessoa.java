package com.udemy.java.secao12;

//Classe base, classe mãe, classe pai, super-classe, classe genérica...


//Agora como classe abstrata:
//Dessa forma impedimos/impossibilitamos a criação de objetos dessa classe.

public abstract class Pessoa {
	private String nome, email;
	private int ano_nascimento;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email; 
	}
	
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento; 
	}
	
	//Overriding / Sobrescrita de Método
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}
	
	//Overloading / Sobrecarga de Método
	public void mensagem() {
		System.out.println("Essa é a minha mensagem!");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	//Declaração de um método abstrato
	public abstract void outra_mensagem(String texto);
	
}
