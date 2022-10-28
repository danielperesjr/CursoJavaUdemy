package com.udemy.java.secao20;

//Para executar métodos em paralelo, nossa clase deve implementar
//a interface Runnable e o método que precisar ser executado em paralelo
//deve ser executado dentro do método run

public class BarraDeProgresso implements Runnable{

//	public void executa() {
//		//For 0..10 milhões
//		for(int i = 0; i < 1000; i++ ) {
//			System.out.println(i + " - Barra de progresso...aguarde");
//		}
//	}

	@Override
	public void run() {
		//For 0..10 milhões
		for(int i = 0; i < 1000; i++ ) {
			System.out.println(i + " - Barra de progresso...aguarde");
		}
	}
}