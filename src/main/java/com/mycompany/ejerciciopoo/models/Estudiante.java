package com.mycompany.ejerciciopoo.models;

public class Estudiante extends Persona {
    double codigo;
    Programa programa;
    boolean activo;
    double promedio;

    public Estudiante(double codigo, Programa programa, boolean activo, double promedio, Persona persona) {
        super(persona.nombre, persona.apellidos, persona.email);
        this.codigo = codigo;
        this.programa = programa;
        this.activo = activo;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante[" + "\n\t nombre = " + this.nombre + "\n\t apellido = " + this.apellidos + "\n\t email = " + this.email + "\n\t codigo = " + codigo + ",\n\t programa = " + programa.toString() + ",\n\t activo = " + activo + ",\n\t promedio = " + promedio + "\n    ]\n";
    }
        
}
