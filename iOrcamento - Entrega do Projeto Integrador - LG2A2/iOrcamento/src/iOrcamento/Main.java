package iOrcamento;
import java.time.*;

public class Main {

	public static void main(String[] args) {
				
		
		
		/*Instanciando Pessoa*/
		 Pessoa orcamento1 = new Pessoa("José Ferreira Diniz", "222.222.222-22","05/05/1981", 4000.00, 0.14, 0.06, 0.0, 0., 0.04);		 
		 
		 orcamento1.setNome("José Ferreira Diniz");
		 orcamento1.setCpf("CPF: " + "222.222.222-22");
		 orcamento1.setDataNascimento("Data de Nascimento: " + "05/05/1981");
		 System.out.println(orcamento1.getNome());
		 System.out.println(orcamento1.getCpf());
		 System.out.println(orcamento1.getDataNascimento());
		 
		 
		 /*Desconto*/
		 orcamento1.descontarImposto();
		 System.out.println("");
		 System.out.println("Descontos:");
		 System.out.println("Imposto: " + orcamento1.descontarImposto());
		 System.out.println("Previdência: " + orcamento1.descontarPrevidencia());
		 System.out.println("Transporte: " + orcamento1.descontarTransporte());
		 System.out.println("Plano de Saúde: " + orcamento1.descontarPlanoDeSaude());
		 System.out.println("Plano Odontologico: " + orcamento1.descontarPlanoOtontologico());		 
		 System.out.println(orcamento1.mostraDescontosTotaisESalarioLiquido());
		 //System.out.println("Salario Liquido de " + orcamento1.getNome() + " é de " + orcamento1.mostraSalarioLiquido(orcamento1.getSalarioBruto()));
		 
		 /*Despesas*/
		/*Orçamento 2*/
		 System.out.println("");
		 Despesas orcamento2 = new Despesas("Hernan Crespo", "666.666.666-66", "06/09/1970", 6000.0, 0.16, 0.06, 0.0, 0.02, 0.0, 1500.00, 980.00, 675.00, 700.00, 150.00, 180.00);
		 System.out.println(orcamento2.getNome());
		 System.out.println(orcamento2.getCpf());
		 System.out.println(orcamento2.getDataNascimento());
		 
		 /*Desconto*/
		 orcamento2.descontarImposto();
		 System.out.println("");
		 System.out.println("Descontos:");
		 System.out.println("Imposto: " + orcamento2.descontarImposto());
		 System.out.println("Previdência: " + orcamento2.descontarPrevidencia());
		 System.out.println("Transporte: " + orcamento2.descontarTransporte());
		 System.out.println("Plano de Saúde: " + orcamento2.descontarPlanoDeSaude());
		 System.out.println("Plano Odontologico: " + orcamento2.descontarPlanoOtontologico());		 
		 System.out.println(orcamento2.mostraDescontosTotaisESalarioLiquido());
		
		 /*Despesas Pessoais*/
		 System.out.println("");
		 System.out.println("Despesas Pessoais:");
		 System.out.println("Aluguel: " + orcamento2.getAluguel());
		 System.out.println("Condomínio: " + orcamento2.getCondominio());
		 System.out.println("Carro: " + orcamento2.getCarro());
		 System.out.println("Alimentação: " + orcamento2.getAlimentacao());
		 System.out.println("Lazer: " + orcamento2.getLazer());		 
		 System.out.println("Educacao: " + orcamento2.getEducacao());
		 System.out.println("");
		 System.out.println("Sobra: " + orcamento2.mostrarDespesas());
		 
		 /*Poupança e CC*/
		 System.out.println("");
		 LocalDateTime  adicionadoNaPoupanca = LocalDateTime.of(2021, Month.FEBRUARY,  19,   15,   26);
		 System.out.println("Data:" + adicionadoNaPoupanca);
		 System.out.println("Adicionado na Poupança: " + orcamento2.adicionaPoupanca());
		 
		 /*Conta Banco*/
		 System.out.println("");
		 LocalDateTime  dataBanco = LocalDateTime.of(2021, Month.FEBRUARY,  19,   15,   26);
		 System.out.println("Data:" + dataBanco);
		 ContaBanco hernanCrespo = new ContaBanco("Banco Next", 45454545, "06060-06");
		 System.out.println("Banco: " + hernanCrespo.getNomeBanco());
		 System.out.println("Agência: " + hernanCrespo.getAgencia());
		 System.out.println("Conta: " + hernanCrespo.getNumeroConta());
	}

}
