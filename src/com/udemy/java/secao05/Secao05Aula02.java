package com.udemy.java.secao05;

import java.util.Scanner;

// Seção 05 - Estruturas de Repetição em Java
// Aula 02 - While e Do While


// While

public class Secao05Aula02 {
	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		// Necessário iniciar a variável - ou a condição ser verdadeira - para funcionar, pois faz a checagem antes da execução
		while(idade > 0) {
			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe a sua idade:");
		//	idade = teclado.nextInt(); - Não funciona corretamente, pois há um bug no Java
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


// Do While
/*
public class Secao05Aula02 {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		// Executa o bloco e depois faz a checagem
		do {
			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe a sua idade:");
		//	idade = teclado.nextInt(); - Não funciona corretamente, pois há um bug no Java
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}else {
				System.out.println(nome + " tem menos de 12 meses de idade.");
			}
		}while(idade > 0);
		
		teclado.close();
	}
}
*/