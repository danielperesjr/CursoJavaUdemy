package com.udemy.java.secao24;

import java.util.Random;

//Seção 24 - Projeto Java 1 Game
//Aula 03 - Criando o model

public class Calcular {
	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;
	
	
	public Calcular(int dificuldade) {
		
		Random rand = new Random();
		
		this.operacao = rand.nextInt(3); // 0 - somar, 1 - subtrair, 2 - multiplicar
		this.dificuldade = dificuldade;
		
		if(dificuldade == 1) {
			//Fácil
			this.valor1 = rand.nextInt(10);
			this.valor2 = rand.nextInt(10);
		}else if(dificuldade == 2) {
			//Médio
			this.valor1 = rand.nextInt(100);
			this.valor2 = rand.nextInt(100);
		}else if(dificuldade == 3) {
			//Difícil
			this.valor1 = rand.nextInt(1000);
			this.valor2 = rand.nextInt(1000);
		}else if(dificuldade == 4 ) {
			//Muito Difícil
			this.valor1 = rand.nextInt(10000);
			this.valor2 = rand.nextInt(10000);
		}else {
			//Insano
			this.valor1 = rand.nextInt(100000);
			this.valor2 = rand.nextInt(100000);
		}
		
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}
	
	public int getValor2() {
		return valor2;
	}
	
	public int getOperacao() {
		return operacao;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public String toString() {
		String op;
		if(this.getOperacao() == 0) {
			op = "Somar";
		}else if(this.getOperacao() == 1) {
			op = "Subtrair";
		}else if(this.getOperacao() == 2) {
			op = "Multiplicar";
		}else {
			op = "Operação Desconhecida";
		}
		return 
				"Valor 1: " + this.getValor1() +
				"\nValor 2: " + this.getValor2() +
				"\nDificuldade: " + this.getDificuldade() +
				"\nOperação: " + op;
	}
	
	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		}else {
			System.out.println("Resposta errada!");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	public boolean subtrair(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		}else {
			System.out.println("Resposta errada!");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
	
	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean certo = false;
		
		if(resposta == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		}else {
			System.out.println("Resposta errada!");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
}
