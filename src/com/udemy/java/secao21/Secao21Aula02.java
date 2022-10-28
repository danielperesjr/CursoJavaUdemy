package com.udemy.java.secao21;

//Seção 21 - Estrutura de Dados em Java
//Aula 02 - Armazenamento Sequencial

//O vetor de inteiros por padrão é iniciado com elementos '0',
//mas se iniciado a partir de uma classe é iniciado com 'null'.

/*
public class Secao21Aula02 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		System.out.println(lista);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		System.out.println(lista.contem(a1));
		
		System.out.println(lista.pega(0));
		
		try {
			System.out.println(lista.pega(99));
		}catch(IllegalArgumentException erro) {
			System.out.println(erro.getMessage());
			System.out.println("O aluno dessa posição não existe.");
		}
		
		Aluno a3 = new Aluno("Maria");
		
		try {
			lista.adiciona(101, a3);
		}catch(IllegalArgumentException erro) {
			System.out.println(erro.getMessage());
			System.out.println("A posição solicitada é inválida!");	
		}
		
		lista.remove(0);
		System.out.println(lista);
		
	}
	
}
*/

public class Secao21Aula02 {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor();
		
		for(int i = 0; i < 200; i++) {
			Aluno a = new Aluno("Maria " + i);
			lista.adiciona(a);
		}
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
	}
}