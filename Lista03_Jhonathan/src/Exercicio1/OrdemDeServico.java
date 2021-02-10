package Exercicio1;
//import java.util.ArrayList; 

public class OrdemDeServico {
	private int codigo;
	private Cliente cliente;
	
	private Servico[]  servico;
	private int posicaoLivre;
	private Mecanico[] mecanico;
	private int posicaoLivreMecanico;
	private double soma;
	
	public OrdemDeServico() {
		this.codigo = codigo;
		this.cliente = cliente;
		this.servico = new Servico[10];
		this.posicaoLivre = 0;
		this.mecanico = new Mecanico[10];
		this.posicaoLivreMecanico = 0;
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionaServico(Servico serv) {
		servico[this.posicaoLivre] = serv;
		//this.posicaoLivre++;
	}
	public void adicionaMecanico(Mecanico mec) {
		mecanico[this.posicaoLivreMecanico] = mec;
	}
	
	public double calculaValorTotal() {
		soma = posicaoLivre++;
		return soma;
	}
	
	public boolean possuiServico(int codigoServico) {
		Servico verificaServico = new Servico(codigo, null, soma);
		if (codigoServico == verificaServico.getCodigo()){
			return true;
		} 
		return false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
