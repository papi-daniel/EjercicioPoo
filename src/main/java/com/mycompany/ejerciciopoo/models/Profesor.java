package com.mycompany.ejerciciopoo.models;

public class Profesor extends Persona{
    String tipoContrato;

    public Profesor(String tipoContrato, double ID, String nombre, String apellidos, String email) {
        super(nombre, apellidos, email);
        this.tipoContrato = tipoContrato;
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "\n\t\ttipoContrato = " + tipoContrato + "\n\t    ],\n";
    }
    
    
    
}
