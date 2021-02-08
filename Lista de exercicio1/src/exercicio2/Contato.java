package exercicio2;

public class Contato extends Agenda {
	private String telefone;

	public Contato(String nome, String email, String telefone){
		super(nome, email);
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	
}
