package exercicio6;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tempo tempo1 = new Tempo(13, 15, 25);
		Tempo tempo2 = new Tempo(5, 0, 35);
		
		System.out.println(tempo1.somar(tempo1));
		tempo1.imprimirEmFormato();
		System.out.println(tempo2.subtrair(tempo1));
		

	}

}