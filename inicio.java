package edu.fechas.java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una fecha");
		
		String inputFecha1 = sc.nextLine();
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaEscogida1 = LocalDate.parse(inputFecha1, formatter1);
		
        System.out.println("Ingrese la segunda fecha");
        String inputFecha2 = sc.nextLine();
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaEscogida2 = LocalDate.parse(inputFecha2, formatter2);
        
        Period periodo = Period.between(fechaEscogida1,fechaEscogida2); 
		
        System.out.println("Diferencia en días: " + periodo.getDays());
        System.out.println("Diferencia en meses: " + periodo.getMonths());
        System.out.println("Diferencia en años: " + periodo.getYears());
	}

}
