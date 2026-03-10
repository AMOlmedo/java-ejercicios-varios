// Diferencias entre ArrayList y LinkedList (TodoCode)
package com.mycompany.ejerciciospoo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLista {
    
    public static void main(String[] args) {
        
        List<Persona> ListaArray = new ArrayList<Persona>();
        ListaArray.add(new Persona(1,"Adria", "Olm","casa",15));
        ListaArray.add(new Persona(2,"kuka", "Ol","home",15));
        ListaArray.add(new Persona(3,"Adr", "Olm","house",16));
        ListaArray.add(new Persona(4,"kara", "bacha","cueva",19));
    
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1,"Adria", "Olm","casa",15));
        listaLinked.add(new Persona(2,"kuka", "Ol","home",15));
        listaLinked.add(new Persona(3,"Adr", "Olm","house",16));
        listaLinked.add(new Persona(4,"kara", "bacha","cueva",19));
        
        //remove con ArrayLsit
        ListaArray.remove(1);
        
        String nombreBorrar = "kara";
        for (Persona persona2 :listaLinked){
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break;
            }
        }
        
        System.out.println("==== Luego de  eliminar=====");
        System.out.println("====ArrayList: borra por indice ======");
            for (Persona persona:ListaArray){
                System.out.println("Prueba " + persona.getNombre());        
            }
        
         System.out.println("==== LinkedList borra por nombre del elemento =====");
         for ( Persona persona:listaLinked){
             System.out.println(" prueba " + persona.getNombre());
         }
        System.out.println("Tamanio de las listas:"); 
        System.out.println("ArrayList " + ListaArray.size()); 
        System.out.println("LinkedList " + listaLinked.size()); 
        System.out.println(" PRIMER Y ULTIMO OBJETO (solo para linkedLsit");    
        System.out.println("primer obj linkedList  "+ listaLinked.getFirst().toString());
        System.out.println("ultimo obj linkedList " + listaLinked.getLast().toString());
        
    }
    
}
