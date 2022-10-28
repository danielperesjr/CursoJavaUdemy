package com.udemy.java.secao21;

/**
 * Classe que representa uma célula (container),
 * onde haverá o objeto (valor) e uma célula que
 * será a ligação para o 'proximo'.
 * @author daniel
 *
 */

public class Celula {
	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}
}
