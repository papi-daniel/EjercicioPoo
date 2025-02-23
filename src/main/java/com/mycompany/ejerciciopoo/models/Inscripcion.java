package com.mycompany.ejerciciopoo.models;

import java.io.Serializable;

public class Inscripcion implements Serializable {
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
        return "Inscripcion: \n" + 
                "    curso = " + curso.toString() + 
                "    anio = " + anio + ",\n    semestre = " + semestre + ",\n    estudiante = " + estudiante.toString() + "    \n";
    }

    public Curso getCurso() {
        return this.curso;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }



    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    
    
}
