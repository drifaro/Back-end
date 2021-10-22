package br.com.generation.polimorfismo;

public class Cavalo implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome do Cavalo é Pegasus!");
		
	}

	@Override
	public void idade() {
		System.out.println("Pegasus tem 5 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo gosta de relinchar: IIIRRRRÍ");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo está correndo...\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}
