package iOrcamento;

public class Desconto {
	private double salarioBruto;
	private double imposto;
	private double previdencia;
	private double transporte;
	private double planoDeSaude;
	private double planoOdontologico;
	
	private double desconto1 = 0;
	private double desconto2 = 0;
	private double desconto3 = 0;
	private double desconto4 = 0;
	private double desconto5 = 0;
	
	private double descontosTotais = 0;
		
	public Desconto(double salarioBruto, double desconto1, double desconto2, double desconto3, double desconto4, double desconto5) {
		this.salarioBruto = salarioBruto;
		this.imposto = desconto1;
		this.previdencia = desconto2;
		this.transporte = desconto3;
		this.planoDeSaude = desconto4;
		this.planoOdontologico = desconto5;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double descontarImposto() {
		desconto1 = this.salarioBruto * imposto;
		return desconto1;
	}
	public double descontarPrevidencia() {
		desconto2 = this.salarioBruto * previdencia;
		return desconto2;
	}
	public double descontarTransporte() {
		desconto3 = this.salarioBruto * transporte;
		return desconto3;
	}
	public double descontarPlanoDeSaude() {
		desconto4 = this.salarioBruto * planoDeSaude;
		return desconto4;
	}
	public double descontarPlanoOtontologico() {
		desconto5 = this.salarioBruto * planoOdontologico;
		return desconto5;
	}
	
	public String mostraDescontosTotaisESalarioLiquido() {
		 double salarioLiquido;		 
		 descontosTotais = (desconto1 + desconto2 + desconto3 + desconto4 + desconto5);			
		 salarioLiquido = (salarioBruto - descontosTotais);
		 
		 return "Os descontos legais são de: " + descontosTotais + " e o salário liquido é de: " + salarioLiquido;
	}
}
