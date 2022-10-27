package com.udemy.java.secao09;

//Seção 09 - Orientação a Objetos
//Aula 06 - Objetos

//Objetos são produtos/instâncias da classe;


public class Secao09Aula06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numero = 4;
		
		//Declaração do objeto
		Produto p0;
		
		//Declaração e instância/inicialização do objeto
		//p1 é a instância da classe Produto ou o objeto
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("============== Produtos ==============");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + "%");

		p0 = new Produto();
		p0.nome = "Caneta BIC";
		p0.preco = 2.45f;
		p0.desconto = 5;
		
		System.out.println(p0.nome);
		System.out.println("R$ " + p0.preco);
		System.out.println(p0.desconto + "%");
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "angelina@gmail.com";
		pessoa1.ano_nascimento = 1976;
		
		System.out.println("============== Pessoas ==============");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);
		
	}

}
