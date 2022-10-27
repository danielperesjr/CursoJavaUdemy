package com.udemy.java.secao07;

//Seção 07 - Vetores e Matrizes em Java
//Aula 04 - Matrizes - Parte 1

public class Secao07Aula04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Declaração
		int outros_numeros[][];
		
		//Declaração e definição do tamanho
		int numeros[][] = new int[3][3];
		
		//Declarar, definir o tamanho e inicializar
		int mais_numeros[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		//Declarar uma matriz informando somente as linhas
		int matriz[][] = new int[2][];
		matriz[0] = new int[5];
		matriz[1] = new int[3];
		
		int nova_matriz[][] = { {1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11} };
	}
}
