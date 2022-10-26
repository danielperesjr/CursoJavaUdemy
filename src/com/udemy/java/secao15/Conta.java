package com.udemy.java.secao15;

public class Conta {

	private int numero;
	private String cliente;
	
	public static int contador = 1;
	
	public Conta(String cliente) {
		this.numero = contador;
		this.cliente = cliente;
		Conta.contador = Conta.contador + 1; //Acessando o atributo de forma estática
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	
}