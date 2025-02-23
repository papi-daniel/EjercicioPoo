package com.mycompany.ejerciciopoo.models;

import java.io.Serializable;

public class CursoProfesor implements Serializable {
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
        return "CursoProfesor[" + "\n\t    profesor = " + profesor.toString() + "\t    anio = " + anio + ",\n\t    semestre = " + semestre + ",\n\t    curso = " + curso.toString() + "]";
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public int getAnio() {
        return anio;
    }

    public int getSemestre() {
        return semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    
    
}
