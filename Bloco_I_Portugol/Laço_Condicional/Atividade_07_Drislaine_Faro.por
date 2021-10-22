programa
{
	
	funcao inicio()
	{
		real b, h, a  //base, altura, area
		
		escreva("Insira o valor da base do triângulo em metros: ")
		leia(b)

		escreva ("\nInsira o valor da altura do triângulo em metros: ")
		leia(h)

		se (b > 0 e h > 0){
			a = (b * h)/2
			escreva("\nA área do triângulo é: " +a+ " m².\n")
		}

		senao {
			escreva("\nOs valores não são válidos.\n\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */