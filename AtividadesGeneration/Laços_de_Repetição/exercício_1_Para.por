/*Autor: Drislaine Faro
 Data: 27/09/2021
 */

programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro populacao, filhos, totalFilhos = 0, medFilhos = 0, ate100 = 0
		real salario, totalSalario = 0.0, medSalario = 0.0, maiorSalario = 0.0, per=0.0

		
		para(populacao = 1; populacao <=20; populacao++){
			
				escreva("\nDigite o salário da " + populacao + "ª pessoa: ")
				leia(salario)
								
				escreva("Quantos filhos? ")
				leia(filhos)

			se (salario > maiorSalario){
			maiorSalario = salario
			}

			se (salario <=100){
				ate100++
		}
			totalFilhos += filhos
			totalSalario += salario
		}

		medSalario = totalSalario/20
		medFilhos = totalFilhos/20
		per=(ate100 * 100)/ 20
		limpa()

		escreva("A média do salário da população é: R$" + medSalario + ".\n")
		escreva("A média do número de filhos é: " +medFilhos+ ".\n")
		escreva("O maior salário é de: R$" +maiorSalario+ ".\n")
		escreva("O percentual de pessoas com salário até R$100,00 é de: " +per+ "%.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 41; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */