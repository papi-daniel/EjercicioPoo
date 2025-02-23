package com.mycompany.ejerciciopoo.Services;

import com.mycompany.ejerciciopoo.models.CursoProfesor;
import utils.ConfigurationStorage;
import java.util.ArrayList;
import java.util.List;

public class CursosProfesores {
    private List<CursoProfesor> listado;
    private ConexionArchivo conexion;

    @SuppressWarnings("unchecked")
    public CursosProfesores() {
        conexion = ConexionArchivo.getInstancia(ConfigurationStorage.tipoAlmacenamiento);
        listado = (List<CursoProfesor>) conexion.obtenerDatos("cursosProfesores", List.class);
        if (listado == null || listado.isEmpty()) {
            this.listado = new ArrayList<>();
        }
    }

    public void inscribir(CursoProfesor curso) {
        listado.add(curso);
    }

    public void eliminar(CursoProfesor curso) {
        listado.removeIf(cursoProfesor -> cursoProfesor.getCurso().getID() == curso.getCurso().getID());
    }

    public void actualizar(CursoProfesor cursoProfesor) {
        listado.forEach(cursoProfesorIndex -> {
            if (cursoProfesorIndex.getProfesor().equals(cursoProfesor.getProfesor())) {
                cursoProfesorIndex = cursoProfesor;
            }
        });
    }

    public void guardarInformacion() {
        conexion.guardarDatos("cursosProfesores", listado);
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos() {
        listado = (List<CursoProfesor>) conexion.obtenerDatos("cursosProfesores", List.class);
        if (listado == null) {
            System.err.println("La lista es null, inicializando nueva lista vacía");
            listado = new ArrayList<>();
        }
        if (!listado.isEmpty()) {
            System.out.println("\bCursos de Profesores:");
            listado.forEach(System.out::println);
        }
    }
}