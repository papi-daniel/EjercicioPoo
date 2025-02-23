package com.mycompany.ejerciciopoo.models;

import java.io.Serializable;

public class Facultad implements Serializable {
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
        return "Facultad[\n\t\t\t    ID = " + ID + ",\n\t\t\t    nombre = " + nombre + ",\n\t\t\t    decano = " + decano.toString() + "\n\t\t\t]";
    }
        
}
