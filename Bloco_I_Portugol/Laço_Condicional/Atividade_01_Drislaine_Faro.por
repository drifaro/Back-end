programa
{
	funcao inicio() 
	{
		
	real M, E, P	

	escreva("\nInforme o peso: ")
	leia(P)
	
	se (P>50) {
		E = (P-50)
		escreva("\nO excesso é: " + E + " Kg.\n")
		M = E*4      //a cada 1kg de excesso, paga R$4,00
		escreva("\nMulta: R$" + M +" reais\n\n") 
		     }
	senao {
		escreva("\nNão há multa.\n\n")
	      }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */