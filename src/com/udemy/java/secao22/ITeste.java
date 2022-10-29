package com.udemy.java.secao22;

public interface ITeste {
	int valor = 9;
	
	public String mensagem();
	
	default void menu_metodo() {
		System.out.println("Meu default method...");
	}
}
