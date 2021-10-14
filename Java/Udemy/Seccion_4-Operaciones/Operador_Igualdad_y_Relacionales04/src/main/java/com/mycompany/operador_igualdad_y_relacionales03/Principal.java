/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operador_igualdad_y_relacionales03;

/**
 *
 * @author auras
 */
public class Principal {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        //Igualdad ==
        boolean c = (a == b);
        System.out.println("c = " + c);

        String cadena = "Hola";
        String cadena2 = "Adios";
        boolean e = (cadena == cadena2);// Se compara referencias de objetos
        boolean f = cadena.equals(cadena2); // se compara el contenido, no es el objetos

        //Diferente !=
        boolean d = (a != b);
        System.out.println("d = " + d);

        //Mayor o menor que <> || mayor o menor igual que <= >=
        boolean g = a > b;
        System.out.println("a es mayor que b: " + g);
        boolean h = a >= b;
        System.out.println("a es mayor o igual que b: " + g);

        boolean i = a < b;
        System.out.println("a es menor o que b: " + i);
        boolean j = a <= b;
        System.out.println("a es menor o igual que b: " + j);

    }
}
