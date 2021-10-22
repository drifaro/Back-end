programa {
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real custoDoDistribuidor, custoDeImposto, custoFinal, custoDeFabrica
		
		escreva("Escreva o valor do carro :")
		leia(custoDeFabrica)

			//foi somado o valor da porcentagem de 28% + 45% = 73%
			 
		custoFinal = custoDeFabrica * 1.73

		escreva("O valor do carro para o consumidor é: " + custoFinal)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */