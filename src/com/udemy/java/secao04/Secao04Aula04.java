package com.udemy.java.secao04;

// Seção 04 - Estruturas de Decisão em Java
// Aula 04 - Instrução Switch

public class Secao04Aula04 {
	
	public static void main(String[] args) {
		int numero = 33;
		
		switch (numero) {
			case 1:
				System.out.println("O numero é 1");
			break;
			case 3:
				System.out.println("O número é 3");
			break;
			case 5:
				System.out.println("O número é 5");
			break;
			default:
				System.out.println("[Default] O número é " + numero);
			break;
		}
		
	}
	
}
