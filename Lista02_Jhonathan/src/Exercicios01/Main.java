package Exercicios01;
import java.time.*;


public class Main {
	
		
	public static double aluguel;
	public static double poupanca;
	public static double cartao;
	public static double viagem;
	
	
	public static void escolheOpcao(double salario, Orcamento opcao){
		
		if(opcao == Orcamento.ALUGUEL){
			aluguel = salario * 0.3;
			LocalDateTime  pagamentoAluguel = LocalDateTime.of(2021, Month.FEBRUARY,  19,   15,   26); 
			System.out.println("Aluguel: " + aluguel);
			System.out.println("Data de Pagamento: " + pagamentoAluguel);
			System.out.println();
		}
		
		else if(opcao == Orcamento.POUPANCA){
			
			poupanca = salario * 0.2;
			LocalDateTime  pagamentoPoupanca = LocalDateTime.of(2021, Month.FEBRUARY,  25,   15,   26); 
			System.out.println("Poupanca: " + poupanca);
			System.out.println("Data de Pagamento: " + pagamentoPoupanca);
			System.out.println();
			
		}
		
		else if(opcao == Orcamento.CARTAO){
			
			cartao = salario * 0.35;
			LocalDateTime  pagamentoCartao = LocalDateTime.of(2021, Month.FEBRUARY,  12,   15,   26); 
			System.out.println("Cartão: " + cartao);
			System.out.println("Data de Pagamento: " + pagamentoCartao);
			System.out.println();
		} 
		
		else if(opcao == Orcamento.VIAGEM){
			
			viagem = salario * 0.15;
			LocalDateTime  pagamentoViagem = LocalDateTime.of(2021, Month.FEBRUARY,  25,   15,   26); 
			System.out.println("Viagem: " + viagem);
			System.out.println("Data de Pagamento: " + pagamentoViagem);
			System.out.println();
		} 
		
		}
	
	public static void main(String[] args) {
		
		System.out.print("Salário: ");
		Moeda salario = new Moeda("5458.89");
		
		System.out.println(salario.getValorFormatado());
		System.out.println();
		
		escolheOpcao(5000.00, Orcamento.ALUGUEL);
		escolheOpcao(5000.00, Orcamento.POUPANCA);
		escolheOpcao( 5000.00, Orcamento.CARTAO);
		escolheOpcao(5000.00, Orcamento.VIAGEM);
		

	}
	
}
