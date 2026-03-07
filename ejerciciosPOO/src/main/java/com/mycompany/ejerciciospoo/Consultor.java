
package com.mycompany.ejerciciospoo;

public class Consultor extends Persona {
    
    private int legajo_ext;
    private String empresa;
    private String especialidad;
    private Double sueldo;
    
    public Consultor() {
    }
    
    public Consultor(int legajo_ext, String empresa, String especialidad, int id, String nombre, String apellido, String direccion, int edad) {
        super(id, nombre, apellido, direccion, edad); //atributos heredados de la superclase Persona
        this.legajo_ext = legajo_ext;
        this.empresa = empresa;
        this.especialidad = especialidad;
    }

    public int getLegajo_ext() {
        return legajo_ext;
    }

    public void setLegajo_ext(int legajo_ext) {
        this.legajo_ext = legajo_ext;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
        
}
