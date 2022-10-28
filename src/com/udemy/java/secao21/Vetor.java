package com.udemy.java.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	public void adiciona(Aluno aluno) {
		this.garantirEspaco();
		this.alunos[total] = aluno;
		total = total + 1;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for(int i = total - 1; i >= posicao; i-=1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		total--;
	}
	
	public boolean contem(Aluno aluno) {
		for(int i = 0; i < total; i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.total;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.alunos); //Facilita a visualização do array
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}
	
	private void garantirEspaco() {
		//Verifica se o Array Alunos está cheio
		if(total == alunos.length) {
			//Caso esteja cheio, cria um novo Array com o dobro do tamanho
			Aluno novoArray[] = new Aluno[alunos.length*2];
			//Copia os dados do Array anterior para o novo Array
			for(int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			//Por último, atribuímos o novo array ao array original (substituindo);
			this.alunos = novoArray;
		}
	}
}
