
package com.mycompany.jpapruebas.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Clientes implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Basic
private String nombre;
private String apellido;
private String direccion;
private int telefono; 
private String email;
@Temporal(TemporalType.DATE)
private Date FechaNac;
private Date FechaAlta;

public Clientes() {
    }

// ALT + insert para insertar el constructor
    public Clientes(int id, String nombre, String apellido, String direccion, int telefono, String email, Date FechaNac, Date FechaAlta) {    
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.FechaNac = FechaNac;
        this.FechaAlta = FechaAlta;
    }

    // ALT + INSERT  para agragar el metodo GETTER

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    
    //ALT + INSERT para agregar el metodo SETTER

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

}

