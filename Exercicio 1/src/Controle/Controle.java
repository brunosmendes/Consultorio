package Controle;

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
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Medicamentos> remedios = new ArrayList<Medicamentos>();
		ArrayList<Consultas> consultas = new ArrayList<Consultas>();
		//________________________________________________
		//________________________________________________
		
		public void mostraMenu(){
			int x;		
			do{
			x = menu.menu();
			//Controle c = new Controle();
			
			switch(x){
			case 1 : this.cadastraPaciente();
			break;
			case 2 : this.cadastraMedicamento();
			break;
			case 3 : this.agendarConsulta();
			break;
			case 4 : this.registrarConsulta();
			break;
			case 5 : this.historico();
			break;
			}
			}while(x<10);
		}
		
		//________________________________________________
		public void cadastraPaciente(){

			//Controle c = new Controle();
			int x = 0;

			while(x!=1)
			{
				Paciente modelP = new Paciente();

				String nome = p.nomePaciente();



				String cpf = p.cpfPaciente();
				if (cpfCadastrado(cpf) == null)
				{				
					String numero = p.telefonePaciente();
					modelP.setNome(nome);
					modelP.setCpf(cpf);
					modelP.setTelefone(numero);

					pacientes.add(modelP);
				}
				
				else
					System.out.println("CPF cadastrado");
				x = p.retorno();

			}

			System.out.println(Arrays.toString(pacientes.toArray()));
			//this.mostraMenu();
		}
		
		public Paciente cpfCadastrado(String cpf)
		{
			Paciente p = null;

			for (Paciente paciente: pacientes) {

				if (paciente.getCpf().equals(cpf)) {
					//
					p = paciente;
					break;				
				}					
			}
			return p;
		}
		
		//________________________________________________
		public void cadastraMedicamento(){
			
			//Controle c = new Controle();
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
			//c.mostraMenu();
		}
		//________________________________________________
		public void agendarConsulta(){
				
				//Controle c = new Controle();
				
				Consultas modelC = new Consultas();
				Paciente paciente = new Paciente();
				
				String cpf = a.cpfAgendar();
				paciente = cpfCadastrado(cpf);
				
				if ( paciente != null )
				{
					//alterar para objeto date
					String data = a.dataAgendamento();
					
					
					String hora = a.horaAgendamento();										
					modelC.setPaciente(paciente);					
					modelC.setData(data);
					modelC.setHora(hora);
					
					consultas.add(modelC);
					
				}
				else
					System.out.println("CPF nao cadastrado");
				
				
				System.out.println(Arrays.toString(consultas.toArray()));
			
		}
		//________________________________________________
		public void registrarConsulta(){
			
		}
		//________________________________________________
		public void historico(){
			
		}
		
		
}
