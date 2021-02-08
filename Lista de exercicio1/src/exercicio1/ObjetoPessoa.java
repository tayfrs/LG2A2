package exercicio1;

public class ObjetoPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa("Tayna", 1.62, 1998);
				
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAltura());
		System.out.println(pessoa1.getAnoDeNascimento());
		
		System.out.println(pessoa1.calculoIdade());
	}

}
