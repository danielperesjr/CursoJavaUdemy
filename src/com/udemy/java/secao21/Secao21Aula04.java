package com.udemy.java.secao21;

//Seção 21 - Estrutura de Dados em Java
//Aula 04 - Listas Duplamente Ligadas

public class Secao21Aula04 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.contem("Angelina"));

	}

}