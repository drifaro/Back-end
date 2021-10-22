package br.com.generation.polimorfismo;

public class Cavalo implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome do Cavalo � Pegasus!");
		
	}

	@Override
	public void idade() {
		System.out.println("Pegasus tem 5 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo gosta de relinchar: IIIRRRR�");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo est� correndo...\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}
