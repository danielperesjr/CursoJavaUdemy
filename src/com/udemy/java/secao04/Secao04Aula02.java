package com.udemy.java.secao04;

// Seção 04 - Estruturas de Decisão em Java
// Aula 02 - if, else, else if

public class Secao04Aula02 {

	public static void main(String[] args) {

		int numero = 2;
		
		if(numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5.");
		}else if(numero == 5 ) {
			System.out.println("O número " + numero + " é igual a 5.");
		}else if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}else {
			System.out.println("Não, o número " + numero + " não é maior que 5.");
		}

	}

}
