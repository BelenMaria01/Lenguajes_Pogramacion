package Ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Introduce un numero ( 1-7 ): ");
		numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println(numero + " - Lunes.");
			break;
		case 2:
			System.out.println(numero + " - Martes.");
			break;
		case 3:
			System.out.println(numero + " - Miercoles.");
			break;
		case 4:
			System.out.println(numero + " - Jueves");
			break;
		case 5:
			System.out.println(numero + " - Viernes.");
			break;
		case 6:
			System.out.println(numero + " - Sabado.");
			break;
		case 7:
			System.out.println(numero + " - Domingo.");
			break;
		default:
			System.out.println("Error.");
		}
		
	}

}
