package View;

import java.util.Scanner;

public class View_Paciente {
	
	Scanner leia=new Scanner(System.in);
	//________________________________________________	
	public String nomePaciente(){
		System.out.println("Informe o nome:");
		String nome = leia.nextLine();
		return nome;
	}
	//________________________________________________		
	public String cpfPaciente(){
		System.out.println("informe o CPF:");
		String cpf = leia.nextLine();
		return cpf;
	}
	//________________________________________________	
	public String telefonePaciente(){
		System.out.println("informe o telefone:");
		String telefone = leia.nextLine();
		return telefone;
	}
	public int retorno(){
		System.out.println("1 - Para voltar ao menu");
		System.out.println("2 - Cadastrar outro paciente");
		int x = leia.nextInt();
		return x;
	}
	
}