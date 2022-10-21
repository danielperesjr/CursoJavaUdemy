package com.udemy.java.secao09;

//Seção 09 - Orientação a Objetos
//Aula 07 - Construtor

//Método especial da classe para construir objetos;
//O construtor de uma classe sempre tem o mesmo nome da classe;
//Por padrão a JVM - Java Virtual Machine - cria em tempo de execução, 
//um construtor vazio na classe (não recebe nenhum parâmetro de entrada);
//Um construtor vazio sempre tem a seguinte forma: public NomeDaClasse() {}
//Podemos ter mais de um construtor na classe (vazio e com parâmetros);

public class Secao09Aula07 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); //Método Construtor Vazio
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		pessoa1.imprime_informacoes();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976); //Método Construtor com Parâmetros
		pessoa2.imprime_informacoes();
		
	}
}
