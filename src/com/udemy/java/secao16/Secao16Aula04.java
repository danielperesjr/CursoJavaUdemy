package com.udemy.java.secao16;

import java.util.Scanner;

//Seção 16 - Tratamento de Erros
//Aula 04 - Entendendo a Execução

/*
Quando falamos em exceções no Java, temos que compreender da seguinte forma:

Existem dois grupos de exceções.

Checked Exceptions - Menos Perigosas

As exceções do tipo "checadas" fazem com que o programa não seja executado, até que a determina exceção seja tratada (com try/cath).

- Exception (engloba todas as outras exceções)
- IOException
- SQLException


Unchecked Exceptions - Mais Perigosas

As exceções do tipo "não checadas" só ocorrem durante a execução do programa e desta forma não temos como saber em grande parte dos casos
onde ela poderá ocorrer.

- RuntimeException
- NullPointerException
- ArrayOutOfBoundsException
*/

public class Secao16Aula04 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número para divisão: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número para divisão: ");
		int n2 = teclado.nextInt();
		
		try {
			System.out.println("A divisão de " + n1 + " por " + n2 + " é " + divisao(n1, n2));
		}catch(Exception erro) {
			System.out.println("Ocorreu uma exceção.");
		}
		
		teclado.close();
	}
	
	//Função que avisa sobre a possibilidade de ocorrer uma exceção do tipo Exception
	public static int divisao(int n1, int n2) throws Exception {
		return n1 / n2;
	}
	
}