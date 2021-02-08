package exercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda agenda1 = new Agenda("Tayna", "tayna.floor@gmail.com");
		
		Contato contato1 = new Contato("Tayna", "tayna.floor@gmail.com", "11951504499");
		
		Agenda agenda2 = new Agenda("Grazi", "Grazi.a+linda@gmail.com");
		
		Contato contato2 = new Contato ("Grazi", "Grazi.a+linda@gmail.com", "1192228890");
		
		System.out.println(agenda1.getNome());
		System.out.println(agenda1.getEmail());
		System.out.println(contato1.getTelefone());
		
		System.out.println(agenda2.getNome());
		System.out.println(agenda2.getEmail());
		System.out.println(contato2.getTelefone());
	}


}
