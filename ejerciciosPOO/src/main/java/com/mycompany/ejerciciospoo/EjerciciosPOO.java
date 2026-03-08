
package com.mycompany.ejerciciospoo;

import java.util.ArrayList;
import java.util.List;


public class EjerciciosPOO {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(1,"juan","perez","av siempre viva", 99);
        
        System.out.println("la edad de persona2 es " + persona2.getEdad());
        System.out.println("el nombre de la persona2 es " + persona2.getNombre());
        
        persona1.setApellido("simpson");
        persona1.setNombre("homero");
        
        System.out.println("el padre es " + persona1.getNombre());
       
        Empleado emp = new Empleado();
        Consultor cons = new Consultor();
        
        emp.getArea();
                
       //Declaracion e iniciazion de una ArrayList
       List<Persona> lista = new ArrayList<Persona>();
       lista.add(new Persona(2, "kuka", "denadie", "lshs", 15));
       lista.add(new Persona(2, "racha", "detos", "lshs", 10));
       lista.add(new Persona(2, "rita", "cielo", "lshs", 17));
       lista.add(new Persona(2, "toto", "malo", "cdad", 80));
       
        //recorrer for indice
        System.out.println("===== for ======");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba "+ lista.get(i).getNombre());
        }
        
        //recorrer con foreach
        System.out.println("======= foreach====");
        for (Persona perso:lista){
            System.out.println("prueba " + perso.getNombre());
            
        }
        
    }
}
