import javax.swing.JOptionPane;

public class Exercicio_04 {
	
public static void main(String[] args) {
	

	float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero qualquer: "));
	
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � Par e a raiz quadra � " + Math.sqrt(numero));
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero � Impar e o quadrado dele � " + Math.pow(numero, 2));
		}
		System.exit(0);	
	}
}
