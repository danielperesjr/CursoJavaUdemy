package com.udemy.java.secao08;

//import java.util.Scanner;

//Seção 08 - Funções em Java
//Aula 03 - Usando nossas funções


public class Secao08Aula03 {
	
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4;
		
		System.out.println("O resultado é " + soma(valor1, valor2));
		
		System.out.println(mensagem());
	}
	
	
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
	static String mensagem() {
		return ("Olá, usuário!");
	}
	
}



/*
public class Secao08Aula03 {
	
	static String frutas[];
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd;
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
		
		teclado.close();
		
	}
	
	
	//Uma função deve possuir:
	//* Tipo de retorno (tipo de dado que a função vai retornar);
	//* Nome correspondente a ação que a função realiza;
	//* Parâmetros/Argumentos de entrada (opcional);
	//* Retorno (opcional - depende do tipo de retorno);
	 
	
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
*/