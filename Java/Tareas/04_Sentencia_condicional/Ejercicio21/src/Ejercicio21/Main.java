package Ejercicio21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double exam1, exam2;

		System.out.print("Nota de primer examen: ");
		exam1 = sc.nextDouble();
		System.out.print("Nota de segundo examen: ");
		exam2 = sc.nextDouble();

		double media = (exam1 + exam2) / 2;
		
		 if (media < 5) {
		      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
		      String recuperacion = System.console().readLine();
		      if (recuperacion.equals("apto")) {
		        media = 5;
		      }
		    }
		    
		    System.out.print("Tu nota de Programación es " + media);
	}

}
