package Entity;

import java.util.Date;

public class Paciente {
	private String nome;
	private String cpf;
	private String horarioMarcado;
	
	//TODO - alterar horario para Date
	public Paciente(String nome, String cpf, String horarioMarcado) {
		this.nome = nome;
		this.cpf = cpf;
		this.horarioMarcado = horarioMarcado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getHorarioMarcado() {
		return horarioMarcado;
	}

	public void setHorarioMarcado(String horarioMarcado) {
		this.horarioMarcado = horarioMarcado;
	}
	
	
	
}
