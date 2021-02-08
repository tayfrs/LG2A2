package exercicio5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.math.BigDecimal;
import java.math.RoundingMode;

//Crie uma classe Data que inclua tr�s atributos: m�s (inteiro), dia (inteiro) e ano
//(inteiro). 

public class Data {
	private int dia;
	private int mes;	
	private int ano;
	
	//Funcionar como um construtor (com par�metros padronizados) com tr�s par�metros para inicializa��o dos tr�s atributos.

	public Data(int dia, int mes, int ano) {
		this.mes = dia;
		this.dia = mes;
		this.ano = ano;
	}
	
	//Funcionar como getter e setter, validando os dados para garantir que os valores s�o reais.
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Imprimir a data, com os campos separados por /
	public String imprimiDataCompleta() {
		return dia + "/" + mes + "/" + ano;
		
	}
	
	
	//Calcular a quantidade de dias do ano at� aquele meses, recebendo como par�metro o n�mero do m�s
	// importar na classe
	public int calculaDias(int mes, int dia) {
		this.mes = mes;
		this.dia = dia;
		int quantidadeDias = (((mes - 1) * 30) + dia);
		
		return quantidadeDias;
	}
}
