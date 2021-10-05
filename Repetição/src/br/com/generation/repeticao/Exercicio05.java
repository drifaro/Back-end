package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		do {
			
			System.out.println("Digite o número que deseja somar, e para finalizar digite 0: ");
			num = l.nextInt();
			
			soma += num;
		}
		while(num !=0);
		
		System.out.println("A soma de todos os números é: " + soma);
		
		l.close();
	}
}
