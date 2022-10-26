package com.udemy.java.secao13;

//Seção 13 - Classes Abstratas
//Aula 03 - Template Method

//O padrão Template Method define o esqueleto de um algoritmo dentro de um método,
//transferindo alguns de seus passos para as subclasses. 
//O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar
//a estrutura do próprio algoritmo.
//O algoritmo é dividido em pequenos passos e esses passos são executados em funções e métodos específicos;

public class Secao13Aula03 {
	
	public static void main(String[] args) {
	
		TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimTemporada tft = new TreinamentoFimTemporada();
		
		tft.treinoDiario();
		
	}
}
