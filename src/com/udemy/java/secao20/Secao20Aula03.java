package com.udemy.java.secao20;

//Seção 20 - Threads em Java
//Aula 03 - Criando e trabalhando com threads

//Simulação da geração de relatório + barra de progresso
//sem a utilização de threads
/*
public class Secao20Aula03 {

	public static void main(String[] args) {
		
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();

	}

}
*/

public class Secao20Aula03 {

	public static void main(String[] args) {
		
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();
		

	}

}