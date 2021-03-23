package iOrcamento;

public class Despesas extends Pessoa{
	private double aluguel;
	private double condominio;
	private double carro;
	private double alimentacao;
	private double lazer;
	private double educacao;
	
	private double sb;
	private double des1;
	private double des2;
	private double des3;
	private double des4;
	private double des5;
	
	private double descontosTotais = 0;
	
	public Despesas(String nome,String cpf, String dataNascimento, double salarioBruto, double desconto1, double desconto2, double desconto3, double desconto4, double desconto5, 
			double d1, double d2, double d3, double d4, double d5, double d6) {
		super(nome, cpf, dataNascimento, salarioBruto, desconto1, desconto2, desconto3, desconto4, desconto5);
		this.aluguel = d1;
		this.condominio= d2;
		this.carro = d3;
		this.alimentacao = d4;
		this.lazer = d5;
		this.educacao = d6;
		
		this.sb = salarioBruto;
		this.des1 = desconto1;
		this.des2 = desconto2;
		this.des3 = desconto3;
		this.des4 = desconto4;
		this.des5 = desconto5;
	}
	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public double getCondominio() {
		return condominio;
	}

	public void setCondominio(double condominio) {
		this.condominio = condominio;
	}

	public double getCarro() {
		return carro;
	}

	public void setCarro(double carro) {
		this.carro = carro;
	}
	
	public double getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(double alimentacao) {
		this.alimentacao = alimentacao;
	}
	public double getLazer() {
		return lazer;
	}
	public void setLazer(double lazer) {
		this.lazer = lazer;
	}
	public double getEducacao() {
		return educacao;
	}
	public void setEducacao(double educacao) {
		this.educacao = educacao;
	}
	/*Get e Set para as despesas*/
	public double getDes1() {
		return des1;
	}
	public void setDes1(double des1) {
		this.des1 = des1;
	}
	public double getDes2() {
		return des2;
	}
	public void setDes2(double des2) {
		this.des2 = des2;
	}
	public double getDes3() {
		return des3;
	}
	public void setDes3(double des3) {
		this.des3 = des3;
	}
	public double getDes4() {
		return des4;
	}
	public void setDes4(double des4) {
		this.des4 = des4;
	}
	public double getDes5() {
		return des5;
	}
	public void setDes5(double des5) {
		this.des5 = des5;
	}
	
	public double mostrarDespesas() {
	
	double descontosLegais = 0;
	double salarioLiquido = 0;
	
	double despesasPessoais = 0;
	double restante = 0;
	
		double conta1;
		double conta2;
		double conta3;
		double conta4;
		double conta5;
		

	conta1 = sb * des1;
	conta2 = sb * des2;
	conta3 = sb * des3;
	conta4 = sb * des4;
	conta5 = sb * des5;
	

	descontosLegais = (conta1 + conta2 + conta3 + conta4 + conta5);
	salarioLiquido = (sb - descontosLegais);
	
	despesasPessoais = aluguel + condominio + carro + alimentacao + lazer + educacao;
	restante = (salarioLiquido - despesasPessoais);
	return  restante;
		
	}
	
	public double adicionaPoupanca() {
		double addPP;
		double valorPP = 0.0;
		addPP = mostrarDespesas();
		
		if (addPP > 350.0) {			
			valorPP = addPP * 0.4;
		}
		return valorPP;
	}
	
}
