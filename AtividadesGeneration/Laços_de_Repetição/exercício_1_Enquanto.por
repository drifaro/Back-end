/*Autor: Drislaine Faro
 Data: 27/09/2021
 */

programa
{
	
	funcao inicio()
	{
		inteiro contador=0
		real valor=0.0, soma =0.0, media=0.0

		enquanto (valor >=0) {
			escreva ("Informe um valor positivio para somar e negativo para encerrar: ")
			leia(valor)

			se (valor >0){
			contador++
			soma += valor
			media = soma/contador
			}
			limpa()	
		}
		escreva("A soma dos valores é igual a: " +soma)
		escreva("\nA media dos valores é igual a: " +media)
		escreva("\nA quantidade de números lidos é: " +contador)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */