package com.udemy.java.secao14;

//Uma interface pode conter:
//Constantes ('variáveis' que não podem ser alteradas);
//Métodos Abstratos;

//Interface para servir de contrato de produtos eletrônicos;
//Todo produto eletrônico que implementar esta interface, obrigatoriamente,
//deverão implementar os métodos abstratos;
public interface IEletronico {

	public String MARCA = "Geek"; //Constante
	
	public void ligar();
	
	public void desligar();
}
