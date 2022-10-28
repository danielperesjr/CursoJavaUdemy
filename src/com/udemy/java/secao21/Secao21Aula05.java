package com.udemy.java.secao21;

import java.util.Stack;

//Seção 21 - Estrutura de Dados em Java
//Aula 05 - Pilhas

//São estruturas de dados onde o elemento que está visível/disponível,
//é o que está sempre no topo.
//Os elementos ao serem adicionados em uma pilha, são adicionados sempre no topo.
//Para remover elementos na pilha, só podemos remover o topo.

//Implementação do Java
public class Secao21Aula05 {
	
	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		System.out.println(nomes);
		nomes.push("Angelina"); // = método insere.
		nomes.push("Felicity"); // = método insere.
		System.out.println(nomes);
		
		String ret = nomes.peek(); //Retorna o elemento do topo.
		System.out.println(ret);
		System.out.println(nomes);
		
		
		String r1 = nomes.pop(); // = método remove.
		System.out.println(r1);
		System.out.println(nomes);
	}
}


/*
public class Secao21Aula05 {
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Angelina");
		System.out.println(pilha);
		
		pilha.insere("Felicity");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha.vazia());
		
	}
}
*/