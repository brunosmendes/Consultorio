package View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
		Date data = new Date();
		   SimpleDateFormat formatador = new SimpleDateFormat("dd/mm/yyyy hh:mm");
		   String dataString = 
		  
		 
		String dataString = JOptionPane.showInputDialog("Digite a data:");
		Date data1 = formatador.parse(dataString);
		System.out.println(data1);
		JOptionPane.showMessageDialog(null, formatador.format(data));
		
		
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
