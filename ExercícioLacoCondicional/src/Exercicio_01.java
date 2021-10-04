import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int [] numero;
	numero = new int[3];
	
	
	for(int i = 0; i <3; i++) {
		 
		System.out.println("Digite o "+ (i +1) +"º número inteiro: ");
		numero[i] = entrada.nextInt();
		}
	
	if (numero[0] > numero [1] && numero[0] > numero [2]) {
		System.out.println("O maior número é: "+numero[0]);
	}
	else if(numero[0] < numero [1] && numero [1] > numero[2]) {
		System.out.println("O maior número é: " +numero[1]);
	}
	else if(numero[0] < numero[2] && numero[2] > numero [1]) {
		System.out.println("O maior número é: "+ numero[2]);
	}
	entrada.close();
	}

}
