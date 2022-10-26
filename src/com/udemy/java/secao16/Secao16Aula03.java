package com.udemy.java.secao16;

import java.util.Scanner;

//Seção 16 - Tratamento de Erros
//Aula 03 - Utilizando o Finally

//O finally é executado independente se houve uma exceção ou não;

public class Secao16Aula03 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número para divisão: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número para divisão: ");
		int num2 = teclado.nextInt();
		
		try {
			System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1/num2);
		}catch(ArithmeticException erro) {
			System.out.println("Não é possível dividir " + num1 + " por " + num2);
		}finally {
			System.out.println("Continua o processo...");
		}
		
		teclado.close();
	}
}