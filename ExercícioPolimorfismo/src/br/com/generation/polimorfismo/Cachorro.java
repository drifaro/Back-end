package br.com.generation.polimorfismo;

public class Cachorro implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome do cachorro é Doguinho.");
		
	}

	@Override
	public void idade() {
		System.out.println("Doguinho tem 2 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro faz: AU-AU...");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro está correndo.\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}
