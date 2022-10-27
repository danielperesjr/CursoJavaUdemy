package com.udemy.java.secao11;

//Seção 11 - Modificadores de Acesso
//Aula 04 - Private

//Público,  acessível por todo o projeto.
//Privado à própria classe, ou seja, só temos acesso ao método ou atributo privado dentro da própria classe onde foi declarado.
//Protegido, só temos acesso ao método ou atributo dentro do mesmo pacote onde foi declarado.

public class Secao11Aula04 {
	public static void main(String[] args) {
	
		Cliente cli1 = new Cliente(24, "Felicity Jones", "Rua Qualquer, 123");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		
		Cliente cli2 = new Cliente(47, "Angelina Jolie", "Rua Qualquer, 1234");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
		
	}
}
