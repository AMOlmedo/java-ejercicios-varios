//ingresar datos utilizando JOptionPane
package com.mycompany.ejerciciospoo;

import javax.swing.JOptionPane;

public class InputJOptionPane {
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        char genero;
        double altura;
        
        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad: "));
        genero = JOptionPane.showInputDialog("ingres H o M: ").charAt(0);
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en metros: "));
        
        JOptionPane.showMessageDialog(null, "tu nombre es " + nombre + " tienes " + edad + " años, tu genero es " + genero + " y tu altura es " + altura + " metros");
        
        System.out.println("tu nombre es " + nombre + " tienes " + edad + " años, tu genero es " + genero + " y tu altura es " + altura + " metros" );
        
    }
    
}
