package com.udemy.java.secao15;

//Seção 15 - Atributos e Métodos Estáticos
//Aula 02 - Atributos Estáticos

//São atributos onde os valores são compartilhados entre as instâncias da classe.
//Para acessar um atributo estático, colocamos o nome da classe junto ao atributo.
//Exemplo: Conta.contador;

public class Secao15Aula02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Angelina Jolie");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Felicity Jones");
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Maria da Graça");
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println(c1.contador); //Não é a forma correta de acessar um atributo estático
		System.out.println(c2.contador); //Não é a forma correta de acessar um atributo estático
		System.out.println(c3.contador); //Não é a forma correta de acessar um atributo estático
		System.out.println(Conta.contador);

	}

}
