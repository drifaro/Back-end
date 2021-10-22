import javax.swing.JOptionPane;

public class Exercicio_04 {
	
public static void main(String[] args) {
	

	float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número qualquer: "));
	
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é Par e a raiz quadra é " + Math.sqrt(numero));
		} else {
			JOptionPane.showMessageDialog(null, "O número é Impar e o quadrado dele é " + Math.pow(numero, 2));
		}
		System.exit(0);	
	}
}
