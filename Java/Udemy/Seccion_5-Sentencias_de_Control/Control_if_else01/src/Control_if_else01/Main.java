package Control_if_else01;

public class Main {

	public static void main(String[] args) {
		boolean condicion = true;

		if (condicion) { // condicion == true
			System.out.println("La condicion es verdadera.");
		} else {
			System.out.println("La condicion es falso.");
		}

		int numero = 2;
		String numeroTexto = "Numero desconocido";

		if (numero == 1) {
			numeroTexto = "Numero uno";
		} else if (numero == 2) {
			numeroTexto = "Numero dos";
		} else if (numero == 3) {
			numeroTexto = "Numero tres";
		} else if (numero == 4) {
			numeroTexto = "Numero cuatro";
		} else {
			System.out.println(numeroTexto);
		}

		System.out.println(numeroTexto);
	}
}
