package Ejercicio10;

import java.util.Scanner;

/*
 * Realiza un conversor de Mb a Kb
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mb;

		System.out.println("Introduce el valor de Mb que quiera convertir");
		mb = sc.nextInt();

		int kb = mb * 1024;

		System.out.println(mb + "Mb son " + kb + " Kb.");
	}
}
