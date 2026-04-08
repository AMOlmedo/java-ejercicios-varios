//Ingreso de datos tipo Float con  Scanner
package com.mycompany.ejerciciospoo;

import java.util.Scanner;

public class IngresoFloat {
    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        float num1, num2;
        System.out.println("Ingrese el primer numero float: ");
        num1 = intro.nextFloat();
        
        System.out.println("Ingrese el segundo numero float: ");
        num2 = intro.nextFloat();
        
        float suma = num1 + num2;
        float resta = num1 - num2;
        float multipliacacion = num1 * num2;
        float division = num1 / num2;
        float resto = num1%num2;
        
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multipliacacion);
        System.out.println("la division es " + division);
        System.out.println("la resto es " + resto);
        
    }
}
