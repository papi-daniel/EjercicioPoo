package com.mycompany.ejerciciopoo.models;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final double ID = 1L;
    String nombre;
    String apellidos;
    String email;

    public Persona( String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    
    
    @Override
    public String toString() {
        return "Persona[" + "\n\t\t\t\tID = " + ID + ",\n\t\t\t\tnombre = " + nombre + ",\n\t\t\t\tapellidos = " + apellidos + ",\n\t\t\t\temail = " + email + "\n\t\t\t    ]";
    }

    public double getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
    
}
