package com.udemy.java.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.udemy.java.secao11.Cliente;

//Seção 19 - Collections
//Aula 02 - Listas

/*

 Histórico:
 
 Arrays(Vetores e Matrizes)
 
 - Um array tem tamanho fixo, ou seja, se criarmos um array com 5 elementos,
 ele sempre possuíra no máximo 5 elementos;
 
 - Um array tem tipo de dado fixo, ou seja, se criarmos um array de inteiros,
 ele só poderá receber elementos do tipo inteiros;
 
 - É difícil de encontrar um determinado elemento em um array. Precisamos para isso
 varrer todo o array através do seu índice, caso a busca não seja realizada desde o início
 pelo índice.
  
*/

/*
 
 Collections: 
 
 - O Java possui diversas classes/interfaces que facilitam muito o trabalho quando se trata de coleções de dados.
 Essas classes/interfaces são chamadas de Collections.
 
*/

/*
 
  Listas:
 
 - Aceitam repetição de valores;
 - Possuem tamanho 'infinito', dependendo apenas da memória disponível;
 - Podemos adicionar valores de qualquer tipo, desde que o tipo não seja especificado
 na declaração; 
 
*/

//Lista de Strings
/*
public class Secao19Aula02 {

	public static void main(String[] args) {
		
//		ArrayList nomes = new ArrayList(); //Sem definir o tipo de dado, pode ser adicionado qualquer tipo.
		ArrayList<String> nomes = new ArrayList<String>(); //Foi definido o tipo String.
		
		nomes.add("Maria");		//[0]
		nomes.add("Felicity");
		nomes.add("Angelina");	//[2]
		nomes.add("Geek");		
		nomes.add("Maria");		//[4]
		nomes.add("Angelina");	//[5]
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
		
//		System.out.println(nomes.size());
		
//		for(int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
//		for(Object nome : nomes) {
//			System.out.println(nome);
//		}
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}

	}

}
*/

/*
//Lista de Inteiros
public class Secao19Aula02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(42);
		numeros.add(24);
		numeros.add(12);
		numeros.add(2);
		numeros.add(91);
		
//		System.out.println(numeros.get(0));
		
		Collections.sort(numeros);
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		
	}
	
}
*/

//Lista de Objetos
public class Secao19Aula02 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(43, "Maria da Silva", "Rua 1");
		Cliente cli2 = new Cliente(12, "Felicity Jones", "Rua 2");
		Cliente cli3 = new Cliente(45, "Angelina Jolie", "Rua 3");
		
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente: clientes) {
			System.out.println(cliente);
		}
		
		
	}
	
}