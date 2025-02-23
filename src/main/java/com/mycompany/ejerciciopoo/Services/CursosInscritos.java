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
        listado = (List<Inscripcion>) conexion.obtenerDatos("cursos", List.class);
        if (listado == null || listado.isEmpty()) {
            this.listado = new ArrayList<>();
        }
    }
    
    public void inscribirCurso(Inscripcion curso){
        listado.add(curso);
       
    }
    
    public void eliminar(Inscripcion curso){
        listado.removeIf(cursoIndex -> cursoIndex.getCurso().getID() == curso.getCurso().getID());
    }
    
    public void actualizar(Inscripcion inscripcionActual){
        listado.forEach(inscripcionIndex -> {
            if (inscripcionIndex.getEstudiante().equals(inscripcionActual.getEstudiante())) {
                inscripcionIndex = inscripcionActual;
            };
        });
    }
    
    public void guardarInformacion(Inscripcion curso){
        conexion.guardarDatos("cursos", listado);
    }
    
    @SuppressWarnings("unchecked")
    public void cargarDatos(){
        listado = (List<Inscripcion>) conexion.obtenerDatos("cursos", List.class);

        if (listado == null) {
            System.err.println("La lista es null, inicializando nueva lista vacía");
            listado = new ArrayList<>();
        }

        if (!listado.isEmpty()) {
            System.out.println("\bCursos Inscritos:");
            listado.forEach(listadoIndex -> System.out.println(listadoIndex));
        }
    }
    
}

