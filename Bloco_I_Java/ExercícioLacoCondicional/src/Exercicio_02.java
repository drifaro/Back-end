import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[] numero;
		numero = new double[3];
		
		
		for(int i = 0; i <3; i++) {
			System.out.println("Insira o "+(i+1)+"� n�mero: ");
			numero[i] = leia.nextDouble();
		}
		
		Arrays.sort(numero);
		
		System.out.println("A ordem crescente dos n�meros s�o: " +Arrays.toString(numero));
		leia.close();
	}
}
