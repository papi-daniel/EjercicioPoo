package com.mycompany.ejerciciopoo.models;

public class Programa {
    
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
        return "Programa{" + "ID=" + ID + ", nombre=" + nombre + ", duracion=" + duracion + ", registro=" + registro + ", facultad=" + facultad.toString() + '}';
    }
       
}
