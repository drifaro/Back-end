import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	int idade;
	
	System.out.println("Insira a idade da pessoa: ");
	idade = leia.nextInt();
	
		if (idade >=10 && idade<=14) {
		System.out.println("A categoria � Infantil!");		
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("A categoria � Juvenil!");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("A categoria � Adulto!");
		}
		else {
			System.out.println("Voc� n�o se encaixa em nenhuma categoria!");
		}
		leia.close();
	}
}
