package com.udemy.java.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Seção 22 - Recursos Avançados
//Aula 03 - Classes Anônimas

//Classes Anônimas são classes sem nome, que podem ser criadas a partir da implementação de métodos contidos em interfaces.

//Geralmente são utilizadas quando há interfaces com um ou pouco métodos e não precisamos reaproveitar o código da classe.
//Ou seja, se não será necessário reaproveitar a classe em um outro lugar do sistema e esta classe que deveria ser criada,
//implementaria uma interface com um ou poucos métodos, podemos utilizar o conceito de classe anônima.


public class Secao22Aula03 {
	
	public static void main(String[] args) {
	
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Udemy");
		palavras.add("Curso");
		palavras.add("Online");
		
		palavras.sort(comparador);
		
		palavras.forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}
}

/*
public class Secao22Aula03 {
	
	public static void main(String[] args) {
	
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Udemy");
		palavras.add("Curso");
		palavras.add("Online");
		
		palavras.sort(comparador);
		
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		
		palavras.forEach(consumidor);
		
		
		
	}
}
*/