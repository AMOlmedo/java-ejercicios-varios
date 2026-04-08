
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
        
        float altura;
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextFloat();
        
        double peso;
        System.out.println("Ingrese el peso: ");
        peso = entrada.nextDouble();
        
        String pais;
        System.out.println("Ingrese el pais de nacimiento: ");
        pais = entrada.nextLine();
                
        char genero;
        System.out.println("ingrese M o F: ");
        genero = entrada.next().charAt(0);
        
        System.out.println("la edad  de " + nombre  + " es " +edad);
        System.out.println("la altura  de " + nombre  + " es " +altura);
        System.out.println("la peso  de " + nombre  + " es " +peso);
        System.out.println("la pais de recidencia  de " + nombre  + " es " +pais);
        System.out.println("el genero de " + nombre  + " es " +genero);
        
        
        
        
    }
    
}
