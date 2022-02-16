package Ejercicio08;

import java.util.Scanner;

/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a la horas
 * trabajadas, a razón de 12 euros la hora.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasTrabajados;

		System.out.println("Introduzca el numero de hora trabajada durante la semana");
		horasTrabajados = sc.nextInt();

		System.out.println("Su salario semanal es de " + (horasTrabajados * 12) + " euros");
	}

}
