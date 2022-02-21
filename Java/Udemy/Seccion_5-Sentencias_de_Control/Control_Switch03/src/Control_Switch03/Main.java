package Control_Switch03;

public class Main {

	public static void main(String[] args) {
		int numero = 2;
		String numeroTexto = "Valor desconocido";

		switch (numero) {
		case 1:
			numeroTexto = "Numero uno";
			break;
		case 2:
			numeroTexto = "Numero dos";
			break;
		case 3:
			numeroTexto = "Numero tres";
			break;
		case 4:
			numeroTexto = "Numero cuatro";
			break;
		default:
			numeroTexto = "Caso no encontrado";
		}
		System.out.println(numeroTexto);
	}
}
