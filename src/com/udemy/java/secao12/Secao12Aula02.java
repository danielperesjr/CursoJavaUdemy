package com.udemy.java.secao12;

//Seção 12 - Herança e Polimorfismo
//Aula 02 - Herança

//Benefícios da Herança: 
//Evita a repetição de código;
//Facilita a manutenção do programa;
//Quando uma classe possui herança de outra, ela ganha todos os atributos e métodos da classe herdada;

public class Secao12Aula02 {

	public static void main(String[] args) {
	
		//Pessoa p1 = new Pessoa("Pedro da Silva", "pedro@gmail.com", 1987);
		
		//System.out.println(p1.getNome());
		
		Aluno a1 = new Aluno("Vanessa da Silva", "vanessa@gmail.com", 2001, "123456");
		
		System.out.println(a1.getNome());
		
		Professor prof1 = new Professor("Augusto da Silva", "augusto@gmail.com", 1976, "ABC987");
		
		System.out.println(prof1.getNome());

	}

}
