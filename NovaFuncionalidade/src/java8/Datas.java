package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import javax.xml.crypto.Data;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2024, Month.JUNE, 7);
		int anos = olimpiadasRio.getYear()-hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		LocalDate poxData = olimpiadasRio.plusYears(10);
		System.out.println(poxData);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(poxData.format(formatador));
		System.out.println(poxData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth mes = YearMonth.now();
		System.out.println(mes);
		

	}

}
