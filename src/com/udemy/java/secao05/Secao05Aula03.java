package com.udemy.java.secao05;

import java.util.Scanner;

// Seção 05 - Estruturas de Repetição em Java
// Aula 03 - For e Foreach


// For

public class Secao05Aula03 {

	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		// Variável de Controle; Condição de Parada; Forma de Incremento
		for(int i = 0; i < 5; i ++) {
			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe a sua idade:");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}else {
				System.out.println(nome + " tem menos de 12 meses de idade.");
			}
		}


		teclado.close();
		
	}

}


// Foreach
/*
public class Secao05Aula03 {

	public static void main(String[] args) {
		String nome = "Daniel Peres Junior";
		
		// Imprimir cada um dos caracteres da String utilizando uma função de vetor
		for(char caractere : nome.toCharArray()) {
			System.out.println(caractere);
		}
	}

}
*/