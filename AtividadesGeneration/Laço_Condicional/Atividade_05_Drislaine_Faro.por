programa
{
	
	funcao inicio()
	{
		real i //indice
		
		escreva("Digite o índice de poluição: ")
		leia (i)

		se(i >= 0.3 e i < 0.4) {
		    escreva("\nNOTIFICAÇÃO: intimar o 1º grupo a suspender todas as atividades.\n\n")
		}
		senao se (i >=0.4 e i < 0.5) {
			escreva("\nNOTIFICAÇÃO: intimar o 1º e 2º grupo a suspender todas as atividades.\n\n")
		}
		senao se (i >=0.5) {
			escreva("\nNOTIFICAÇÃO: intimar todos os grupos a suspenderem todas as atividades.\n\n")
		}
		senao se(i >=0.05 e i <0.3) {
			escreva("\nO índice de poluição está aceitável.\n\n")
		}
		senao {
			escreva("\nValor inválido!\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */