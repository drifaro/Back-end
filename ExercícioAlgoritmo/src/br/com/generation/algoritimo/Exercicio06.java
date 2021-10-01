package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, D;
		
		System.out.println("lnInsira o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("lnInsira o valor de x2:");
		x2 = leia.nextDouble();
		
		System.out.println("lnInsira o valor de y1:");
		y1 = leia.nextDouble();
		
		System.out.println("lnInsira o valor de y2:");
		y2 = leia.nextDouble();
		
		
		D =Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("O valor de D é:" +D);
		leia.close();
	
	}

}
