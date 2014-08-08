package View;

import java.util.Scanner;

public class Menu {
	Scanner leia = new Scanner(System.in);
	
	public int menu(){
		System.out.println("Digite o numero:");
		System.out.println("1 - Cadastrar paciente;");
		System.out.println("2 - Cadastrar medicamento;");
		System.out.println("3 - Fazer agendamento;");
		System.out.println("4 - Registrar consulta:");
		System.out.println("5 - Historico;");
		int x = leia.nextInt();
		return x;
	}
	
}
