package Ejercicio06;

import java.util.Scanner;

/*
 * Escribe un programa que calcule el area de un triangulo
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int base;
		int altura;

		System.out.println("Introduce la base del triangulo");
		base = sc.nextInt();
		System.out.println("Introduce la altura del trangulo");
		altura = sc.nextInt();

		System.out.println("el area del triangulo es: " + (base * altura) / 2);

	}

}
