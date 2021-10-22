package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro();
		Cavalo cav = new Cavalo();
		Pregui�a preg = new Pregui�a();
		
				
		cach.setNome("Eteobaldo");
		cach.setIdade(5);
		
		cav.setNome("Zeus");
		cav.setIdade(10);
		
		preg.setNome("Florentina");
		preg.setIdade(2);
			
		
		
		System.out.println("O nome do cachorro �: "+ cach.getNome());
		System.out.println("Ele tem "+ cach.getIdade()+" anos.");
		cach.correr();
		cach.emitirSom("AU-AU");
		
		System.out.println();
		
		System.out.println("O nome do cavalo �: "+ cav.getNome());
		System.out.println("Ele tem "+ cav.getIdade()+" anos.");
		cav.correr();
		cav.emitirSom("IIIRRRR�");
		
		System.out.println();
		System.out.println("O nome da pregui�a �: "+ preg.getNome());
		System.out.println("Ela tem "+preg.getIdade()+" anos.");
		preg.subirArvore();
		preg.emitirSom("uuuuu����");
		

	}

}
