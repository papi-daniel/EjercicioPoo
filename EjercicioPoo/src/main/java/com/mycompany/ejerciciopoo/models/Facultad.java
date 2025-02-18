package com.mycompany.ejerciciopoo.models;

public class Facultad {
    double ID;
    String nombre;
    Persona decano;

    public Facultad(double ID, String nombre, Persona decano) {
        this.ID = ID;
        this.nombre = nombre;
        this.decano = decano;
    }

    @Override
    public String toString() {
        return "Facultad{" + "ID=" + ID + ", nombre=" + nombre + ", decano=" + decano.toString() + '}';
    }
        
}
