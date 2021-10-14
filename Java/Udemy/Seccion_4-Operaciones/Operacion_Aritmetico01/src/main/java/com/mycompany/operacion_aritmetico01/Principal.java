/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operacion_aritmetico01;

/**
 *
 * @author auras
 */
public class Principal {

    public static void main(String[] args) {
        int x = 3, y = 2;

        int resultado = x + y;
        System.out.println("resultado suma: " + resultado);

        resultado = x - y;
        System.out.println("resultado resta: " + resultado);

        resultado = x * y;
        System.out.println("resultado multi: " + resultado);

        resultado = x / y;
        System.out.println("resultado div: " + resultado);

        resultado = x % y;
        System.out.println("resultado resto: " + resultado);

        if (x % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}

