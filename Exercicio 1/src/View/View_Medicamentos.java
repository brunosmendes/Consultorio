package View;

import java.util.Scanner;

public class View_Medicamentos {
	Scanner leia = new Scanner (System.in);
	
	
	//________________________________________________
	public String nomeMedicamento(){
		System.out.println("informe o nome do remedio:");
		String remedio = leia.next();
		return remedio;
	}
	//________________________________________________
	public String dosagemRemedio(){
		System.out.println("informe a dosagem:");
		String dosagem = leia.next();
		return dosagem;
	}
	//________________________________________________
	public String numeroRemedio(){
		System.out.println("informe o numero do remedio:");
		String numero = leia.next();
		return numero;
	}
	
}
