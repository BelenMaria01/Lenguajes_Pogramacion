package Ejercicio12;

import java.util.Scanner;

/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
 * asignatura Programacion para obtener la media deseada. Hay que tener en cuenta que la nota
 * de primer examen cuenta el 40% y la segunda examen un 60%.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1;
		double nota2;
		double notaFinal;

		System.out.println("Introduce la nota del primer examen");
		nota1 = sc.nextDouble();
		System.out.println("Introduce la nota quieres sacar en el trimestre");
		nota2 = sc.nextDouble();

		notaFinal = ((nota2 * 100) - (nota1 * 40)) / 60;
		
		System.out.println("Para tener un " + nota2 + " en el trimestre necesitas sacar un " + notaFinal + " en el segundo examen.");

	}

}