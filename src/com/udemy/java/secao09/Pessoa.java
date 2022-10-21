package com.udemy.java.secao09;

//Seção 09 - Orientação a Objetos
//Aula 03 - Classes

//O nome das classes inicia com letra maiúscula;
//O nome não deve conter acentuação, caracteres especiais e espaçamento
//Nas classes Java, não existe a implementação da função main, pois a tornaria um programa e não uma classe;
//Toda classe Java possui a seguinte forma: public class NomeDaClasse {}
//O nome da classe Java deve ser o mesmo nome do arquivo Java;
//Tudo o que estiver dentro das "{}" faz parte da classe;

//Aula 04 - Atributos

//Características das classes/moldes/modelos de dados;
//Podemos entender atributos como variáveis da classe, mas nunca devemos chamá-los de variáveis;
//Uma outra forma de nomenclatura para os atributos são os estados;
//O nome dos atributos inicia com letra minúscula;
//O nome não deve conter acentuação, caracteres especiais e espaçamento;
//Os atributos podem ser de qualquer tipo de dado, incluindo arrays;

//Aula 05 - Métodos

//Podemos entender os métodos como a ação que é realizada por um objeto da classe;
//Podemos entender também que os métodos são comportamentos dos objetos da classe;
//Tipo de retorno (tipo de dado que o método vai retornar);
//Nome correspondente a ação que o método realiza;
//Parâmetros/Argumentos de entrada (opcional);
//Retorno (opcional - depende do tipo de retorno);
//Diferença entre Função e Método: o método depende de uma classe enquanto que a função não;

//Aula 07 - Construtor

//Método especial da classe para construir objetos;
//O construtor de uma classe sempre tem o mesmo nome da classe;
//Por padrão a JVM - Java Virtual Machine - cria em tempo de execução, 
//um construtor vazio na classe (não recebe nenhum parâmetro de entrada);
//Um construtor vazio sempre tem a seguinte forma: public NomeDaClasse() {}
//Podemos ter mais de um construtor na classe (vazio e com parâmetros);


public class Pessoa {
	String nome, email;
	int ano_nascimento;
	
	//Construtor Vazio
	public Pessoa() {
		
	}
	
	//Construtor com Parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		//This == Este Objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de Nascimento: " + this.ano_nascimento);
	}
	
}
