package Controle;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import Model.Consultas;
import Model.Medicamentos;
import Model.Paciente;
import Model.RegistroDeConsulta;
import View.View_Menu;
import View.View_Registro;
import View.View_Agendamento;
import View.View_Medicamentos;
import View.View_Paciente;

public class Controle {

	
		//________________________________________________
		View_Menu menu = new View_Menu();
		View_Registro registro = new View_Registro();
		View_Agendamento agenda = new View_Agendamento();
		View_Medicamentos view_medicamentos = new View_Medicamentos();
		View_Paciente view_paciente = new View_Paciente();
		
		
		//________________________________________________
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Medicamentos> remedios = new ArrayList<Medicamentos>();
		ArrayList<Consultas> consultas = new ArrayList<Consultas>();
		ArrayList<RegistroDeConsulta> registros = new ArrayList<RegistroDeConsulta>();
		//________________________________________________
		//________________________________________________
		
		public void mostraMenu() throws Exception{
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
			int opcao = 0;

			while(opcao!=1)
			{
				Paciente novo_paciente = new Paciente();

				String nome = view_paciente.nomePaciente();
				String cpf = view_paciente.cpfPaciente();
				
				if (cpfCadastrado(cpf) == null)
				{				
					String numero = view_paciente.telefonePaciente();
					novo_paciente.setNome(nome);
					novo_paciente.setCpf(cpf);
					novo_paciente.setTelefone(numero);

					pacientes.add(novo_paciente);
				}
				
				else
					System.out.println("CPF já cadastrado");
					opcao = view_paciente.retorno();

			}
			//exibe a lista de pacientes - tornar um metodo
			//System.out.println(Arrays.toString(pacientes.toArray()));
			exibe_lista_pacientes();
			//this.mostraMenu();
		}
		
		public void exibe_lista_pacientes()
		{
			System.out.println(Arrays.toString(pacientes.toArray()));
		}
		
		//________________________________________________
		/**
		 * Metodo que percorre a lista de pacientes comparando o cpf
		 * @param cpf
		 * @return objeto do tipo paciente
		 */
		public Paciente cpfCadastrado(String cpf)
		{
			Paciente paciente_encontrado = null;

			for (Paciente paciente: pacientes) {

				if (paciente.getCpf().equals(cpf)) {
					//
					paciente_encontrado = paciente;
					break;				
				}					
			}
			return paciente_encontrado;
		}
		//________________________________________________
		public void cadastraMedicamento(){
			
			//Controle c = new Controle();
			int opcao = 0;
			
			while(opcao!=1){
				Medicamentos novo_medicamento = new Medicamentos();
				
				String nome = view_medicamentos.nomeMedicamento();
				String numero = view_medicamentos.registroRemedio();
				
				novo_medicamento.setNome(nome);
				novo_medicamento.setNumero(numero);
				
				remedios.add(novo_medicamento);
				
				opcao = view_medicamentos.retorno();
			}
			//exibe lista de medicamentos - criar metodo
			//System.out.println(Arrays.toString(remedios.toArray()));
			exibe_lista_medicamentos();
			//c.mostraMenu();
		}
		
		public void exibe_lista_medicamentos()
		{
			System.out.println(Arrays.toString(remedios.toArray()));
		}
		
		
		//________________________________________________
		public void agendarConsulta() throws Exception{
				
				//Controle c = new Controle();
				
				Consultas nova_consulta = new Consultas();
				Paciente paciente = new Paciente();
				
				String cpf = agenda.cpfAgendar();
				paciente = cpfCadastrado(cpf);
				
				if ( paciente != null )
				{
					//alterar para objeto date
					Date data = (Date) agenda.dataAgendamento();
					//String hora = agenda.horaAgendamento();										
					
					nova_consulta.setPaciente(paciente);					
					nova_consulta.setData(data);
					//nova_consulta.setHora(hora);
					
					consultas.add(nova_consulta);
					
				}
				else
					System.out.println("CPF nao cadastrado");
				
				
				System.out.println(Arrays.toString(consultas.toArray()));
			
		}
		//________________________________________________
		public void registrarConsulta(){
				RegistroDeConsulta registro_consulta = new RegistroDeConsulta();
				Paciente paciente = new Paciente();
				
				String cpf = agenda.cpfAgendar();
				paciente = cpfCadastrado(cpf);
				
				if ( paciente != null )
				{
					
				
					String prescricao = registro.prescricao();
					String receituario = registro.receituario();
					
					registro_consulta.setPaciente(paciente);
					registro_consulta.setPrescricao(prescricao);
					registro_consulta.setReceituario(receituario);
					
					registros.add(registro_consulta);
				}
				else
					System.out.println("CPF nao cadastrado");
			
			System.out.println(Arrays.toString(registros.toArray()));
		}
		//________________________________________________
		public void historico(){
			
		}
		
		
}
