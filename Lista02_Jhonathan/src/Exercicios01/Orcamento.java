package Exercicios01;

public enum Orcamento {
	POUPANCA(1), CARTAO(2), ALUGUEL(3), VIAGEM(4);

	private final int valor;
	Orcamento(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
	return valor;
	}
}
