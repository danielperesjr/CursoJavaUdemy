package com.udemy.java.secao13;

import com.udemy.java.secao12.Aluno;

//Seção 13 - Classes Abstratas
//Aula 02 - O que é e quando usar?

//É um recurso que proporciona um bloqueio na criação de objetos;
//Não é possível instanciar objetos de uma classe abstrata;
//Geralmente as classes abstratas são super-classes de outras classes;
//Uma classe abstrata pode ter:
//Atributos, métodos e 
//Métodos abstratos são métodos que não possuem implementação, possuem apenas declaração e obrigatoriamente 
//as classes que herdarem desta classe com método abstrato, precisam implementar estes métodos.

public class Secao13Aula02 {
	
	public static void main(String[] args) {
		
		Aluno maria = new Aluno("Maria da Silva", "maria@gmail.com", 1999, "123456");
		
		System.out.println(maria);
		
		maria.outra_mensagem("Meu nome é: " + maria.getNome());
		
	}
}
