package View;

import java.util.Scanner;

public class Registro {
	Scanner leia = new Scanner(System.in);
	
	public String prescricao(){
		System.out.println("Informe a prescri��o:");
		String prescricao = leia.next();
		return prescricao;
	}
	//________________________________________________
	public String receituario(){
		System.out.println("informe o receitu�rio:");
		String receituario = leia.next();
		return receituario;
	}
}
