package com.udemy.java.secao19;

import java.util.HashMap;
import java.util.Map;

import com.udemy.java.secao11.Cliente;
import com.udemy.java.secao11.Conta;

//Seção 19 - Collections
//Aula 04 - HashMap

//A classe HashMap implementa a interface Map e trabalha com o conceito de chave/valor.
//Não aceita chaves duplicadas, mas valores sim;
//HashMap é o mapeamento de chave e valor;

public class Secao19Aula04 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(24, "Angelina Jolie", "Rua 1");
		Cliente cli2 = new Cliente(34, "Felicity Jones", "Rua 2");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 400, 700, cli2);
		
		contas.put("Pessoa Física", c1);
		contas.put("Pessoa Jurídica", c2);
		contas.put("Pessoa jurídica", c2);
		
		System.out.println(contas.size());
		
		System.out.println(contas.get("Pessoa Física"));

	}

}
