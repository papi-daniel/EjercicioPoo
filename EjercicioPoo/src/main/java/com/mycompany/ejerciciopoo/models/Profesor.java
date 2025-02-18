package com.mycompany.ejerciciopoo.models;

public class Profesor extends Persona{
    String tipoContrato;

    public Profesor(String tipoContrato, double ID, String nombre, String apellidos, String email) {
        super(ID, nombre, apellidos, email);
        this.tipoContrato = tipoContrato;
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "tipoContrato=" + tipoContrato + '}';
    }
    
    
    
}
