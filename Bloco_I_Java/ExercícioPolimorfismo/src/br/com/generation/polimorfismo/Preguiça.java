package br.com.generation.polimorfismo;

public class Preguiça implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da preguiça é Berenice.");
		
	}

	@Override
	public void idade() {
		System.out.println("Berenice tem 1 ano.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça faz o som para chamar o macho: UUUUÍÍÍ");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A preguiça adora subir em árvores.\n\n");
		
	}

}
