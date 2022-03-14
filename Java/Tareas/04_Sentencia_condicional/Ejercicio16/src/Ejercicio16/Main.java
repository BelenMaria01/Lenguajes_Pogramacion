package Ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String respuesta;
		int puntos = 0;

		System.out.println("Test para saber si tu pareja nos esta siendo infiel.");

		System.out.println("------------------------------");

		System.out.println("1. Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("2. Ha aumentado sus gastos de vestuario.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("3. Ha perdido el interes que mostraba anteriormente por ti.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("4. Ahora se afeita y se asea con mas fecuente (si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia (si es mujer).");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("5. No te deja que mires la agenda de su telefono movil.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("6. A vece tiene llamadas que dice o querer contestar cuando estas tu delante.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("7. Ultimamente se preocupa mas en cuidad la linea y/o estar bonceado/a.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("8. Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("9. Ha notado que ultimamente se perfuma mas.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
		System.out.print("(v)erdadero o (f)also: ");
		respuesta = sc.nextLine();

		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.println("Las puntuaciones son: " + puntos);

		if (puntos >= 0 && puntos <= 10) {
			System.out.println("Felicidades! tu pareja parece ser totalmente fiel.");
		}

		if (puntos >= 11 && puntos <= 22) {
			System.out.println("Quizas exista el peligro de otras personas en su vida o en su mente, aunque seguramente sera algo sin importancia. No baje la guardias.");
		}

		if (puntos >= 22 && puntos <= 30) {
			System.out.println("Tu pareja tiene todo los ingrediente para estar viviendo un romance con otras persona. Te aconsejamos que indagues un poco mas y averigües que es lo que esta pasando por su cabeza.");
		}
	}
}
