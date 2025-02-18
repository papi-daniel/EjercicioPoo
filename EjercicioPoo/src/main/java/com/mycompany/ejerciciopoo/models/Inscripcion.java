package com.mycompany.ejerciciopoo.models;

public class Inscripcion {
    Curso curso;
    int anio;
    int semestre;
    Estudiante estudiante;

    public Inscripcion(Curso curso, int anio, int semestre, Estudiante estudiante) {
        this.curso = curso;
        this.anio = anio;
        this.semestre = semestre;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "curso=" + curso.toString() + ", anio=" + anio + ", semestre=" + semestre + ", estudiante=" + estudiante.toString() + '}';
    }

    public Curso getCurso() {
        return curso;
    }
    
    
}
