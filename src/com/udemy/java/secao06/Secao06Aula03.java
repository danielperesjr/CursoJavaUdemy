package com.udemy.java.secao06;

//Seção 06 - Tipos de Dados em Java
//Aula 03 - Tipos Numéricos - Parte 2 (Inteiros e Reais)


public class Secao06Aula03 {

	public static void main(String[] args) {
		
		// Inteiros
		
		// Tipos Primários/Primitivos - comuns da linguagem Java
		long num0 = 99;
		int num1 = 4; // Inteiro - suporta maior alocação em memória
		short num2 = 4; // Inteiro - suporta menor alocação em memória
		byte num3 = 4; // Inteiro - ainda menor que o short
		
		// Tipos Não Primários/Primitivos - classes que representam os tipos primários/primitivos - geralmente são utilizados para conversão
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Long num7 = (long)999999999; // CAST
		
		System.out.println("long	->	Num0 = " + num0);
		System.out.println("int	->	Num1 = " + num1);
		System.out.println("short	->	Num2 = " + num2);
		System.out.println("byte	->	Num3 = " + num3);
		System.out.println("Integer ->	Num4 = " + num4);
		System.out.println("Short	->	Num5 = " + num5);
		System.out.println("Byte	->	Num6 = " + num6);
		System.out.println("Long	->	Num7 = " + num7);
		
		// Espaço em memória ocupado pelos tipos primitivos acessado pelos tipos não primitivos
		System.out.println("long/Long: " + Long.SIZE + " bits");
		System.out.println("int/Integer: " + Integer.SIZE + " bits");
		System.out.println("short/Short: " + Short.SIZE + " bits");
		System.out.println("byte/Byte: " + Byte.SIZE + " bits");
		
		// Valores Min. e Máx. suportados pelos tipos primitivos acessados pelos tipos não primitivos
		System.out.println("Valor Min. do long/Long: " + Long.MIN_VALUE);
		System.out.println("Valor Máx. do long/Long: " + Long.MAX_VALUE);
		System.out.println("Valor Min. do int/Integer: " + Integer.MIN_VALUE);
		System.out.println("Valor Máx. do int/Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor Min. do short/Short: " + Short.MIN_VALUE);
		System.out.println("Valor Máx. do short/Short: " + Short.MAX_VALUE);
		System.out.println("Valor Min. do byte/Byte: " + Byte.MIN_VALUE);
		System.out.println("Valor Máx. do byte/Byte: " + Byte.MAX_VALUE);
		
		
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
		
		
		// Espaço em memória ocupado pelos tipos primitivos acessado pelos tipos não primitivos
		System.out.println("float/Float: " + Float.SIZE + " bits");
		System.out.println("double/Double: " + Double.SIZE + " bits");
		
		// Valores Min. e Máx. suportados pelos tipos primitivos acessados pelos tipos não primitivos
		System.out.println("Valor Min. do float/Float: " + Float.MIN_VALUE);
		System.out.println("Valor Máx. do float/Float: " + Float.MAX_VALUE);
		System.out.println("Valor Min. do double/Double: " + Double.MIN_VALUE);
		System.out.println("Valor Máx. do double/Double: " + Double.MAX_VALUE);
		
	}

}
