package Factory;

import java.util.Date;

import Entity.Funcionario;
import Entity.Paciente;
import Entity.Terapia;

public class FabricaTerapia {

	public Terapia criarNovaTerapia(String tipoTerapia, Date duracaoEstimada, Date duracaoReal, Funcionario funcionario, Paciente paciente){
		Terapia terapia = new Terapia(tipoTerapia, duracaoEstimada, duracaoReal, funcionario, paciente);
		return terapia;
	}
}