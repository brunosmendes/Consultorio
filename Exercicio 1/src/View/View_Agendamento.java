package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class View_Agendamento {
Scanner leia = new Scanner(System.in);
//________________________________________________
	public String cpfAgendar(){
		System.out.println("informe o cpf:");
		String nome = leia.nextLine();
		return nome;
	}
	//________________________________________________
	public Date dataAgendamento() throws ParseException{
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/mm/yyyy hh:mm");
		//String dataString = JOptionPane.showInputDialog("Digite a data:");
		//Date data1 = formatador.parse(dataString);
//		System.out.println(data1);
	//	JOptionPane.showMessageDialog(null, formatador.format(data));


		System.out.println("informe a data:");
		data = formatador.parse(leia.nextLine());
		//String data = leia.nextLine();
		return data;
	}
	//________________________________________________
	public String horaAgendamento(){
		System.out.println("informe a hora:");
		String hora = leia.nextLine();
		return hora;
	}
}
