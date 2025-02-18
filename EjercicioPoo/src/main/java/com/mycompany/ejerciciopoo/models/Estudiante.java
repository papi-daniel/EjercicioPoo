package com.mycompany.ejerciciopoo.models;

public class Estudiante extends Persona {
    double codigo;
    Programa programa;
    boolean activo;
    double promedio;

    public Estudiante(double codigo, Programa programa, boolean activo, double promedio, Persona persona) {
        super(persona.ID, persona.nombre, persona.apellidos, persona.email);
        this.codigo = codigo;
        this.programa = programa;
        this.activo = activo;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", programa=" + programa.toString() + ", activo=" + activo + ", promedio=" + promedio + '}';
    }
        
}
