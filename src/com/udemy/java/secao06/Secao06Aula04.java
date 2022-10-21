package com.udemy.java.secao06;

//Seção 06 - Tipos de Dados em Java
//Aula 04 - Tipos Alfanuméricos (Caracteres e Strings)

public class Secao06Aula04 {

	public static void main(String[] args) {
		// Tipos Primitivos
		char caractere1 = 'a'; // Representado com 'aspas simples'
		char caractere2 = 97; // 97 em decimal/ASC == 'a'
		// Não existe o tipo primitivo string no Java, somente não primitivo
		
		System.out.println("Caractere 2: " + caractere2);
		
		caractere2 = (char) (caractere2 + 1); //CAST
		
		System.out.println("Caractere 1: " + caractere1);
		System.out.println("Caractere 2: " + caractere2);
		
		// Tipos Não Primitivos
		Character caractere3 = 'A';
		String nome = "Daniel Peres Junior";
		
		System.out.println("Caractere 3: " + caractere3);
		System.out.println("Nome: " + nome);
		
		// Espaço em memória ocupado pelos tipos primitivos acessado pelos tipos não primitivos
		System.out.println("char/Character: " + Character.SIZE + " bits");
		// O Java cria um vetor para cada um dos caracteres para então transformá-los em String, por isso não existe uma constante SIZE
		System.out.println("Quantidade de Caracteres da String: " + nome.length());
		System.out.println("String: " + (Character.SIZE * nome.length()) + " bits"); // Retorna o espaço ocupado em memória do valor atribuído na String
		
		
		// Valores Min. e Máx. suportados pelos tipos primitivos acessados pelos tipos não primitivos
		System.out.println("Valor Min. do char/Character: " + Character.MIN_VALUE);
		System.out.println("Valor Máx. do char/Character: " + Character.MAX_VALUE);

	}

}
