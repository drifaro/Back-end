package br.com.generation.polimorfismo;

public class Pregui�a implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da pregui�a � Berenice.");
		
	}

	@Override
	public void idade() {
		System.out.println("Berenice tem 1 ano.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a faz o som para chamar o macho: UUUU���");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A pregui�a adora subir em �rvores.\n\n");
		
	}

}
