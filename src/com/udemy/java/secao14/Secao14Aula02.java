package com.udemy.java.secao14;

//Seção 14 - Interfaces
//Aula 02 - O que é e quando usar?

//Interfaces são conhecidas como "contratos".
//Diferentemente das classes abstratas, as interfaces não podem ter métodos implementados, somente abstratos.
//A importação dos métodos é obrigatória;
//Caso utilizada uma constante, por definição, o seu valor não poderá ser alterado;
//Exemplo: Uma empresa criou um contrato 'com regras' para definir a criação de um produto ou serviço.
//Quem implementar este contrato é obrigado a seguir as regras.
//O João decidiu implementar um produto ou serviço baseado neste contrato.
//A Maria também decidiu implementar um produto ou serviço baseado no mesmo contrato.
//Pessoas diferentes implementaram produtos baseados nas mesmas regras, por tanto os produtos são equivalentes.


public class Secao14Aula02 {
	
	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador é: " + IEletronico.MARCA);
		
		vent.desligar();//Não deve imprimir a mensagem
		
		vent.ligar();//Deve imprimir a mensagem
		
		vent.desligar();//Deve imprimir a mensagem
	}
}
