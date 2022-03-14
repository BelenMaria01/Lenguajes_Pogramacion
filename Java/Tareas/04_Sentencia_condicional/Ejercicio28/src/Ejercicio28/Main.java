package Ejercicio28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String jugador1;
		String jugador2;

		System.out.print("Turno del jugador 1 (Introduce piedra, papel o tijera): ");
		jugador1 = sc.nextLine();
		System.out.print("Turno del jugador 2 (Introduce piedra,papel o tijera): ");
		jugador2 = sc.nextLine();

		if (jugador1.equals(jugador2)) {
			System.out.println("Empate.");
		} else if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
			System.out.println("Gana el jugador 1.");
		} else {
			System.out.println("Gana el jugador 2.");
		}
	}

}
