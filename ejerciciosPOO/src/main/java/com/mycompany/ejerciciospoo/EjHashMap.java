package com.mycompany.ejerciciospoo;
import java.util.HashMap;
import java.util.Map;
public class EjHashMap {
    public static void main(String[] args) {       
        Map<Integer,String> mapaEmpleado = new  HashMap<>();
        mapaEmpleado.put(1234, "adri");
        mapaEmpleado.put(1235, "marti");
        mapaEmpleado.put(1236, "cuqui");
        mapaEmpleado.put(1237, "rita");
 
        System.out.println("los elementos de mapaEmpleado son: " + mapaEmpleado);
        
        boolean estaono =mapaEmpleado.containsValue("adri");
        if(estaono==true){
            System.out.println("El valor SI esta es: " + estaono);
        }
        else{
            System.out.println("el valor NO esta es: " + estaono);
        }
        System.out.println(mapaEmpleado.values());
        System.out.println(mapaEmpleado.keySet());
        
        String nombre=mapaEmpleado.get(1235);
        System.out.println("el nombre buscado es: " + nombre); 
        mapaEmpleado.remove(1237);
        System.out.println(mapaEmpleado);
        
    }
    
}
