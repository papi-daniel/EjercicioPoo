package com.mycompany.ejerciciopoo.models;

public class CursoProfesor {
    Profesor profesor;
    int anio;
    int semestre;
    Curso curso;

    public CursoProfesor(Profesor profesor, int anio, int semestre, Curso curso) {
        this.profesor = profesor;
        this.anio = anio;
        this.semestre = semestre;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "CursoProfesor{" + "profesor=" + profesor.toString() + ", anio=" + anio + ", semestre=" + semestre + ", curso=" + curso.toString() + '}';
    }
    
}
