package Factory;

import java.util.Date;

import Entity.Funcionario;

public class FabricaFuncionario {
	
	
	public Funcionario criarNovoFuncionario(String nome, String especialidade, Date horarioDeExpediente){
		
		Funcionario funcionario = new Funcionario(nome, especialidade, horarioDeExpediente);
		return funcionario;
	}

}
