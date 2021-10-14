/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concatenacion02;

/**
 *
 * @author auras
 */
public class Concatenacion {

    public static void main(String[] args) {
        String usuario = "Juan";
        String titulo = "Ingeniero";

        String union = titulo + " " + usuario;

        System.out.println(union);


        /* Tambien se puede meter dentro de Syste.out.println */
        int i = 3;
        int j = 4;

        System.out.println(i + j); // se realiza una suma de numeros
        System.out.println(i + j + usuario); //Evaulacion de izq a der, realiza suma
        System.out.println(usuario + i + j); //Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); // Uso de parentesis moficican la prioridad en la evaluacion
    }
}
