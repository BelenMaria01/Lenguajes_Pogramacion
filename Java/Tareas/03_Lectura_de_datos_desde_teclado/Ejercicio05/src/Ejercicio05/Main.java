package Ejercicio05;

import java.util.Scanner;

/*
 * Escribe un programa que calcule el área de un rectangulo
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int base;
		int altura;

		System.out.println("Introduce el base del rectangulo");
		base = sc.nextInt();
		System.out.println("Introduce la altura del rectangulo");
		altura = sc.nextInt();

		System.out.println("El area del rectangulo es: " + (base * altura));
	}

}
