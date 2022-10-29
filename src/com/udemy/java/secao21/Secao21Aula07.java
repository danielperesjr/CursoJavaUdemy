package com.udemy.java.secao21;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//Seção 21 - Estrutura de Dados em Java
//Aula 07 - Conjuntos

//Uma das características dos conjuntos é a não aceitação de elementos repetidos.

//Criar listas para cada uma das letras do alfabeto melhora a performance dos Conjuntos.

//Implementação de Conjuntos do Java
@SuppressWarnings("unused")
public class Secao21Aula07 {

	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<String>();
		
		System.out.println(nomes);
		
		nomes.add("Angelina");
		nomes.add("Ana");
		nomes.add("Gabriela");
		
		System.out.println(nomes);
		
		String nome1 = "Angelina";
		String nome2 = "Ana";
		String nome3 = "Gabriela";
		
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println("Angelina".hashCode());
		
	}

}

/*
@SuppressWarnings("unused")
public class Secao21Aula07 {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);

		conjunto.adiciona("Angelina");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); //Repetido - não é adicionado
		
		conjunto.remove("Juvenal");
		
		System.out.println(conjunto);
		
	}

}
*/