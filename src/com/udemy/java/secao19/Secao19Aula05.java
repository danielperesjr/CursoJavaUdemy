package com.udemy.java.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Seção 19 - Collections
//Aula 05 - Mapas

//Os Mapas são representados em Java pela interface Map e mapeia os seus elementos
//utilizando os conceitos de chave/valor.
//Mapas são conhecidos como se representassem 3 coleções:
//Coleção de chaves;
//Coleção de valores;
//Coleção de associações;

public class Secao19Aula05 {
	
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Coleção de Chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Coleção de Valores
		System.out.println("Valores: " + pessoas.values());
		
		//Coleção de Associações
		System.out.println("Associações: " + pessoas.entrySet());
		
		//Iterar na coleção de chaves
		
		//Forma 1
		//Disponibilizado a partir do Java 8
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		//Forma 2
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		
		//Iterar na coleção de valores

		//Forma 1
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		//Forma 2
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//Iterar a coleção de associações
		
		//Forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma 2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
	}
}
