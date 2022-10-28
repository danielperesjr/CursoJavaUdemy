package com.udemy.java.secao19;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Seção 19 - Collections
//Aula 03 - Conjuntos

//Os conjuntos são implementados com a interface Set e uma das classes que implementam essa interface é a HashSet.
//A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com as listas,
//mas o comportamentos desses objetos é um pouco diferente.
//A performance também é superior nos conjuntos em relação às listas.

//Características:
//Não aceitam valores repetidos;
//A ordem de inserção não é respeitada (realiza uma semi-ordenação);
//Não aceita ordenação;
//Não possui índice;

@SuppressWarnings("unused")
public class Secao19Aula03 {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome não pode ser repetido!");
				i--;
			}

		}
		
		System.out.println("No conjunto nomes temos: " + nomes.size() + " elementos.");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
		
		
//		nomes.add("Maria"); //0
//		nomes.add("Felicity"); //1
//		nomes.add("Angelina"); //2
//		nomes.add("Geek"); //3
//		nomes.add("Felicity"); //Conjuntos não aceitam repetição de valores e realizam uma ordenação automática.
		
//		System.out.println(nomes.size());
		
//		System.out.println(nomes.contains("Felicity"));

//		System.out.println(nomes.add("Geek"));
		
//		for(String nome : nomes) {
//			System.out.println(nome);
//		}
		
	}
	
}
