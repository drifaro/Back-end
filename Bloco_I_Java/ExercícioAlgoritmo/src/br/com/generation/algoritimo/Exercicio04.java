package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double A, B, C, D, R, S;
		
		System.out.println("Insira o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Insira o valor de B");
		B = leia.nextInt();
		
		System.out.println("Insira o valor de C:");
		C = leia.nextInt();
		
		R = Math.pow((A+B),2);
		S = Math.pow((B+C),2);
		
		D = (R + S)/2;
		
		System.out.println("O valor de D é: "+D);
		leia.close();
	}

}
