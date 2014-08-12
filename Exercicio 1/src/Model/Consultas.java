package Model;

import java.util.Date;

public class Consultas {
	private String  Data;
	//private Date  Data = new Date();
	private Paciente paciente;
	
	
	private String Hora;
	
	
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	@Override
	public String toString() {
		return "\nConsultas "
				+ "\n[Data=" + Data + ""
						+ "\n, Paciente=" + paciente + ""
								+ "\n, Hora="+ Hora + "]";
	}
	
	
}
