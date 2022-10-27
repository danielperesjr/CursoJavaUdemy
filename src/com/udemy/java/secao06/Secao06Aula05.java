package com.udemy.java.secao06;

//Seção 06 - Tipos de Dados em Java
//Aula 05 - Tipos Booleanos

public class Secao06Aula05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Tipos Primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipos Não Primitivos
		Boolean v = true;
		Boolean f = false;
		
		boolean ativo = true;
		
		System.out.println("Verdadeiro: " + verdadeiro);
		System.out.println("Falso: "  + falso);
		System.out.println("V: " + v);
		System.out.println("F: " + f);
		
		if(verdadeiro) {
			System.out.println("É verdadeiro.");
		}else {
			System.out.println("É falso.");
		}
		
		if(1 == 3) {
			System.out.println("1 == 1 é verdadeiro");
		}else {
			System.out.println("...é falso.");
		}
		
		if(ativo) {
			System.out.println("Acesso liberado.");
		}else {
			System.out.println("Acesso negado.");
		}
		
	}

}
