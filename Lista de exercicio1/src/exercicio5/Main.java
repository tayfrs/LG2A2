package exercicio5;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import java.time.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate data = LocalDate.now();
		
		Data data1 = new Data(02, 25, 2021);
		
		//Imprimir a data, com os campos separados por /.
		System.out.println(data1.imprimiDataCompleta());

		System.out.println(data1.calculaDias(02, 05));
	}

}
