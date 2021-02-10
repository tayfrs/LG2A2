package Exercicio1;

public class Oficina {
	private OrdemDeServico[] ordemServico;

	public Oficina() {
		this.ordemServico = new OrdemDeServico[10];
	} 
	
	public void adicionaOS() {
		
	}
	
	public OrdemDeServico buscaOsCodigos(int codigo) {
		OrdemDeServico chamaCodigo = new OrdemDeServico();
		if (codigo == chamaCodigo.getCodigo()){
			return chamaCodigo;
		}
		return null;
	}

}

