package exercicio1;

/*Nome, altura e data nascimento*/
public class Pessoa {
	private String nome;
	private double altura;
	private int anoDeNascimento;
	private int resultado;
	
	public Pessoa(String nome, double altura, int anoDeNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public int calculoIdade() {
		resultado = 2021 - anoDeNascimento;		
		return resultado;
	}
	
}
