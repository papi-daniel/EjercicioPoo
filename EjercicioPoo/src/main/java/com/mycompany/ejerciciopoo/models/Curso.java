package com.mycompany.ejerciciopoo.models;

public class Curso {
    
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
        return "Curso{" + "ID=" + ID + ", programa=" + programa.toString() + ", activo=" + activo + '}';
    }

    public int getID() {
        return ID;
    }
    
}
