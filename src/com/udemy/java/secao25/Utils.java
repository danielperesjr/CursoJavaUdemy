package com.udemy.java.secao25;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

//Seção 25 - Projeto Java 2 Mercado
//Aula 03 - Criando um utilitário para o nosso projeto

public class Utils {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	@SuppressWarnings("deprecation")
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
	
	public static String dateParaString(Date data) {
		return Utils.sdf.format(data);
	}
	
	public static String doubleParaString(Double valor) {
		return Utils.nf.format(valor);
	}
	
	public static Double stringParaDouble(String valor) {
		try {
			return (Double)Utils.nf.parse(valor);
		}catch(ParseException erro) {
			return null;
		}
	}
	
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		}catch(InterruptedException erro) {
			System.out.println("Erro ao pausar por " + segundos + " segundos.");
		}
	}
}
