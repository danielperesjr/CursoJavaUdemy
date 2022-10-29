package com.udemy.java.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Seção 22 - Recursos Avançados
//Aula 02 - Default Methods

//Implementado a partir da versão 8 do Java.

//São métodos concretos implementados em interfaces.
//Estes métodos como são concretos, ou seja, já possuem implementação,
//não precisam ser implementados nas classes que implementarem essa interface.


@SuppressWarnings("unused")
public class Secao22Aula02 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		System.out.println(palavras);
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Udemy");
		palavras.add("Curso");
		palavras.add("Online");
		
		palavras.forEach(consumidor);
		
	}

}


/*
@SuppressWarnings("unused")
public class Secao22Aula02 {

	public static void main(String[] args) {
		ITeste t = new MinhaClasse();
		
		System.out.println(t.mensagem());
		t.menu_metodo();

	}

}
*/

/*
public class Secao22Aula02 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Udemy");
		palavras.add("Curso");
		palavras.add("Online");
		
		
//		Collections.sort(palavras);
//		System.out.println(palavras);
//		
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);
		
		palavras.sort(comparador);
		System.out.println(palavras);

	}

}
*/