programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real primeiro, segundo, terceiro, quarto
		real primeiroQ, segundoQ, terceiroQ, quartoQ

		escreva("Insira o primeiro número: ")
		leia(primeiro)
		primeiroQ = mat.potencia(primeiro, 2.0)
				
		escreva("Insita o segundo número: ")
		leia(segundo)
		segundoQ = mat.potencia(segundo,2.0)
		
		escreva("Insira o terceiro número: ")
		leia(terceiro)
		terceiroQ = mat.potencia(terceiro, 2.0)
		
		escreva("Insira o quarto número: ")
		leia(quarto)
		quartoQ = mat.potencia(quarto, 2.0)

		limpa()
		
		se (terceiroQ >= 1000){
			escreva("\nO quadrado do terceiro é " +terceiroQ+ ".\n")
		} senao {
			escreva("\nO quadrado do primeiro é " +primeiroQ+".\nO quadrado do segundo é " +segundoQ+". \nO quadrado do terceiro é " +terceiroQ+". \nO quadrado do quarto é " + quartoQ+".")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 864; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */