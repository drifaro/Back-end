package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double N1, N2, N3, media;
		
		System.out.println("Insira a 1ª nota:");
		N1 = leia.nextDouble();
		
		System.out.println("Insira a 2ª nota:");
		N2 = leia.nextDouble();
		
		System.out.println("Insira a 3ª nota:");
		N3 = leia.nextDouble();
		
		media = ((N1*2)+(N2*3)+(N3*5))/10;
		
		System.out.println("A média é:" + media);
		leia.close();
				
	}

}
