
package com.mycompany.ejerciciospoo;

import java.util.Scanner;

public class TipoDato {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int edad;
        //int es un tipo de dato primitivo
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextInt();
        String nombre = "Jhon Doe";
        //String es un tipo de dato NO PRIMITIVO. Es un wrapper y se comporta como un objeto
        //Tiene metodos
        
        System.out.println("la edad  de " + nombre  + " es " +edad);
        
        
        
    }
    
}
