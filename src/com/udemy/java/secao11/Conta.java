package com.udemy.java.secao11;

public class Conta {
	int numero;
	private float saldo;
	private float limite;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso.");
		}else if(valor <= (this.saldo + this.limite)) {
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso.");
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	/**
	 * Método para realizar depósito
	 * 
	 * @param valor a ser depositado
	 */
//	//Forma 1 - Sincronismo de Thread
//	public void depositar(float valor) {
//		synchronized (this) {
//			this.saldo = this.saldo + valor;
//		}
//	}
	
	//Forma 2 - Sincronismo de Thread
	public synchronized void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	/**
	 * Método getter do atributo saldo
	 * 
	 * @return a soma do saldo + limite
	 */
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta é " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}else {
			Conta verificar = (Conta) obj; //Cast
			return verificar.getSaldo() == this.getSaldo();
		}
	}
}
