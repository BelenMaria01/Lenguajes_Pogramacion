package Ejercicio02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas;
		System.out.println("Introduce una hora del día (0 - 23):");
		horas = sc.nextInt();

		if (horas >= 6 && horas <= 12) {
			System.out.println("Buenos dias.");
		} else if (horas >= 13 && horas <= 20) {
			System.out.println("Buenas tardes.");
		} else if (horas >= 21 && horas < 24 || horas <= 5 && horas >= 0) {
			System.out.println("Buenas noches.");
		}
	}
}
