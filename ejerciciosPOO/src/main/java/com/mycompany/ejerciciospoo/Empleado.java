
package com.mycompany.ejerciciospoo;

public class Empleado extends Persona{
    
    private int legajo;
    private String  area;
    private String cargo;
    //constructor vacio
    public Empleado(){}

    //constructor por parametros. Heredado de la superClase Persona
    public Empleado(int legajo, String area, String cargo, int id, String nombre, String apellido, String direccion, int edad) {
        super(id, nombre, apellido, direccion, edad);
        this.legajo = legajo;
        this.area = area;
        this.cargo = cargo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}



