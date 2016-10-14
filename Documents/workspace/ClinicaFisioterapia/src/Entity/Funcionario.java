package Entity;

import java.util.Date;

public class Funcionario {
	private String nome;
	private String especialidade;
	private Date horarioDeExpediente;
	
	public Funcionario(String nome, String especialidade, Date horarioDeExpediente) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.horarioDeExpediente = horarioDeExpediente;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Date getHorarioDeExpediente() {
		return horarioDeExpediente;
	}

	public void setHorarioDeExpediente(Date horarioDeExpediente) {
		this.horarioDeExpediente = horarioDeExpediente;
	}

			
	
}
