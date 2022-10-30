package com.udemy.java.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Seção 22 - Recursos Avançados
//Aula 04 - Lambdas

//Disponibilizada a partir do Java 8.

//Expressões lambdas são funções anônimas, ou seja, funções sem nome.
//Podemos utilizar expressões lambdas com interfaces funcionais. Sendo assim, 
//a função lambda deve ser criada com compatibilidade com a interface utilizada.
//Por exemplo:

//A interface consumer possui um método que recebe uma String e não retorna nada. Por isso
//foi possível utilizar a expressão lambda que passa uma String como parâmetro e não retorna nada.

//A função sort, espera receber dois parâmetros do tipo String como entrada e retorna um inteiro.
//Por isso foi possível passar a expressão lambda informando as duas Strings, S1 e S2, e utilizando
//a classe Integer.compare que retorna um inteiro.

//Atalho do Eclipse para identação do código (organização do código) -> CTRL + SHIFT + F

@SuppressWarnings("unused")
public class Secao22Aula04 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Udemy");
		palavras.add("Curso");
		palavras.add("Online");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
		
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);

	}
}

/*
 * public class Secao22Aula04 {
 * 
 * public static void main(String[] args) {
 * 
 * List<String> palavras = new ArrayList<String>();
 * 
 * palavras.add("Geek"); palavras.add("University"); palavras.add("Java");
 * palavras.add("Udemy"); palavras.add("Curso"); palavras.add("Online");
 * 
 * // //Forma 1 // palavras.sort((s1, s2) -> { // if(s1.length() < s2.length())
 * { // return -1; // } // if(s1.length() > s2.length()) { // return 1; // } //
 * return 0; // });
 * 
 * //Forma 2 palavras.sort((s1, s2) -> Integer.compare(s1.length(),
 * s2.length()));
 * 
 * palavras.forEach(s -> System.out.println(s));
 * 
 * } }
 */

/*
 * public class Secao22Aula04 {
 * 
 * public static void main(String[] args) {
 * 
 * List<String> palavras = new ArrayList<String>();
 * 
 * Comparator<String> comparador = new ComparadorPorTamanho();
 * 
 * palavras.add("Geek"); palavras.add("University"); palavras.add("Java");
 * palavras.add("Udemy"); palavras.add("Curso"); palavras.add("Online");
 * 
 * palavras.sort(comparador);
 * 
 * // Expressão Lambda - Forma 1 // palavras.forEach((String s) -> { //
 * System.out.println(s); // });
 * 
 * // Expressão Lambda - Forma 2 palavras.forEach(s -> System.out.println(s));
 * 
 * }
 * 
 * }
 */