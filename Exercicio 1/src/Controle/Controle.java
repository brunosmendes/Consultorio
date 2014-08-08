package Controle;

import Model.Medicamentos;
import Model.Paciente;
import View.Menu;
import View.Registro;
import View.Agendamento;
import View.View_Medicamentos;
import View.View_Paciente;

public class Controle {

	
		//________________________________________________
		Menu menu = new Menu();
		Registro r = new Registro();
		Agendamento a = new Agendamento();
		View_Medicamentos m = new View_Medicamentos();
		View_Paciente p = new View_Paciente();
		//________________________________________________
		boolean controle=true;
		int contPaciente=0;
		int contRemedio=0;
		//________________________________________________
		
		
		public void mostraMenu(){
			int x = menu.menu();
			Controle c = new Controle();
			
			switch(x){
			case 1 : c.cadastraPaciente();
			break;
			case 2 : c.cadastraMedicamento();
			break;
			}
		}
		
		//________________________________________________
		public void cadastraPaciente(){
			while(controle== true && contPaciente<50){
				
			
			Paciente[] vetorP = new Paciente[50];
			vetorP[contPaciente]=new Paciente();
			
			String nome = p.nomePaciente();
			String cpf = p.cpfPaciente();
			String numero = p.telefonePaciente();
			
			
			vetorP[contPaciente].setNome(nome);
			vetorP[contPaciente].setCpf(cpf);
			vetorP[contPaciente].setTelefone(numero);
			
			
			contPaciente++;
			controle=false;
			
//			for(int i=0;i<contPaciente;i++){
//				System.out.println(vetorP[i]);
//			}
			}
		}
		//________________________________________________
		public void cadastraMedicamento(){
			while(controle== true && contRemedio<50){
			
			
			String nome = m.nomeMedicamento();
			String numero = m.numeroRemedio();
			
			Medicamentos[] vetorM = new Medicamentos[50];
			vetorM[contRemedio]=new Medicamentos();
			
			vetorM[contRemedio].setNome(nome);
			vetorM[contRemedio].setNumero(numero);
			
			contRemedio++;
			controle=false;
			
//			for(int i=0;i<contRemedio;i++){
//			System.out.println(vetorM[i]);
//		}
			
		}
		
		}
		
	

}
