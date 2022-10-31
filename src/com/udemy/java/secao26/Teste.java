package com.udemy.java.secao26;

//Seção 26 - Projeto Java 3 Banco
//Aula 05 - Testando o model criado

public class Teste {

	public static void main(String[] args) {
		
		Cliente felicity = new Cliente("Felicity Jones", "felicity@gmail.com", "123.456.789-00", Utils.stringParaData("17/05/1981"));
		Cliente angelina = new Cliente("Angelina Jolie", "angelina@gmail.com", "012.345.678-90", Utils.stringParaData("03/02/1978"));
		
//		System.out.println(felicity);
//		System.out.println();
//		System.out.println(angelina);
		
		Conta c101 = new Conta(felicity);
		Conta c102 = new Conta(angelina);
		
		//Depositando um valor positivo
		c101.depositar(500.00);
		c102.depositar(500.00);
		
		//Depositando um valor zerado
//		c101.depositar(0.00);
//		c102.depositar(0.00);
		
		//Depositando um valor negativo
//		c101.depositar(-500.00);
//		c102.depositar(-500.00);
		
		//Sacando valor no saldo suficiente
//		c101.sacar(300.00);
//		c102.sacar(300.00);
		
		//Sacando valor zerado
//		c101.sacar(0.00);
//		c102.sacar(0.00);
		
		//Sacando valor negativo
//		c101.sacar(-100.00);
//		c102.sacar(-100.00);
		
		//Definindo um valor de limite
		c101.setLimite(200.00);
		c102.setLimite(200.00);
		
		//Sacando valor maior que o saldo
//		c101.sacar(600.00);
//		c102.sacar(600.00);
		
		//Transferindo de uma conta para a outra
		c101.transferir(c102, 100.00);		
		
		System.out.println(c101);
		System.out.println();
		System.out.println(c102);
		
	}

}
