package EstacionDelAnio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mes;
		String estacion = "Estacion Desconocida";
		
		System.out.print("Introduce un mes del año: ");
		mes = sc.nextInt();

		if (mes == 1 || mes == 2 || mes == 12) {
			estacion = "Inviierno";
		} else if (mes == 3 || mes == 4 || mes == 5) {
			estacion = "Primavera";
		} else if (mes == 6 || mes == 7 || mes == 8) {
			estacion = "Verano";
		} else if (mes == 9 || mes == 10 || mes == 11) {
			estacion = "Otonio";
		}
		System.out.println(estacion);
	}
}
