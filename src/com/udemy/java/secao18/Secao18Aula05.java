package com.udemy.java.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

//Seção 18 - Conhecendo a Java Lang
//Aula 05 - Leitura e Escrita em Arquivos

//Escrevendo em arquivos
//public class Secao18Aula05 {
//
//	public static void main(String[] args) {
//		
//		Scanner teclado = new Scanner(System.in);
//		
//		try {
//			//Desta forma toda vez que o programa for executado, o arquivo será substituído,
//			//fazendo com que o conteúdo armazenado seja perdido.
//			PrintStream escrever = new PrintStream("saida.txt");
//			
//			for(int i = 0; i < 5; i++) {
//				System.out.println("Escreva algo: ");
//				String msg = teclado.nextLine();
//				escrever.println(msg);
//			}
//			escrever.close();
//			
//		}catch(FileNotFoundException erro) {
//			System.out.println("Não foi possível criar o arquivo.");
//		}
//		
//		teclado.close();
//		
//		
//	}
//	
//}


//Escrevendo em arquivos - Caso exista um arquivo com o mesmo nome, 
//abre o arquivo e escreve a partir da última linha. Caso não exista, cria o arquivo.
@SuppressWarnings("unused")
public class Secao18Aula05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {

			PrintStream escrever = new PrintStream(new FileOutputStream("saida-2.txt", true));
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
			escrever.close();
			
		}catch(FileNotFoundException erro) {
			System.out.println("Não foi possível criar o arquivo.");
		}
		
		teclado.close();
		
		
	}
	
}


//Lendo arquivos
//public class Secao18Aula05 {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			Scanner ler = new Scanner(new FileInputStream("entrada.txt"));
//			
//			while(ler.hasNextLine()) {
//				String linha = ler.nextLine();
//				System.out.println(linha);
//			}
//			ler.close();
//		}catch(FileNotFoundException erro) {
//			System.out.println("Arquivo não encontrado.");
//		}
//
//	}
//	
//}