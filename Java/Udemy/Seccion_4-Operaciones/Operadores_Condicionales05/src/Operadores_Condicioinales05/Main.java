package Operadores_Condicioinales05;

public class Main {

	public static void main(String[] args) {

		int valor = 10;
		int valorMin = 0;
		int valorMax = 10;

		var resultado = valor >= 0 && valor <= 10;

		if (resultado) { // Es igual que poner --> resultado == true
			System.out.println("Dentro del rango.");
		} else {
			System.out.println("Fuera del rango.");
		}

		boolean vacaciones = false;
		boolean diaDescanso = false;

		if (vacaciones || diaDescanso) { // tambien se pone asi --> vacaciones == false || diaDescanso == false
			System.out.println("El padre puede asistir al juego del hijo.");
		} else {
			System.out.println("El padre esta ocupado.");
		}
	}
}
