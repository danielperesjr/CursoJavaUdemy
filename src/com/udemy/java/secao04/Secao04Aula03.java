package com.udemy.java.secao04;

// Seção 04 - Estruturas de Decisão em Java
// Aula 03 - Operador Ternário

public class Secao04Aula03 {

	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*
		if(valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}
		*/
		
		
		// Operador Ternário - Funciona somente para if else simples
		numero = (valor > 0) ? valor : 7;
		
		System.out.println(numero);
		
	}
}
