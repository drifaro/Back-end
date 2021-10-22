package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeDias, ano, mes, dia;
		
		System.out.println("Escreva sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		ano = idadeDias / 365;
		mes =(idadeDias % 365)/ 30;
		dia =(idadeDias%365)%30;
		
		System.out.println("Você tem: "+ano+" anos, "+mes+" meses e "+dia+" dias.");
		leia.close();
		
	}

}
