package com.udemy.java.secao20;

import com.udemy.java.secao11.Conta;

public class RealizaDeposito implements Runnable{
	private Conta conta;
	
	public RealizaDeposito(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.depositar(100.0f);
	}
	
}
