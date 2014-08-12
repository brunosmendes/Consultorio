package Model;

public class Medicamentos {
	
		private String nome;
		private String registro;
		
		
		
		public Medicamentos(String nome, String numero) {
			super();
			this.nome = nome;
			this.registro = numero;
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
			return registro;
		}
		public void setNumero(String numero) {
			this.registro = numero;
		}

		@Override
		public String toString() {
			return "Medicamentos "
					+ "\n[nome=" + nome + ","
							+ "\n registro=" + registro + "]";
		}
		
		
}

