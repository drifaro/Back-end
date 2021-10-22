programa {

	/*Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, 
	/P(x1, y1) e P(x2, y2), escreva a distância entre eles.*/
    
    inclua biblioteca Matematica --> mat
    
	funcao inicio() {
		
		real x1, x2, y1, y2, d
		
        escreva("Escreva X1 :")
            leia(x1)
        escreva("Escreva X2 :")
            leia(x2)
        escreva("Escreva Y1 :")
            leia(y1)
        escreva("Escreva Y2 :")
            leia(y2)

            //d = √(x2 - x1)^2 + (y2 - y1)^2
            
        d = mat.raiz(mat.potencia((x2 - x1), 2.0) + mat.potencia((y2 - y1), 2.0), 2.0)
        
        escreva("A distância entre os pontos é :" + d)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */