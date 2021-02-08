package exercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno ("SP3050173", "Tayna", 9.80, 7.00, 8.9);

		System.out.print("Matricula: " + aluno1.getMatricula());
		System.out.print(" Nome: " + aluno1.getNome());
		System.out.print(" Prova 1: " + aluno1.getProva1());
		System.out.print(" Prova 2: " + aluno1.getProva2());
		System.out.println(" Trabalho: " + aluno1.getTrabalho());
		System.out.println("Media: " + aluno1.calculoMedia(aluno1.getProva1(), aluno1.getProva2(), aluno1.getTrabalho()));
		System.out.println("Resultado: " + aluno1.resultado(aluno1.calculoMedia(aluno1.getProva1(), aluno1.getProva2(), aluno1.getTrabalho())));
		
		Aluno aluno2 = new Aluno ("SP3050174", "Grazi", 4.7, 7.00, 2.9);
		
		System.out.print("\nMatricula: " + aluno2.getMatricula());
		System.out.print(" Nome: " + aluno2.getNome());
		System.out.print(" Prova 1: " + aluno2.getProva1());
		System.out.print(" Prova 2: " + aluno2.getProva2());
		System.out.println(" Trabalho: " + aluno2.getTrabalho());
		System.out.println("Media: " + aluno2.calculoMedia(aluno2.getProva1(), aluno2.getProva2(), aluno2.getTrabalho()));
		System.out.println("Resultado: " + aluno2.resultado(aluno2.calculoMedia(aluno2.getProva1(), aluno2.getProva2(), aluno2.getTrabalho())));
	
		Aluno aluno3 = new Aluno ("SP3050179", "Lucas", 2.7, 5.0, 2.9);
		
		System.out.print("\nMatricula: " + aluno3.getMatricula());
		System.out.print(" Nome: " + aluno3.getNome());
		System.out.print(" Prova 1: " + aluno3.getProva1());
		System.out.print(" Prova 2: " + aluno3.getProva2());
		System.out.println(" Trabalho: " + aluno3.getTrabalho());
		System.out.println("Media: " + aluno3.calculoMedia(aluno3.getProva1(), aluno3.getProva2(), aluno3.getTrabalho()));
		System.out.println("Resultado: " + aluno3.resultado(aluno3.calculoMedia(aluno3.getProva1(), aluno3.getProva2(), aluno3.getTrabalho())));
	}

}
