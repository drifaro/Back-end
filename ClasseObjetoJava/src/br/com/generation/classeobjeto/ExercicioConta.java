package br.com.generation.classeobjeto;

import java.util.Scanner;

public class ExercicioConta {

	public static void main(String[] args) {
		
		int saldo = -1;
		Scanner l = new Scanner(System.in);
		Conta c1 = new Conta();
	
		c1.setNome("Dri");
		c1.setCpf("000.000.000-00");
		c1.setRg("000000000");
		c1.setDataNascimento("00/00/0000");
		c1.setEndereço("Rua das nuvens, nº100. Campo das nuvens");
		c1.setEmail("eng.drifaro@gmail.com");
		c1.setTelefone("(19) 999999-9999");
		
		System.out.println("Nome: "+c1.getNome());
		System.out.println("CPF: " +c1.getCpf());
		System.out.println("RG: " +c1.getRg());
		System.out.println("Data de Nascimento: "+c1.getDataNascimento());
		System.out.println("Endereço: "+c1.getEndereço());
		System.out.println("e-mail: "+c1.getEmail());
		System.out.println("Telefone: "+c1.getTelefone()+"\n");
		
		System.out.println("\nDigite a opção \n [1] Sacar dinheiro \n [2] Depositar dinheiro\n");
		saldo = l.nextInt();
			
			if(saldo == 1) {
			System.out.println("Digite o valor que deseja sacar: ");
			double i = l.nextDouble();
			
				if(i > c1.getConta()) {
				System.out.println("Você não tem saldo suficiente.");
				}
				else {
					c1.sacar(i);
				}
				System.out.println("O seu saldo atual é: " + c1.getConta());
			}
			else if(saldo == 2) {
			System.out.println("Digite o valor que deseja depositar: ");
			c1.depositar(l.nextDouble());
			System.out.println("Seu saldo atual é: " +c1.getConta());
			}
			else {
				System.out.println("Entrada inválida!");
			}
		
			l.close();
	}
			
}


