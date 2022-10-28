package com.udemy.java.secao20;

import com.udemy.java.secao11.Cliente;
import com.udemy.java.secao11.Conta;

//Seção 20 - Threads em Java
//Aula 04 - Synchronized

//Por padrão as threads não são sincronizadas. Podem ocorrer problemas,
//como uma thread acessar o valor de um objeto que ainda não foi atualizado
//ou ainda as threads executarem depois do valor já estar impresso.

//O sincronismo ocorre, pois durante a execução do método, a thread executa um lock
//da função para que a outra thread possa executá-la, após a execução da thread inicial.

/*
//Thread Dessincronizada
public class Secao20Aula04 {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		RealizaDeposito acao = new RealizaDeposito(c1);
		
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(c1);
		
	}

}
*/

//Thread Sincronizada
public class Secao20Aula04 {

	public static void main(String[] args) throws InterruptedException {
		
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		RealizaDeposito acao = new RealizaDeposito(c1);
		
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join(); //Avisando que a thread t1 deve se juntar a um sincronizador.
		t2.join(); //Avisando que a thread t2 deve se juntar a um sincronizador.
		
		System.out.println(c1);
		
	}

}
