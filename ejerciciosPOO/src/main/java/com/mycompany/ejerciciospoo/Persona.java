
package com.mycompany.ejerciciospoo;

public class Persona {
    //atributos o caracteristicas
    int  id;
    String nombre;
    String apellido;
    String direccion;
    int edad;

    public Persona() { //constructor vacio
    }

    public Persona(int id, String nombre, String apellido, String direccion, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    //metodos
    //modificador de acceso 'public'
    // void es un procedimiento no debuelva algo cmo un afuncion
    public void mostrarNombre(){
    
    }
     
}
