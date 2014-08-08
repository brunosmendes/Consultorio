package Model;

public class Medicamentos {
	
		String nome;
		String numero;
		
		
		
		public Medicamentos(String nome, String numero) {
			super();
			this.nome = nome;
			this.numero = numero;
		}
		
		public Medicamentos() {
			// TODO Auto-generated constructor stub
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}

		@Override
		public String toString() {
			return "Medicamentos "
					+ "\n[nome=" + nome + ","
							+ "\n numero=" + numero + "]";
		}
		
		
}

