
package com.mycompany.ejerciciospoo;

public class EjExcepciones {
    public static void main(String[] args) {
        
        try {
            int resultado = 4/0;
        } catch (Exception e) {
            System.out.println("no se puede dividir por 0..!!");
        }
        
        int edades[]={10,12,13,15};
        try {
            System.out.println("en valor de la indice 4 es " + edades[4]);
        } catch (Exception e) {
            System.out.println("No hay nada en el indice 4 ");
        }
        
    }
    
}
