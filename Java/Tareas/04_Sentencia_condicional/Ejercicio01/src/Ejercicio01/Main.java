package Ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia;
		System.out.println("Introduce un dia de la semana");
		dia = sc.nextLine();

		switch (dia) {
		case "lunes":
			System.out.println("8:30 - 9:30 : PHP");
			System.out.println("9:30 - 10:30 : Android");
			System.out.println("10:30 - 11: 30 : Java");
			System.out.println("11:30 - 12:00 : Recreo");
			System.out.println("12:00 - 13:00 : Node.js");
			System.out.println("13:00 - 14:00 : JavaScript");
			System.out.println("14:00 - 15:00 : Angular");
			break;
		case "martes":
			System.out.println("8:30 - 9:30 : PHP");
			System.out.println("9:30 - 10:30 : Android");
			System.out.println("10:30 - 11: 30 : Java");
			System.out.println("11:30 - 12:00 : Recreo");
			System.out.println("12:00 - 13:00 : Node.js");
			System.out.println("13:00 - 14:00 : JavaScript");
			System.out.println("14:00 - 15:00 : Angular");
			break;
		case "miercoles":
			System.out.println("8:30 - 9:30 : PHP");
			System.out.println("9:30 - 10:30 : Android");
			System.out.println("10:30 - 11: 30 : Java");
			System.out.println("11:30 - 12:00 : Recreo");
			System.out.println("12:00 - 13:00 : Node.js");
			System.out.println("13:00 - 14:00 : JavaScript");
			System.out.println("14:00 - 15:00 : Angular");
			break;
		case "jueves":
			System.out.println("8:30 - 9:30 : PHP");
			System.out.println("9:30 - 10:30 : Android");
			System.out.println("10:30 - 11: 30 : Java");
			System.out.println("11:30 - 12:00 : Recreo");
			System.out.println("12:00 - 13:00 : Node.js");
			System.out.println("13:00 - 14:00 : JavaScript");
			System.out.println("14:00 - 15:00 : Angular");
			break;
		case "viernes":
			System.out.println("8:30 - 9:30 : PHP");
			System.out.println("9:30 - 10:30 : Android");
			System.out.println("10:30 - 11: 30 : Java");
			System.out.println("11:30 - 12:00 : Recreo");
			System.out.println("12:00 - 13:00 : Node.js");
			System.out.println("13:00 - 14:00 : JavaScript");
			System.out.println("14:00 - 15:00 : Angular");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Es descanso!!");
			break;
		default:
			System.out.println("Introduccion erronea.");
		}
	}
}
