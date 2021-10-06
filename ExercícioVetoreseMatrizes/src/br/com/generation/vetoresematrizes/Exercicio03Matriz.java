package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exercicio03Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] N1 = new double[4][6];
		double[][] N2 = new double[4][6];
		double[][] M1 = new double[4][6];
		double[][] M2 = new double[4][6];
		
		for( int l = 0; l < N1.length; l++) {
			for (int c = 0; c <N1[l].length; c++) {
			System.out.printf("Digite os valores da matriz N1 [%d %d]: ",l,c);
			N1[l][c] = leia.nextDouble();
			}
		}
		System.out.println();
		
		for (int l = 0; l < N2.length; l++) {
			for(int c = 0; c < N2[l].length; c++) {
				System.out.printf("Digite os valores da matriz N2 [%d %d]: ",l,c);
				N2[l][c] = leia.nextDouble();
			}
		}
		System.out.println("\n\nM1 = N1 + N2");
		for( int l = 0; l < M1.length; l++) {
			for (int c = 0; c <M1[l].length; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
				System.out.printf("["+M1[l][c]+"] ");
			}
			System.out.println();
		} 
		System.out.println("\n\nM2 = N1 - N2");
		
		for( int l = 0; l < M2.length; l++) {
			for (int c = 0; c <M2[l].length; c++) {
				M2[l][c] = N1[l][c] - N2[l][c];
				System.out.printf("["+M2[l][c]+"]");
			}
			System.out.println();
		}
		leia.close();
	}
}
