package View;

import java.util.Scanner;

public class Agendamento {
Scanner leia = new Scanner(System.in);
	
	//________________________________________________
	public String nomeAgendar(){
		System.out.println("informe o nome:");
		String nome = leia.next();
		return nome;
	}
	//________________________________________________
	public String dataAgendamento(){
		System.out.println("informe a data:");
		String data = leia.next();
		return data;
	}

}
