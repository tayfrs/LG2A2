package iOrcamento;

public class Pessoa extends Desconto {
	public String nome;
	public String cpf;
	public String dataNascimento;
	
	public Pessoa(String nome,String cpf, String dataNascimento, double salarioBruto, double desconto1, double desconto2, double desconto3, double desconto4, double desconto5) {
		super(salarioBruto, desconto1, desconto2, desconto3, desconto4, desconto5);
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
