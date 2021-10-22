package br.com.generation.polimorfismo;

public class TestaAnimal {
	
		
		public static void infoAnimal (Animal animal) {
			animal.nome();
			animal.idade();
			animal.emitirSom();
			animal.correr();			
			animal.subirEmArvores();
		}
		
		public static void main(String[] args) {
								
			infoAnimal(new Cachorro());
			infoAnimal(new Cavalo());
			infoAnimal(new Preguiça());
			
		}
}

