package View;

import java.util.Scanner;

public class View_Paciente {
	
	Scanner leia=new Scanner(System.in);
	//________________________________________________	
	public String nomePaciente(){
		System.out.println("Informe o nome:");
		String nome = leia.next();
		return nome;
	}
	//________________________________________________		
	public String cpfPaciente(){
		System.out.println("informe o CPF:");
		String cpf = leia.next();
		return cpf;
	}
	//________________________________________________	
	public String telefonePaciente(){
		System.out.println("informe o telefone:");
		String telefone = leia.next();
		return telefone;
	}
	
}