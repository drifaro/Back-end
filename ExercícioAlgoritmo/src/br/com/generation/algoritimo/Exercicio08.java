package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double fabrica, custoFinal;
		
		System.out.println("Insira o valor do carro: ");
		fabrica = leia.nextDouble();
		
		custoFinal = fabrica*1.73;
		
		System.out.println("O valor do carro para o consumidor é: " + custoFinal);
		leia.close();
		
	}

}
