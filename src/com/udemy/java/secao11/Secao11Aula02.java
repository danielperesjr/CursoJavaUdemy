package com.udemy.java.secao11;

//Seção 11 - Modificadores de Acesso
//Aula 02 - O que é o encapsulamento?

//Getters e Setters
//Getter é um método público que serve para consultar dados;
//A nomenclatura desses métodos é getNome_do_atributo();
//O encapsulamento é a proteção adicionada nos atributos para que não seja realizado nenhum acesso,
//que não esteja condizente com o que deveria ocorrer no programa (exemplo: hard code para alterar saldo);

public class Secao11Aula02 {

	public static void main(String[] args) {
		Cliente joao = new Cliente(33, "João da Silva", "Rua da Paz, 45");
		Cliente maria = new Cliente(27, "Maria da Silva", "Rua da Paz, 45");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo do João (antes do saque): " + conta_joao.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(300);
		System.out.println("Saldo do João (depois do saque): " + conta_joao.getSaldo());
	}
}
