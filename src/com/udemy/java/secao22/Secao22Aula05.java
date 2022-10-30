package com.udemy.java.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//Seção 22 - Recursos Avançados
//Aula 05 - Method References

//Podem ser consideradas simplificações das expressões lambdas.

@SuppressWarnings("unused")
public class Secao22Aula05 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Udemy");
		palavras.add("Curso");
		palavras.add("Online");
		
		//Expressão Lambda
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Method Reference - Forma 2
		palavras.sort(Comparator.comparing(String::length));
		
		//Method Reference - Forma 2
//		Function<String, Integer> tamanho = s -> s.length(); //Expressão Lambda
//		Function<String, Integer> tamanho = String::length; //Method Reference
//		Comparator<String> comparador = Comparator.comparing(tamanho);
//		palavras.sort(comparador);
		
		palavras.forEach(s -> System.out.println(s)); //Expressão Lambda
		palavras.forEach(System.out::println); //Method Reference
	}
}