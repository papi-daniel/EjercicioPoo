package com.mycompany.ejerciciopoo.Services;

import com.mycompany.ejerciciopoo.models.Persona;
import java.util.ArrayList;
import java.util.List;

public class InscripcionesPersonas {
    List<Persona> listado;

    public InscripcionesPersonas() {
       listado = new ArrayList<>();
    }
    
    public void inscribir(Persona aspirante){
    
        listado.add(aspirante);
    
    }
    
    public void eliminar(Persona estudiante){
    
        listado.removeIf(persona -> persona.getID() == estudiante.getID());
    
        
    }
    
    public void actualizar(Persona estudiante){
           listado.forEach(persona -> {
          if(persona.getID() == estudiante.getID()) {
            persona = estudiante;
          }
        } );
    }
    
    public void guardarInformacion(Persona estudiante){}
    
    public void cargarDatos(){}

    @Override
    public String toString() {
        
        if(listado.isEmpty()){
            return "La lista esta vacia";
            
        }else{
            return "InscripcionesPersonas{" + "listado=" + listado.getFirst() + '}';

        }
    }
    
    
}
