package exercicio6;

public class Tempo {
	//Tempo com três atributos: horas, minutos e segundos.
	
	private int horas;
	private int min;
	private int seg;
	
	public Tempo() {
		//um para inicializar os atributos com valor zero
		this(0,0,0);
	}
	public Tempo(int horas, int min, int seg) {
		//inicializar os atributos com valores passados como argumentos
		this.horas = horas;
		this.min = min;
		this.seg = seg;
	}
	
	//Funcionar como getter e setter.
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	 
	//Imprimir os atributos no formato hh:mm:ss.
	public String imprimirEmFormato() {
		return horas + ":" + min + ":" + seg;
	}
	
	//Subtrair dois objetos e colocar o resultado no objeto que o chamou.
	//Somar dois objetos e colocar o resultado no objeto que o chamou.
    private int emSegundos() {
        return (getHoras() * 3600) + (getMin() * 60) + getSeg();
    }
    
    private static Tempo segundosParaTempo(int totalSegundos) {
    	int segundos = totalSegundos;
    	int horas = segundos / 3600;
        segundos -= (horas * 3600);
        int minutos = segundos / 60;
        segundos -= (minutos * 60);
        return new Tempo(horas, minutos, segundos);
    }
    
    public Tempo subtrair(Tempo tempo) {
        return segundosParaTempo(this.emSegundos() - tempo.emSegundos());
    }

    public Tempo somar(Tempo tempo) {
        return segundosParaTempo(this.emSegundos() + tempo.emSegundos());
    }
    
}
