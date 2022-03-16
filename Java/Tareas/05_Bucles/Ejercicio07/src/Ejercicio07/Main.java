package Ejercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int intento = 4;
		boolean acierto = false;

		while ((intento > 0) && (!acierto)) {
			System.out.println("Introduce el password de la caja fuerte.");
			numero = sc.nextInt();

			if (numero == 1234) {
				acierto = true;
			} else {
				System.out.println("Password incorrecto.");
			}
			intento--;
		}

		if (acierto) { // acierto == true
			System.out.println(" ");
			System.out.println("Has abierto la caja fuerte.");
		} else {
			System.out.println(" ");
			System.out.println("No has podido abrir la caja fuerte.");
		}
	}

}
