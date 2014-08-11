package Controle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import Model.Consultas;
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
		//________________________________________________
		//________________________________________________
		
		public void mostraMenu(){
			int x = menu.menu();
			Controle c = new Controle();
			
			switch(x){
			case 1 : c.cadastraPaciente();
			break;
			case 2 : c.cadastraMedicamento();
			break;
			case 3 : c.agendarConsulta();
			break;
			case 4 : c.registrarConsulta();
			break;
			case 5 : c.historico();
			break;
			}
		}
		
		//________________________________________________
		public void cadastraPaciente(){
			ArrayList<Paciente> paciente = new ArrayList<Paciente>();
			Controle c = new Controle();
			int x = 0;
			
			while(x!=1){
				Paciente modelP = new Paciente();
				
				String nome = p.nomePaciente();
				String cpf = p.cpfPaciente();
				String numero = p.telefonePaciente();
				
				modelP.setNome(nome);
				modelP.setCpf(cpf);
				modelP.setTelefone(numero);
				
				paciente.add(modelP);
				x = p.retorno();
				
			}
			System.out.println(Arrays.toString(paciente.toArray()));
			c.mostraMenu();
		}
		//________________________________________________
		public void cadastraMedicamento(){
			ArrayList<Medicamentos> remedios = new ArrayList<Medicamentos>();
			Controle c = new Controle();
			int x = 0;
			
			while(x!=1){
				Medicamentos modelM = new Medicamentos();
				
				String nome = m.nomeMedicamento();
				String numero = m.registroRemedio();
				
				modelM.setNome(nome);
				modelM.setNumero(numero);
				
				remedios.add(modelM);
				
				x = m.retorno();
			}
			System.out.println(Arrays.toString(remedios.toArray()));
			c.mostraMenu();
		}
		//________________________________________________
		public void agendarConsulta(){
				ArrayList<Consultas> consultas = new ArrayList<Consultas>();
				Controle c = new Controle();
				
				Consultas modelC = new Consultas();
				
				String paciente = a.nomeAgendar();
				String data = a.dataAgendamento();
				String hora = a.horaAgendamento();
				
				modelC.setPaciente(paciente);
				modelC.setData(data);
				modelC.setHora(hora);
				
				consultas.add(modelC);
			
			
		}
		//________________________________________________
		public void registrarConsulta(){
			
		}
		//________________________________________________
		public void historico(){
			
		}
}

















