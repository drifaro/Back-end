programa {
	
	/*7. Escreva um algoritimo que lê os coeficientes
	 * a, b, c, d, G e f, e calcule os valores x e y 	 */
	
	funcao inicio() 	{

	real a, b, c, d, g, f, x, y
	
		escreva("Digite o valor de a: ")
		leia(a)

		escreva("Digite o valor de b: ")
		leia(b)

		
		escreva("Digite o valor de c: ")
		leia(c)

		
		escreva("Digite o valor de d: ")
		leia(d)

		
		escreva("Digite o valor de g: ")
		leia(g)

		
		escreva("Digite o valor de f: ")	
		leia(f)

				// x = cg - bf / ae - bd
			
			x = ((c*g) - (b*f)) / ((a*g)-(b*d))

				// y = af - cd / ae - bd
						 
			y = ((a*f) - (c*d)) / ((a*g) - (b*d))

		escreva ("O valor de X é :" + x)
		escreva ("O valor de y é :" +y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */