package com.mycompany.ejerciciopoo.Services;

import com.mycompany.ejerciciopoo.models.CursoProfesor;

import utils.ConfigurationStorage;

import java.util.ArrayList;
import java.util.List;

public class CursosProfesores {
    
    List<CursoProfesor> listado;
    private ConexionArchivo conexion;

    @SuppressWarnings("unchecked")
    public CursosProfesores() {
        conexion = ConexionArchivo.getInstancia(ConfigurationStorage.tipoAlmacenamiento);
        listado = conexion.obtenerDatos("cursos", List.class);
        if (listado == null) {
            listado = new ArrayList<>();
        }
    }
    
    public void inscribir(CursoProfesor curso){
        listado.add(curso);
    }
    
    public void guardarInformacion(CursoProfesor curso){
        conexion.guardarDatos("cursosProfesores", listado);

    }
    
    public void cargarDatos(){
        listado.forEach(cursoProfesorIndex -> System.out.println(cursoProfesorIndex));
    }
    
    
    
}
