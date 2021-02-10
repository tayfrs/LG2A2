package Exercicio1;

public class Mecanico extends Pessoa {
	private String especialidade;

	public Mecanico(String cpf, String nome, String especialidade) {
		super(cpf, nome);
		this.especialidade = especialidade;
		// TODO Auto-generated constructor stub
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
