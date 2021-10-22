package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int[] dado = new int[10];
		int maiorDado = 0, qtsMaior = 1;
		double media= 0.0, soma = 0.0;
				
		for(int i = 0; i < dado.length; i++) {
			System.out.println((i+1) + "º lançamento: ");
			dado[i] = l.nextInt();
			
			while(dado[i] < 1 || dado[i] > 6 ) {
				System.out.println("Valor inválido, insira valores entre 1 e 6!");
				dado[i] = l.nextInt();
			}			
			if(dado[i] > maiorDado) {
			maiorDado = dado[i];
				qtsMaior=1;
			}
			else if(dado[i] ==  maiorDado) {
			qtsMaior++;	
			
			}			
		
			soma += dado[i];
			media = soma/10;
		}
		
		System.out.println("\nA média aritmética: " + media);
		System.out.println("\nO maior dado foi " +maiorDado+" e a incidendia de maior pontuação foi "+qtsMaior+" x.");
		l.close();
		
	}
		
}

