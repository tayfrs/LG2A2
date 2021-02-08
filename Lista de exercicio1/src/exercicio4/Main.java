package exercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa("Tayna", 23, "Sebastiao", "Caetana");
		
		System.out.print("Nome: " + pessoa1.getNome());
		System.out.print(" Idade: " +pessoa1.getIdade());
		System.out.print(" Pai: " +pessoa1.getPai());
		System.out.println(" Mãe: " +pessoa1.getMae());

		Pessoa pessoa2 = new Pessoa("Grazi", 24, "Jeronimo", "Cicera");
		
		System.out.print("Nome: " + pessoa2.getNome());
		System.out.print(" Idade: " +pessoa2.getIdade());
		System.out.print(" Pai: " +pessoa2.getPai());
		System.out.print(" Mãe: " +pessoa2.getMae());
	}

}
