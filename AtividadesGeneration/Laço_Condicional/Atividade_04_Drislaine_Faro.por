programa
{
	
	funcao inicio()
	{

		inteiro N
		real resto
		
		escreva("Digite um número inteiro: ")
		leia(N)

		resto = N % 2

		se (resto == 0) {
			escreva ("\nO número " +N+ " é par.\n")
		                }
		senao {
			escreva("\nO número " +N+ " é ímpar.\n")
		      }

		se (N > 0) {
			escreva ("\nO número " +N+ " é positivo.\n")
		           }
		senao {
			escreva("\nO número " +N+ " é negativo.\n\n")
		      }
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */