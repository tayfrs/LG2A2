package iOrcamento;


public class ContaBanco {
	private String nomeBanco;
	private int numeroConta;
	private String agencia;
	
	private double valorPoupanca = 0;
	private double valorCC = 0;
	
//	private Despesas despesas;
	
	public ContaBanco(String nomeBanco, int numeroConta, String agencia){
		this.nomeBanco = nomeBanco;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	/*Metodo Poupanca*/
	public String poupanca() {
		valorPoupanca = 1000.00;
		return "Poupança: " + valorPoupanca;
	}
	/*Metodo Conta Corrente*/
	public String cc() {
		valorCC = 80.00;
		return "Conta Corrente: " + valorCC;
	}
}
