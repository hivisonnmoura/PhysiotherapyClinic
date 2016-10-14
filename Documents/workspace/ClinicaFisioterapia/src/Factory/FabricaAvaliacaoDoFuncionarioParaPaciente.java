package Factory;

import Entity.AvaliacaoDoFuncionarioPeloCliente;

public class FabricaAvaliacaoDoFuncionarioParaPaciente {
	
	public AvaliacaoDoFuncionarioPeloCliente criarNovaAvaliacaoDoFuncionarioPeloCliente(String nota, String comentarios){
		
		AvaliacaoDoFuncionarioPeloCliente avaliacaoDoFuncionarioPeloCliente = new AvaliacaoDoFuncionarioPeloCliente(nota, comentarios);
		return avaliacaoDoFuncionarioPeloCliente;
	}
}
