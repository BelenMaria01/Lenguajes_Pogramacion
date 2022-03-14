package Ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasTrabajo;
		int sueldoSemanal;

		System.out.println("Por favor, introduzca el numero de horas trabajadas durante la semana: ");
		horasTrabajo = sc.nextInt();

		if (horasTrabajo <= 40) {
			sueldoSemanal = 12 * horasTrabajo;
		} else {
			sueldoSemanal = (40 * 12) + ((horasTrabajo - 40) * 16);
		}

		System.out.println("el sueldo semanal que le corresponde es de :" + sueldoSemanal + " euros.");
	}
}
