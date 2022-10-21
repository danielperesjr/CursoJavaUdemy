package com.udemy.java.secao07;

//Seção 07 - Vetores e Matrizes em Java
//Aula 03 - Vetores - Parte 2

public class Secao07Aula03 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		double vrArredondado;
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
		}
		
		System.out.println(numeros[0]); // Primeiro elemento
		System.out.println(numeros[9]); // Último elemento
		
		//0..9
		//numeros[10] = 42;
		//System.out.println(numeros[10]);
		/*
		 * Os vetores/arrays possuem tamanho fixo e não podem ser aumentados/diminuídos.
		 */
		
		//Os dados dos vetores/arrays podem ser alterados, desde que sejam do mesmo tipo de dados.
		numeros[0] = 7;
		System.out.println(numeros[0]); // Primeiro elemento
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]); // Primeiro elemento
		System.out.println(numeros[9]); // Último elemento
		
		//valor entre 0..1 double
		vrArredondado = Math.random();
		
		System.out.println(vrArredondado);
		System.out.println(vrArredondado * 10);
		System.out.println(Math.round(vrArredondado * 10));
		
		
		for (int i : numeros) {
			System.out.println(i);
		}
		
	}
}