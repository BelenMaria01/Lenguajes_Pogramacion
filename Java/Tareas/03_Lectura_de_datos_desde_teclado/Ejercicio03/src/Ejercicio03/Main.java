package Ejercicio03;

import java.util.Scanner;

/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
 * debe ser introducida por teclad.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un valor que quiere convertir a euros");
		double peseta = sc.nextDouble();

		double euro = peseta / 166.386;

		System.out.println(peseta + " peseta son " + euro + " euros");
	}

}
