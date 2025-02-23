package com.mycompany.ejerciciopoo.models;

import java.io.Serializable;

public class Programa implements Serializable {
    
    double ID;
    String nombre;
    double duracion;
    String registro;
    Facultad facultad;

    public Programa(double ID, String nombre, double duracion, String registro, Facultad facultad) {
        this.ID = ID;
        this.nombre = nombre;
        this.duracion = duracion;
        this.registro = registro;
        this.facultad = facultad;
    }
    
    @Override
    public String toString() {
        return "Programa[" + "\n\t\t        ID = " + ID + ",\n\t\t        nombre = " + nombre + ",\n\t\t        duracion = " + duracion + ",\n\t\t        registro = " + registro + ",\n\t\t        facultad = " + facultad.toString() + "\n\t\t    ]";
    }
       
}
