package com.udemy.java.secao12;

//Seção 12 - Herança e Polimorfismo
//Aula 03 - Polimorfismo

//Objetos do mesmo tipo podem agir de formas diferentes (muitas formas).

public class Secao12Aula03 {

	public static void main(String[] args) {
	
		//Pessoa p1 = new Pessoa("Pedro da Silva", "pedro@gmail.com", 1987);
		
		//System.out.println(p1);
		//System.out.println(p1.getNome());
		//System.out.println("\n");
		
		Aluno a1 = new Aluno("Vanessa da Silva", "vanessa@gmail.com", 2001, "123456");
		
		System.out.println(a1);
		System.out.println(a1.getNome());
		System.out.println("\n");
		
		Professor prof1 = new Professor("Augusto da Silva", "augusto@gmail.com", 1976, "ABC987");
		
		System.out.println(prof1);
		System.out.println(prof1.getNome());

	}

}
