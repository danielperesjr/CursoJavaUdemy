package com.udemy.java.secao15;

//Seção 15 - Atributos e Métodos Estáticos
//Aula 03 - Métodos Estáticos

//Um método estático não depende de uma instância da classe para ser utilizado.
//Pode-se utilizar: NomeDaClasse.metodo();

public class Secao15Aula03 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu cliente");
		System.out.println("Número da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		System.out.println("A próxima conta será: " + Conta.proximaConta());
		
	}

}
