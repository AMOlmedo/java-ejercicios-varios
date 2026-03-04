
package com.mycompany.jpapruebas.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumnos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String Nombre;
    private String Apellido;
    private String fechaNac;

    public Alumnos(int id, String Nombre, String Apellido, String fechaNac) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}
