package Services;

import java.util.ArrayList;
import java.util.List;

import Entity.Paciente;
import Factory.FabricaPaciente;


public class CadastraPaciente {

	List<Paciente> pacientes = new ArrayList<>();
	
	
	public List<Paciente> fabricarPaciente(){
		FabricaPaciente paciente = new FabricaPaciente();
		FabricaPaciente paciente2 = new FabricaPaciente();
		
		pacientes.add(paciente.criarNovoPaciente("Joao", "123456789", "09h"));
		pacientes.add(paciente2.criarNovoPaciente("Maria", "987654321", "13h"));
		return pacientes;
	}
	
}
