/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author auras
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        /* Tipos Numericos Enteros */
        byte numeroByte;
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort;
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt;
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong;
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        /* Tipos Numericos Flotante*/
        float numeroFloat;
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble;
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);

        /* Tipos Caracteres */
        char miCaracter = 'a';
        System.out.println("miCaracter: " + miCaracter);
        char varChar = '\u0021';
        System.out.println("varChar: " + varChar);

        String miCaracterString = "Esto es una cadena de caracteres completo";
        System.out.println("miCaracterString: " + miCaracterString);

        /* Tipos Booleano */
        boolean miBoolean = true;
        System.out.println("es " + miBoolean);

        miBoolean = false;
        System.out.println("ahora es " + miBoolean);

    }
}
