package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instancia_data_hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter  fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter  fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();//local
		
		Instant d03 = Instant.now();//global
		
		LocalDate d04 =LocalDate.parse("2026-03-11");
		LocalDateTime d05 = LocalDateTime.parse("2026-03-11T14:03:26");
		Instant d06 = Instant.parse("2026-03-11T14:03:26z");
		Instant d07 = Instant.parse("2026-03-11T14:03:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2026",fmt1);
		LocalDate d09 = LocalDate.parse("20/07/2026 03:30",fmt2);
		LocalDate d10 = LocalDate.of(2026, 3, 11);
		LocalDateTime d11 = LocalDateTime.of(2026, 3, 11, 14, 35);
		
		
		System.out.println("d01= "+d01.toString());
		System.out.println("d02= "+d02.toString());
		System.out.println("d03= "+d03.toString());
		System.out.println("d04= "+d04.toString());
		System.out.println("d05= "+d05.toString());
		System.out.println("d06= "+d06.toString());
		System.out.println("d07= "+d07.toString());
		System.out.println("d08= "+d08.toString());
		System.out.println("d09= "+d09.toString());
		System.out.println("d010= "+d10.toString());
		System.out.println("d011= "+d11.toString());
		
	}

}
