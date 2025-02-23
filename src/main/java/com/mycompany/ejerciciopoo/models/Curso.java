package com.mycompany.ejerciciopoo.models;

import java.io.Serializable;

public class Curso implements Serializable {
    
    int ID;
    Programa programa;
    boolean activo;

    public Curso(int ID, Programa programa, boolean activo) {
        this.ID = ID;
        this.programa = programa;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Curso[" + "\n\t\t    ID=" + ID + ", \n\t\t    programa = " + programa.toString() + "\n\t\t    activo = " + activo + ",\n\t    ],\n";
    }

    public int getID() {
        return ID;
    }
    
}
