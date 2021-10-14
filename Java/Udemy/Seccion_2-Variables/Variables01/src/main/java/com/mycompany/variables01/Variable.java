/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.variables01;

/**
 *
 * @author auras
 */
public class Variable {

    public static void main(String[] args) {
        
        /* Definir una variable tipo Entero */
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        /* Ahora le cambiamos el valor a la variable miVariableEntera */
        miVariableEntera = -10;
        System.out.println(miVariableEntera);

        /* Declarar una variable tipo String */
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        /* Ahora le cambiamos el valor a la variable miVariaCadena */
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        /* var -> Inferencia de tipos en Java - Poco recomendable */
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hola, esto es una nueva cadena pero con var";
        System.out.println(miVariableCadena2);

    }
}
