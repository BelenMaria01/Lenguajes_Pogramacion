package Ejercicio02;

import java.util.Scanner;

/*
 * Realiza una converso de euros a pesetas. La cantidad de euros que se quiere convertir
 * debe ser introducida por teclado.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor que quiere convertirlo a peseta");
		double euro = sc.nextDouble();

		double peseta = euro * 166.386;

		System.out.println(euro + " euros son " + peseta + " pesetas");
	}

}
