package com.udemy.java.secao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}
	
	public void adiciona(String nome) {
		if(!contem(nome)) {
			//Calculando o índice do nome
			int indice = calculaIndice(nome);
			//Pegando a lista de acordo com o índice
			List<String> lista = tabela.get(indice);
			//Adiciona o nome na lista correta
			lista.add(nome);
		}
	}
	
	private boolean contem(String nome) {
		//Calculando o índice do nome
		int indice = calculaIndice(nome);
		//Buscando na tabela específica do índice o nome
		return tabela.get(indice).contains(nome);
	}
	
	public void remove(String nome) {
		//Verifica se o nome existe em alguma lista
		if(contem(nome)) {
			//Calculamos o índice do nome
			int indice = calculaIndice(nome);
			//Pegamos a lista específica do nome
			List<String> lista = tabela.get(indice);
			//Removemos o nome da lista
			lista.remove(nome);
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}

}
