package com.mycompany.ejerciciopoo.models;

public class Persona {
    double ID;
    String nombre;
    String apellidos;
    String email;

    public Persona(double ID, String nombre, String apellidos, String email) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
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
