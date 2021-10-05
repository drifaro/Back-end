package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
				
		int idade = 0, menos21 = 0, mais50 = 0;
		
		while(idade != -99) {
		System.out.println("Insira a idade, caso queira finalizar digite -99: ");
		idade = l.nextInt();
			
			if(idade < 21 && idade != -99) {
				menos21++;
			} 
			if (idade > 50) {
				mais50++;
			}
			
		} 	System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
			System.out.println("Total de pessoas com mais de 50 anos: " + mais50); 
			
			l.close();
	}

}
