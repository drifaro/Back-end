package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int num = 0, soma = 0, i = 0, media;
		
		do {
			System.out.println("Digite o número que deseja somar, e para finalizar digite 0: ");
			num = l.nextInt();
			
			if(num % 3 == 0 && num != 0) {
			soma += num;
			i++;
			}			
		}
		while(num !=0);
		
		media = soma/i;
		
		System.out.println("\nA média dos múltiplos de 3 é: " + media);
		l.close();
	} 	
}

