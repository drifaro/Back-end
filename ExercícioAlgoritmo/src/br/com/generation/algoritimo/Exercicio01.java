package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diaNiver, mesNiver, anoNiver, diaAtual, mesAtual, anoAtual, total;
		
		System.out.println("Insira o dia do seu anivers�rio: ");
		diaNiver = leia.nextInt();
		
		System.out.println("Insira o m�s do seu anivers�rio: ");
		mesNiver = leia.nextInt();
		
		System.out.println("Insira o ano do seu anivers�rio: ");
		anoNiver = leia.nextInt();
		
		System.out.println("Insira o dia atual: ");
		diaAtual = leia.nextInt();
		
		System.out.println("Insira o m�s atual: ");
		mesAtual = leia.nextInt();
		
		System.out.println("Insira o ano atual: ");
		anoAtual = leia.nextInt();
		
		total = ((anoAtual - anoNiver)*365)+((mesAtual*30)+diaAtual)-((mesNiver*30)+diaNiver);
		
		System.out.println("A sua idade em dias �: " +total+" dias.");
		leia.close();
				
	}

}



