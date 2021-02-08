package exercicio3;

public class Aluno {
	
	private String matricula;
	private String nome;
	private double prova1;
	private double prova2;
	private double trabalho;
	private double media;
	private double soma;

	public Aluno(String matricula, String nome, double prova1, double prova2, double trabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho = trabalho;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getProva1() {
		return prova1;
	}

	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}

	public double getProva2() {
		return prova2;
	}

	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	
	public double calculoMedia(double prova1, double prova2, double trabalho) {
		soma = prova1 + prova2 + trabalho;
		media = soma/3;		
		return media;
	}
	
	public String resultado(double media) {
	if(media >= 6) {
		return "Aprovado";
	}else if (media < 6 && media >= 4) {
		return "IFA";
	}else {
		return "Reprovado";
	}
	}
}
