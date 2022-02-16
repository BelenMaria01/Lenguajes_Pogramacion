package Ejercicio11;

import java.util.Scanner;

/*
 * Realizar un conversor de Kb a Mb.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kb;

		System.out.println("Introduce el valor de Kb que quiere convertir");
		kb = sc.nextInt();

		int mb = kb / 1024;

		System.out.println(kb + "kb son " + mb + "Mb");
	}
}
