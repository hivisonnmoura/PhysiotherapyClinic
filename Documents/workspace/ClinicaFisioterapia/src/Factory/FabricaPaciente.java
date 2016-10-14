package Factory;



import Entity.Paciente;

public class FabricaPaciente {

	// TODO alterar para horário para DATE
	public Paciente criarNovoPaciente(String nome, String cpf, String horarioMarcado){
		
		Paciente paciente = new Paciente(nome, cpf, horarioMarcado);
		return paciente;
	}
}
