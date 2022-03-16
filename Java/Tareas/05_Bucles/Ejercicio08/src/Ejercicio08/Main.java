package Ejercicio08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Introduce un numero entero:");
		numero = sc.nextInt();

		System.out.println("La tabla de multiplicar de " + numero);
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}
}
