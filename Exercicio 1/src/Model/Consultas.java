package Model;

public class Consultas {
	String Data;
	String Paciente;
	String Hora;
	
	
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getPaciente() {
		return Paciente;
	}
	public void setPaciente(String paciente) {
		Paciente = paciente;
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
						+ "\n, Paciente=" + Paciente + ""
								+ "\n, Hora="+ Hora + "]";
	}
	
	
}
