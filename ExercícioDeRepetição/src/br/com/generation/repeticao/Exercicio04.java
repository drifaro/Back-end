package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		int idade, sexo, mascagress = 0, femnerv = 0, outcalm = 0,calma = 0, humor;
		int idahum = 0, idacalm = 0, i = 1, loop=150;
		
		while(i <=loop) {
			System.out.println("\n" +i+"ª pessoa: Qual a sua idade?");
			idade = l.nextInt();
			System.out.println(i+"ª pessoa: Qual o seu sexo \n[1] Feminino \n[2] Masculino \n[3] Outro: ");
			sexo =l.nextInt();
			System.out.println(i+"ª pessoa: Você se identifica como uma pessoa: \n[1] Calma \n[2] Nervosa \n[3] Agressiva : ");
			humor =l.nextInt();
			
			if(humor == 1) {
				calma++;
			} 
			if (sexo == 1 && humor == 2) {
				femnerv++;
			} 
			if(sexo == 2 && humor ==3) {
				mascagress++;
			}
			if(sexo == 3 && humor == 1) {
				outcalm++;
			}
			if(idade > 40 && humor==2){
				idahum++;				
			}
			if(idade<18 && humor==1) {
				idacalm++;
			} i++;
		} l.close();
				
				System.out.println("\n O número de pessoas calmas: " +calma);
				System.out.println("O número de mulheres nervosas: " +femnerv);
				System.out.println("O número de homens agressivos: " +mascagress);
				System.out.println("O número de outros calmos: " +outcalm);
				System.out.println("O número de pessoas nervosas com mais de 40 anos: " +idahum);
				System.out.println("O número de pessoas calmas com menos de 18 anos: " +idacalm);
		}	 	
}
