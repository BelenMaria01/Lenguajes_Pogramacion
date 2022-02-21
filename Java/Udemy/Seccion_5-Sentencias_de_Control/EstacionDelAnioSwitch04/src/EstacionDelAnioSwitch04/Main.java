package EstacionDelAnioSwitch04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes;
		String estacion = "Estacion desconocida";
		
		System.out.print("Introduce un numero (1-12): ");
		mes = sc.nextInt();
		
		switch (mes) {
		case 1 : case 2 : case 12 :
			estacion = "Invierno";
			break;
		case 3 : case 4 : case 5 :
			estacion = "Primavera";
			break;
		case 6 : case 7 : case 8:
			estacion = "Verano";
			break;
		case 9 : case 10 : case 11:
			estacion = "Otonio";
		}
		
		System.out.println(estacion);
	}

}
