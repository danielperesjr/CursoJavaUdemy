package com.udemy.java.secao06;

//Seção 06 - Tipos de Dados em Java
//Aula 02 - Tipos Numéricos - Parte 1 (Inteiros e Reais)


public class Secao06Aula02 {

	public static void main(String[] args) {
		
		// Inteiros
		
		// Tipos Primários/Primitivos - comuns da linguagem Java
		int num1 = 4; // Inteiro - suporta maior alocação em memória
		short num2 = 4; // Inteiro - suporta menor alocação em memória
		
		// Tipos Não Primários/Primitivos - classes que representam os tipos primários/primitivos - geralmente são utilizados para conversão
		Integer num3 = 98;
		Short num4 = 7;
		
		System.out.println("int	->	Num1 = " + num1);
		System.out.println("short	->	Num2 = " + num2);
		System.out.println("Integer ->	Num3 = " + num3);
		System.out.println("Short	->	Num4 = " + num4);
		
		
		// Reais
		
		// Tipos Primários/Primitivos - comuns da linguagem Java
		// Por padrão os números reais/ponto fluante em Java são considerados "double"
		float preco = 23.4f; // Real - suporta menor alocação em memória
		double preco2 = 23.4; // Real - suporta maior alocação em memória
		
		// Tipos Não Primários/Primitivos - classes que representam os tipos primários/primitivos - geralmente são utilizados para conversão
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float	->	Preco = " + preco);
		System.out.println("double	->	Preco2 = " + preco2);
		System.out.println("Float	->	Preco3 = " + preco3);
		System.out.println("Double	->	Preco4 = " + preco4);
		
	}

}
