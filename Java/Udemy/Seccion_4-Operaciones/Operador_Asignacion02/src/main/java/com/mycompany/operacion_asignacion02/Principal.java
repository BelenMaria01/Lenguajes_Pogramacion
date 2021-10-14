/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operacion_asignacion02;

/**
 *
 * @author auras
 */
public class Principal {

    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a + 5 - b;

        System.out.println("c = " + c);

        a += 1; //a = a + 1
        System.out.println("a vale " + a);

        a += 3; //a = a + 3
        System.out.println("a vale " + a);

        b -= 2; // b = b - 2
        System.out.println("b vale " + b);

        c *= 2; // c = c * 2
        System.out.println("c vale " + c);

        a /= 4; // a = a / 4
        System.out.println("b vale " + b);

        c %= 2; // c = c % 2
        System.out.println("c vale " + c);
    }
}
