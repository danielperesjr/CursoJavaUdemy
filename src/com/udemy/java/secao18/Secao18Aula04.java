package com.udemy.java.secao18;

//Seção 18 - Conhecendo a Java Lang
//Aula 04 - Trabalhando com Strings

//Em Java as Strings são imutáveis, ou seja, não mudam.

public class Secao18Aula04 {
	
	public static void main(String[] args) {
		
		String curso = "Programação em Java: Essencial";
//		curso.replace("Java", "Python"); //Altera, se encontrar, a primeira palavra pela segunda.
//		System.out.println(curso);
//		
//		String nova = curso.replace("Java", "Python"); //Altera, se encontrar, a primeira palavra pela segunda.
//		System.out.println(nova);
//		
//		curso = curso.replace("Java", "Python"); //Altera, se encontrar, a primeira palavra pela segunda.
//		System.out.println(curso);
//		
//		curso = curso.toLowerCase();
//		System.out.println(curso);
//		
//		curso = curso.toUpperCase();
//		System.out.println(curso);
//		
//		System.out.println(curso.charAt(12));
		
//		for(int i = 0; i < curso.length(); i++) {
//			System.out.println(curso.charAt(i));
//		}
		
		for(int i = (curso.length() - 1); i >= 0; i--) {
			System.out.print(curso.charAt(i));
		}
	
		
	}
}
