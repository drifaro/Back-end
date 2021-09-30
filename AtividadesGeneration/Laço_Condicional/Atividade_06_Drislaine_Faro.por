programa
{
	
	funcao inicio()
	{
		inteiro i //idade
		escreva("Insira a idade: ")
		leia(i)

		se (i >= 5 e i <= 7) {
			escreva("\nA categoria é Infantil A.\n")
		}
		senao se (i >= 8 e i <= 11) {
			escreva("\nA categoria é Infantil B.\n")					
		}
		senao se (i >= 12 e i <= 13) {
			escreva("\nA categoria é Juvenil A.\n")
		}
		senao se (i >= 14 e i <= 17) {
			escreva("\nA categoria é Juvenil B.\n")
		}
		senao se (i >= 18)
			escreva("\nA categoria é Adulto.\n")
		senao {
			escreva("\nNão se classifica em nenhuma categoria, muito jovem.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */