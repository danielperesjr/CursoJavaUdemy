package com.udemy.java.secao18;

import com.udemy.java.secao11.Cliente;
import com.udemy.java.secao11.Conta;

//Seção 18 - Conhecendo a Java Lang
//Aula 02 - Object: A mãe de todas as classes

//A classe Object faz parte do pacote java.lang

public class Secao18Aula02 {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente(18, "Angelina Jolie", "Rua da Paz, 1234");
		Cliente cli2 = new Cliente(19, "Felicity Jones", "Rua da 2, 5678");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 200, 300, cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1); //Por padrão a instância imprime com toString()
		System.out.println(c2); //Por padrão a instância imprime com toString()

		
		if(c1.equals(c2)) {
			System.out.println("São a mesma conta");
		}else {
			System.out.println("São contas diferentes");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); //Cast
		
		prateleira.adicionar(cli1);
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome()); //Cast
		
		if((Object)cli1 instanceof Conta) {
			System.out.println("O objeto é do tipo Conta.");
		}else {
			System.out.println("O objeto não é do tipo Conta.");
		}
		
	}

}
