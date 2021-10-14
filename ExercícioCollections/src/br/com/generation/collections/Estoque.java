package br.com.generation.collections;

public class Estoque {
	
		String produto;
		int numSerie;

		
		public Estoque(String produto, int numSerie) {
			super();
			this.produto = produto;
			this.numSerie = numSerie;
		}

		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		public int getNumSerie() {
			return numSerie;
		}

		public void setNumSerie(int numSerie) {
			this.numSerie = numSerie;
		}
		
		public String toString() {
			return this.produto + " | n� de s�rie: " + this.numSerie;
			
		}
}
