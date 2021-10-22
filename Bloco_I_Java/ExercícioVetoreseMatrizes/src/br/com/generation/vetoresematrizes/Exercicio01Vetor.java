package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		double[] notas = new double[5];
		double maiorNota = 0.0;
		
		for( int i = 0; i < notas.length; i++) {
			System.out.println("Insira a " +(i+1)+"ª nota:");
			notas[i] = l.nextDouble();
			
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
		}		
		System.out.println("\nA maior nota é: " + maiorNota);
		l.close();
	}

}
