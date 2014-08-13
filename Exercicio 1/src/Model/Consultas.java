package Model;

import java.util.Date;

public class Consultas {
	private Date  Data;
	//private Date  Data = new Date();
	private Paciente paciente;
	
	
	private String Hora;
	
	
	
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
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
		return "Consultas "
				+ "\n[Data=" + Data + ""
						+ "\n" + paciente + ""
								+ "\n, Hora="+ Hora + "]";
	}
	
	
}
