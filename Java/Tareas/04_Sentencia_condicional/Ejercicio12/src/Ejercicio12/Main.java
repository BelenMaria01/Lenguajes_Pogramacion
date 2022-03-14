package Ejercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String respuesta;
		int contador = 0;

		System.out.println("Esto es un cuestonario de 10 pregunta cada pregunta se suma un puntos,");
		System.out.println("pero si te equivoca te restara un punto. ¿Estas listo? empezamos.");

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		// Empieza la preguntas
		// Pregunta 1
		System.out.println("1. ¿Cual es una frase celebre de LaCosa?");
		System.out.println("a) Me voy  dormir porque tengo hambre.");
		System.out.println("b) Picaporte.");
		System.out.println("c) Uhhggg sentimiento.");
		respuesta = sc.nextLine();

		// Puntos
		if (respuesta.equals("c")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 2
		System.out.println("2. ¿Quien tiene el sindrome Mirmiano?");
		System.out.println("a) LordSebax.");
		System.out.println("b) MirianAragunde.");
		System.out.println("c) Postproductor.");
		respuesta = sc.nextLine();

		// Puntos
		if (respuesta.equals("b")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Puntos
		System.out.println("3. ¿Quien dijo la frase 'Esto va mal vamonos a Skype'?");
		System.out.println("a) Postproductor.");
		System.out.println("b) LaCosa.");
		System.out.println("c) JoseTP14.");
		respuesta = sc.nextLine();

		// Puntos
		if (respuesta.equals("a")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 4
		System.out.println("4. ¿Cual es una frase celebre de LaCosa?");
		System.out.println("a) Me voy  dormir porque tengo hambre.");
		System.out.println("b) Picaporte.");
		System.out.println("c) Uhhggg sentimiento.");
		respuesta = sc.nextLine();

		// Puntos
		if (respuesta.equals("c")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 5
		System.out.println("5. ¿Quien tiene de profesion de cocinero?");
		System.out.println("a) Eva.");
		System.out.println("b) JoseTP14.");
		System.out.println("c) Anais.");
		respuesta = sc.nextLine();

		// Puntos.
		if (respuesta.equals("b")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 6
		System.out.println("6. ¿Quien es una hater?");
		System.out.println("a) Noe.");
		System.out.println("b) MirianAragunde.");
		System.out.println("c) Eva.");
		respuesta = sc.nextLine();

		// Puntos
		if (respuesta.equals("c")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 7
		System.out.println("7. Elige la respuesta incorrecta:");
		System.out.println("a) Cuando Mir hace una raid la gente le dice 'Gracias Miriana Ragunde'.");
		System.out.println("b) Cuando Mir hace una raid la gente le dice 'Gracias Mirian Aagunde.");
		System.out.println("c) Cuando Mir hace una raid la gente le dice 'Gracias Mir.");
		respuesta = sc.nextLine();

		// Puntos.
		if (respuesta.equals("a")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 8
		System.out.println("8. ¿Quién descrubrio el sindrome mirmiano?");
		System.out.println("a) Postproductor.");
		System.out.println("b) Alelo.");
		System.out.println("c) LordSebax.");
		respuesta = sc.nextLine();

		// Puntos.
		if (respuesta.equals("c")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 9
		System.out.println("9. ¿Que juego no juega MirianAragunde?");
		System.out.println("a) Minecraft.");
		System.out.println("b) Cualquier juego de miedo.");
		System.out.println("c) Aventura Grafia.");
		respuesta = sc.nextLine();

		// Puntos.
		if (respuesta.equals("b")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		// Pregunta 10
		System.out.println("10. ¿Quien es mas sexy?");
		System.out.println("a) LaCosa.");
		System.out.println("b) LaCosa.");
		System.out.println("c) LaCosa.");
		respuesta = sc.nextLine();

		// Puntos
		if (respuesta.equals("a") || respuesta.equals("b") || respuesta.equals("c")) {
			System.out.println("Correcto");
			contador++;
		} else {
			System.out.println("Incorrecto");
			contador--;
		}

		System.out.println("El resultado de las pregunta son " + contador + " puntos.");
	}

}
