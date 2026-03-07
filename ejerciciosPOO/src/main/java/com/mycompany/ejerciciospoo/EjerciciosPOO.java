
package com.mycompany.ejerciciospoo;


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
                
        
        
        
        
    }
}
