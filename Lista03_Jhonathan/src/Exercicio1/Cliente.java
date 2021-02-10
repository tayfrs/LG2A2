package Exercicio1;

public class Cliente extends Pessoa {
	private String telefone;



	public Cliente(String cpf, String nome, String telefone) {
		super(cpf, nome);
		this.telefone = telefone;
		// TODO Auto-generated constructor stub
	}
	

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
}
