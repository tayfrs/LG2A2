package exercicio5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.math.BigDecimal;
import java.math.RoundingMode;

//Crie uma classe Data que inclua três atributos: mês (inteiro), dia (inteiro) e ano
//(inteiro). 

public class Data {
	private int dia;
	private int mes;	
	private int ano;
	
	//Funcionar como um construtor (com parâmetros padronizados) com três parâmetros para inicialização dos três atributos.

	public Data(int dia, int mes, int ano) {
		this.mes = dia;
		this.dia = mes;
		this.ano = ano;
	}
	
	//Funcionar como getter e setter, validando os dados para garantir que os valores são reais.
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
	
	
	//Calcular a quantidade de dias do ano até aquele meses, recebendo como parâmetro o número do mês
	// importar na classe
	public int calculaDias(int mes, int dia) {
		this.mes = mes;
		this.dia = dia;
		int quantidadeDias = (((mes - 1) * 30) + dia);
		
		return quantidadeDias;
	}
}
