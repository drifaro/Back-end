package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		int par = 0, impar = 0, num;
		 
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i+1) +"º número:");
			num = in.nextInt();
			
			if(num%2 ==0) {
				par++;
			}else {
				impar++;
			}
		} in.close(); 
			System.out.println("Foram " + par +" numeros pares e "+ impar+" numeros impares.");
	}	
}
