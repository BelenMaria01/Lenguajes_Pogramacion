package Operador_Ternario06;

public class Main {

	public static void main(String[] args) {
		String resultado = (3 > 2) ? "verdadero" : "falso";

		System.out.println("3 es mayor que 2 =  " + resultado);

		int numero = 8;
		resultado = (numero % 2 == 0) ? "par" : "impar";

		System.out.println(numero + " es un numero " + resultado);
	}

}
