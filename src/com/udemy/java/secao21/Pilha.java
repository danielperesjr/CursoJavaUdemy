package com.udemy.java.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();
	
	/**
	 * Em uma pilha, sempre inserimos elementos no topo.
	 * @param nome
	 * 
	 * Na implementação do Java para pilhas (Stack), este método
	 * chama-se push.
	 */
	
	public void insere(String nome) {
		this.nomes.add(nome);
	}
	
	/**
	 * Em uma pilha, sempre removemos os elementos que estão no topo.
	 * @return
	 * Na implementação do Java para pilhas (Stack), este método
	 * chama-se pop.
	 */
	public String remove() {
		return nomes.remove(nomes.size() - 1);
	}
	
	/**
	 * Na implementação do Java para pilhas (Stack), este método
	 * chama-se peek.
	 * @return
	 */
	public String pegaTopo() {
		return nomes.get(nomes.size() - 1);
	}
	
	public boolean vazia() {
		return nomes.size() == 0;
	}
	
	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
