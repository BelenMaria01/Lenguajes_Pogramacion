package Ejercicio29;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String comida, pitufo;
		String bebida;
		String resultadoComida = " ", resultadoBebida = " ";
		double precioComida = 0;
		double precioBebida = 0;

		System.out.println("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
		comida = sc.nextLine();

		// LAS COMIDAS
		if (comida.equals("palmera")) {
			resultadoComida = "Palmera: 1,40€";
			precioComida = 1.40;

		}
		if (comida.equals("donut")) {
			resultadoComida = "Donut: 1€";
			precioComida = 1;
		}
		if (comida.equals("pitufo")) {
			System.out.println("¿Con que se ha tomado el pitufo? (aceite o tortilla): ");
			pitufo = sc.nextLine();

			if (pitufo.equals("aceite")) {
				resultadoComida = "Pitufo con aceite: 1,20€";
				precioComida = 1.20;
			} else {
				resultadoComida = "Pitufo con tortilla: 1,60€";
				precioComida = 1.60;
			}
		}

		// LAS BEBIDAS
		System.out.println("¿Que ha tomado de beber? (zumo o cafe): ");
		bebida = sc.nextLine();

		if (bebida.equals("zumo")) {
			precioBebida = 1.50;
			resultadoBebida = "Zumo: 1,50€";
		} else {
			precioBebida = 1.20;
			resultadoBebida = "Cafe: 1,20€";
		}
		System.out.println(resultadoComida);
		System.out.println(resultadoBebida);
		System.out.printf("Total Desayuno: %.2f €", precioComida + precioBebida);

	}
}
