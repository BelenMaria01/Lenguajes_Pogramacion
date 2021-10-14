/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operador_unario04;

/**
 *
 * @author auras
 */
public class Principal {

    public static void main(String[] args) {
        /* Cambiar el signo */
        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /* Negacion */
        boolean c = true;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        /* Incremento */
        //1.- preincremento (simbolo antes de la variable)
        int e = 3;
        int f = ++e; //Primero se incrementa la variable y depsues usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2.- postincremento (simbolo despues de la variable)
        int g = 5;
        int h = g++; //Primero usa su valor y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        /* Decremento */
        //1.- predecremento
        int i = 2;
        int j = --i;
        System.out.println("i = " + i); //ya esta decrementada
        System.out.println("j = " + j);

        //2.- postdecremento
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
