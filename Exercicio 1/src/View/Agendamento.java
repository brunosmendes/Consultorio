package View;

import java.util.Scanner;

public class Agendamento {
Scanner leia = new Scanner(System.in);
	
	//________________________________________________
	public String cpfAgendar(){
		System.out.println("informe o cpf:");
		String nome = leia.next();
		return nome;
	}
	//________________________________________________
	public String dataAgendamento(){
		System.out.println("informe a data:");
		String data = leia.next();
		return data;
	}
	//________________________________________________
	public String horaAgendamento(){
		System.out.println("informe a hora:");
		String hora = leia.next();
		return hora;
	}
}
