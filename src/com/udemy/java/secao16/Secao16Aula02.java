package com.udemy.java.secao16;

import java.util.Scanner;

//Seção 16 - Tratamento de Erros
//Aula 02 - Tratando exceções com Try/Catch

//Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que pode
//acarretar em um problema.

//Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema
//uma mensagem adequada sem que o sistema quebre.

/*
public class Secao16Aula02 {

	public static void main(String[] args) {
		int numeros [] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (i + 3) * 2;
		}
		
		for(int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			}catch(ArrayIndexOutOfBoundsException erro) {
				System.out.println("Você está tentando acessar uma posição do array que não existe...");
			}
			
		}

	}

}
*/

public class Secao16Aula02 {
	
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
		}
		
		teclado.close();
	}
}
