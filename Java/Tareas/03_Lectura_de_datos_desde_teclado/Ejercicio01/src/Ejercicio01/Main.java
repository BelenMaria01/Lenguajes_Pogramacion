package Ejercicio01;

import java.util.Scanner;

/*
 * Realiza un programa que pida dos números y que luego meustre el resultado
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entero");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero entero");
		int num2 = sc.nextInt();

		System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + (num1 * num2));

	}

}
