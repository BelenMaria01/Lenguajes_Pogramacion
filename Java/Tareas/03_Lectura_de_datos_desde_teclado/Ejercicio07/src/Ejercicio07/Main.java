package Ejercicio07;

import java.util.Scanner;

/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double baseImponible;
		System.out.printf("introduzca la base imponible (precio del artículo sin IVA): ");
		baseImponible = sc.nextDouble();

		System.out.printf("Base imponible %8.2f\n", baseImponible);
		System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
		System.out.println("-----------------------");
		System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));

	}
}
