package com.udemy.java.secao21;

import java.util.LinkedList;
import java.util.Queue;

//Seção 21 - Estrutura de Dados em Java
//Aula 06 - Filas

//Todo elemento entra no final da fila.
//O primeiro elemento a entrar é também o primeiro a sair.

//Fila -> Implementação do Java
public class Secao21Aula06 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println(fila);
		
		fila.add("Angelina"); // = método adiciona.
		fila.add("Maria"); // = método adiciona.
		fila.add("Felicity"); // = método adiciona.
		
		System.out.println(fila);
		
		String ret = fila.poll(); // = método remove.
		System.out.println(ret);
		
		System.out.println(fila);
		
	}

}


/*
public class Secao21Aula06 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("Angelina");
		fila.adiciona("Felicity");
		fila.adiciona("Maria");
		
		System.out.println(fila);
		
		String ret = fila.remove();
		System.out.println(ret);
		System.out.println(fila);
		
		fila.remove();
		fila.remove();
		fila.remove();
		
		System.out.println(fila.vazia());
		
	}

}
*/