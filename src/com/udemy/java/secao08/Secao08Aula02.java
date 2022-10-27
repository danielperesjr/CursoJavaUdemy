package com.udemy.java.secao08;

import java.util.Scanner;

//Seção 08 - Funções em Java
//Aula 02 - Criando nossas próprias funções


public class Secao08Aula02 {
	
	static String frutas[];
	
	static Scanner teclado = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int qtd;
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		teclado.close();
		
	}
	
	/*
	 	Uma função deve possuir:
	 	* Tipo de retorno (tipo de dado que a função vai retornar);
	 	* Nome correspondente a ação que a função realiza;
	 	* Parâmetros/Argumentos de entrada (opcional);
	 	* Retorno (opcional - depende do tipo de retorno);
	 */
	
	
	static void cadastrar_dados(int quantidade) {
		//Definindo o tamanho do vetor
		frutas = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe a fruta " + (i + 1) + ": ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) {
		for(int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
	
}

/*
public class Secao08Aula02 {
	public static void main(String[] args) {
		int qtd;
		String frutas[];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		//Definindo o tamanho do vetor
		frutas = new String[qtd];
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe a fruta " + (i + 1) + ": ");
			frutas[i] = teclado.nextLine();
		}
		
		for(int i = 2; i >= 0; i--) {
			System.out.println(frutas[i]);
		}
		
		teclado.close();
		
	}
}
*/