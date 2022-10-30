package com.udemy.java.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Seção 22 - Recursos Avançados
//Aula 06 - Streams

//Streams são fluxos de dados/objetos, utilizados para manipulação dos dados de forma
//mais criteriosa (filtros, etc).

//Quando trabalhamos com Stream, os métodos aplicados a este Stream, não afetam a coleção original.
//Stream + Thread = quando trabalhamos com milhões/bilhões de dados.
//Não é recomendado para quantidade pequena de dados.

@SuppressWarnings("unused")
public class Secao22Aula06 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
//		List<Curso> resultado = cursos.stream()
//				.filter(c -> c.getAlunos() >= 100)
//				.collect(Collectors.toList());
//		
//		resultado.forEach(System.out::println);
		
//		cursos.paralellStream() //O Java transforma a execução em Threads
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));			
	}
}


/*
public class Secao22Aula06 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		
		cursos.stream()
			.filter(c -> c.getAlunos() < 1)
//			.findAny() //Seleciona qualquer um de acordo com o filtro
			.findFirst() //Seleciona o primeiro
			.ifPresent(System.out::println); //Se encontrar algum curso, imprime
	}
}
*/


/*
public class Secao22Aula06 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		
		int soma = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos) //Permite cálculos com o resultado
			.sum();
		System.out.println("A soma de todos os cursos com mais de 100 alunos é: " + soma);

	}
}
*/


/*
public class Secao22Aula06 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		//Classes Anônimas
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos())); //Expressão Lambda
		//cursos.sort(Comparator.comparing(Curso::getAlunos)); //Method Reference
		
		//cursos.forEach(c -> System.out.println(c.getNome())); //Expressão Lambda
		//cursos.forEach(System.out::println); //Method Reference
		
		//Filtro de Cursos com QtAlunos >= 100 
		//cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		//Transformando a coleção de cursos em Stream
		cursos.stream()
			//Aplicando o filtro de cursos com QtAlunos >= 100
			.filter(c -> c.getAlunos() >= 100)
			//Mapeando um tipo de dado para outro
			.map(Curso::getAlunos) //Não permite cálculos com o resultado
			//Imprimindo o resultado
			.forEach(System.out::println);	
	}
}
*/