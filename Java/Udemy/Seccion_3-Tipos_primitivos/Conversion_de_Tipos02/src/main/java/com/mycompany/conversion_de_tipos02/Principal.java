/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversion_de_tipos02;

import java.util.Scanner;

/**
 *
 * @author auras
 */
public class Principal {

    public static void main(String[] args) {
        /* Convertir un tipo var a un tipo int (en char o en String no funciona) */
        var edad = Integer.parseInt("20");
        System.out.println("edad " + (edad + 1));

        var varlorPI = Double.parseDouble("3.1416");
        System.out.println("Valor PI = " + varlorPI);

        // Pedir un Valor
        var consola = new Scanner(System.in);
        System.out.println();
        System.out.println("Dame una edad ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

        /* Convertir un tipo int en un tipo String */
        var edadTexto = String.valueOf(10);
        System.out.println("edad de texto " + edadTexto);

        var caracter = "Hola".charAt(0); // H = 0, O = 1, L = 2, A = 3
        System.out.println("cadena " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter " + caracter);
    }
}
