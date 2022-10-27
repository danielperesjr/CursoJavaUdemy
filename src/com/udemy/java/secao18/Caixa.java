package com.udemy.java.secao18;

//Caixa de objetos genéricos
public class Caixa {
	private Object[] objetos;
	private int posicaoLivre;
	
	public Caixa () {
		objetos = new Object[100]; //Até 100 objetos, de 0..99
		posicaoLivre = 0;
	}
	
	public void adicionar(Object novo) {
		this.objetos[this.posicaoLivre] = novo;
		this.posicaoLivre++;
	}
	
	public Object pegar(int posicao) {
		return this.objetos[posicao];
	}
}
