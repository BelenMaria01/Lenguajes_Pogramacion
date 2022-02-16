package Ejercicio09;

import java.util.Scanner;

/*
 * Escribe un programa que calcule el volumen de un cono segun la formula V = (1/3)πr^2h
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double PI = 3.141592654;
		double altura;
		double radio;

		System.out.println("Introduca la altura");
		altura = sc.nextDouble();

		System.out.println("Introduce el radio");
		radio = sc.nextDouble();

		double volumen = (1.0 / 3.0) * PI * radio * radio * altura;

		System.out.println("El volumen del cono es: " + volumen);
	}
}