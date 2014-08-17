package View;

import java.util.Scanner;

public class View_Registro {
	Scanner leia = new Scanner(System.in);
	
	public String prescricao(){
		System.out.println("Informe a prescrição:");
		String prescricao = leia.nextLine();
		return prescricao;
	}
	//________________________________________________
	public String receituario(){
		System.out.println("informe o receituário:");
		String receituario = leia.nextLine();
		return receituario;
	}
}
