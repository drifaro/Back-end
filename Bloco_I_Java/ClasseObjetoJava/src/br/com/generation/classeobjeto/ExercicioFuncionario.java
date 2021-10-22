package br.com.generation.classeobjeto;

import java.util.Scanner;

public class ExercicioFuncionario {

	public static void main(String[] args) {
		
	Scanner l = new Scanner(System.in);
	Funcionario f = new Funcionario();
	
	double i, valor;
	
	f.setNome("Dri");
	f.setCpf("000.000.000-00");
	f.setEndereço("Rua das nuvens, nº100. Campo das nuvens");
	f.setTelefone("(19) 999999-9999");
	
	System.out.println("Nome: "+f.getNome());
	System.out.println("CPF: " +f.getCpf());
	System.out.println("Endereço: "+f.getEndereço());
	System.out.println("Telefone: "+f.getTelefone()+"\n");
	
	System.out.println("Digite \n[1]Pagamento à vista \n[2]Desconto para funcionário");
	i = l.nextDouble();
	if (i == 1) {
		System.out.println("\nDigite o valor do produto R$: ");
		valor = l.nextDouble();
		System.out.println("\nCom desconto de 10%! Valor R$: " + f.descAVista(valor));
		}
	else if(i==2) {
		System.out.println("\nDigite o valor do produto R$: ");
		valor = l.nextDouble();
		System.out.println("\nCom desconto de 15%! Valor R$: " + f.descFuncionario(valor));
		
		}
	 l.close();
	}
}
