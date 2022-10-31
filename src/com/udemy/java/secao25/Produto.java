package com.udemy.java.secao25;

//Seção 25 - Projeto Java 2 Mercado
//Aula 04 - Criando o model

public class Produto {

	private static int contador = 1;
	
	private int codigo;
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.codigo = contador;
		this.nome = nome;
		this.preco = preco;
		Produto.contador += 1;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "Código: " + this.getCodigo() + 
				"\nNome: " + this.getNome() +
				"\nPreço: " + Utils.doubleParaString(this.getPreco());
	}
	
}
