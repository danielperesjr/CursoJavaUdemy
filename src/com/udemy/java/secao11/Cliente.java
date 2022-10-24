package com.udemy.java.secao11;

public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		this.dizer_oi();
	}
	
	private void dizer_oi() {
		System.out.println(this.nome +  " está dizendo oi!");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
}