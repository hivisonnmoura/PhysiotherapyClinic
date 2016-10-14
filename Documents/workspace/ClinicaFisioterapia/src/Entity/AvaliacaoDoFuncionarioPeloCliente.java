package Entity;

public class AvaliacaoDoFuncionarioPeloCliente {
	private String nota;
	private String comentario;
	
	public AvaliacaoDoFuncionarioPeloCliente(String nota, String comentario) {
		this.nota = nota;
		this.comentario = comentario;
	}
	
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
