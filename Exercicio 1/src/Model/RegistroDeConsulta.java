package Model;

public class RegistroDeConsulta {
	
	private Paciente paciente;
	private String receituario;
	private String prescricao;
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getReceituario() {
		return receituario;
	}
	public void setReceituario(String receituario) {
		this.receituario = receituario;
	}
	public String getPrescricao() {
		return prescricao;
	}
	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	@Override
	public String toString() {
		return "RegistroDeConsulta "
				+ "\n[" + paciente + ", "
						+ "\nreceituario="+ receituario + ","
								+ "\nprescricao=" + prescricao + "]";
	}
	
}
