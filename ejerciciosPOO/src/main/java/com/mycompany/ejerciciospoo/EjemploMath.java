// Ejemplos con la clase Math
package com.mycompany.ejerciciospoo;

public class EjemploMath {
    public static void main(String[] args) {
        // Raiz Cuadrada
        double raiz = Math.sqrt(9);  //el metodo recibe como parametro un double 
        int raiz2 = (int)Math.sqrt(9); // con int para poder usar con un int
        System.out.println(raiz);
        
        // Exponte al cuadrado
        double base = 5 , exponente = 2, resultado;
        resultado = Math.pow(base, exponente);
        System.out.println(resultado);
        
        // Metodo ROUND para redondear un numero decimal
        float num1 =2.34f; // los float siempre van con f al final
        int resultado1 = Math.round(num1);
        System.out.println("el numeo redondeado es: " +  resultado1);
        
        // Metodo RAMDOM
        double aleatorio;
        aleatorio = Math.random();
        System.out.println("el aleatorio es: "+ aleatorio);
        
    }
}
