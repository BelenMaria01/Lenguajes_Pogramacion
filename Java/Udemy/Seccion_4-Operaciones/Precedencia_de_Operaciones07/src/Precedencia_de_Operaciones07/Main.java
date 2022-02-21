package Precedencia_de_Operaciones07;

public class Main {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int z = ++x + y--;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("El valor del resultado de x + y es:: " + z);

		int resultado = 4 + 5 * 6 / 3;

		System.out.println("El resultado es: " + resultado);
	}
}
