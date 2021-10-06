package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio04Matriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double mSoma = 0.0, diagSoma = 0.0;
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Digite o valor da posição [%d %d]: ",l,c);
				matriz[l][c] = leia.nextDouble();
			}			
		}
		
		for(int l = 0; l < matriz.length; l++ ) {
			for(int c = 0; c < matriz[l].length; c++) {
				mSoma += matriz[l][c];
				
				if(l == c) {
					diagSoma += matriz[l][c];
				}
			}
		}
		System.out.println("A soma da matriz é: "+mSoma);
		System.out.println("A soma da diagonal princial da matriz é: "+diagSoma);
		leia.close();
	}

}
