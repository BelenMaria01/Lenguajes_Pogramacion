package Ejercicio04;

import java.util.Scanner;

/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Introduce un numero entero");
		num1 = sc.nextInt();
		System.out.println("Introduce otro numero entero");
		num2 = sc.nextInt();

		System.out.println("La suma de los dos numero es: " + (num1 + num2));
		System.out.println("La resta de los dos numero es: " + (num1 - num2));
		System.out.println("La multiplicacion de los dos numero es: " + (num1 * num2));
		System.out.println("La division de los dos numero es: " + (num1 / num2));

	}
}
