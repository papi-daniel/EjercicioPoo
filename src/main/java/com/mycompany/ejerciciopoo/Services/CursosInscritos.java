package com.mycompany.ejerciciopoo.Services;

import com.mycompany.ejerciciopoo.models.Inscripcion;

import utils.ConfigurationStorage;

import java.util.ArrayList;
import java.util.List;

public class CursosInscritos {
    private List<Inscripcion> listado;
    private ConexionArchivo conexion;

    @SuppressWarnings("unchecked")
    public CursosInscritos() {
        conexion = ConexionArchivo.getInstancia(ConfigurationStorage.tipoAlmacenamiento);
        listado = conexion.obtenerDatos("cursos", List.class);
        if (listado == null) {
            listado = new ArrayList<>();
        }
    }
    
    public void inscribirCurso(Inscripcion curso){
        listado.add(curso);
       
    }
    
    public void eliminar(Inscripcion curso){
        listado.removeIf(cursoIndex -> cursoIndex.getCurso().getID() == curso.getCurso().getID());
    }
    
    public void actualizar(Inscripcion curso){
        listado.add(curso);
    }
    
    public void guardarInformacion(Inscripcion curso){
        conexion.guardarDatos("cursos", listado);
    }
    
    public void cargarDatos(){
        listado.forEach(inscripcionLlave -> System.out.println(inscripcionLlave));
    }
    
}

