package com.udemy.java.secao21;

import java.util.LinkedList;
import java.util.List;

import com.udemy.java.secao11.Cliente;

//Seção 21 - Estrutura de Dados em Java
//Aula 03 - Listas Ligadas

//Em um vetor os elementos estão um do lado do outro, enquanto em uma lista ligada,
//eles estão ou podem estar em lugares diferentes, porém um aponta para o outro,
//indicando o próximo elemento.

@SuppressWarnings("unused")
public class Secao21Aula03 {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		System.out.println(lista.size());
		
		lista.add("Felicity");
		System.out.println(lista);
		
		lista.add("Angelina");
		System.out.println(lista);
		
		lista.add(0, "Maria");
		System.out.println(lista);
		
		System.out.println(lista.size());
		
	}
}



/*
public class Secao21Aula03 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adiciona("Felicity");
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);
		
	}
}
*/

/*
public class Secao21Aula03 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Angela");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Felicity");
		System.out.println(lista);
		
		lista.adiciona(1, "Xuxa");
		System.out.println(lista);
		
		Object ret = lista.pega(1);
		System.out.println(ret);
		
		System.out.println(lista.tamanho());
		
	}

}
*/

/*
public class Secao21Aula03 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adicionaNoComeco("Maria");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Angelina");
		System.out.println(lista);
		
		lista.adicionaNoComeco("Felicity");
		System.out.println(lista);
		
		String nome = "Pedro";
		lista.adicionaNoComeco(nome);
		System.out.println(lista);
		
		int numero = 42;
		lista.adicionaNoComeco(numero);
		System.out.println(lista);
		
		Cliente cli1 = new Cliente(1, "Juliana Paes", "Rua 3");
		lista.adicionaNoComeco(cli1);
		System.out.println(lista);

	}

}
*/