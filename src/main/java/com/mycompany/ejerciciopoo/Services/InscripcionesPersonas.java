package com.mycompany.ejerciciopoo.Services;

import com.mycompany.ejerciciopoo.models.Persona;
import utils.ConfigurationStorage;
import java.util.ArrayList;
import java.util.List;

public class InscripcionesPersonas {
    private List<Persona> listado;
    private ConexionArchivo conexion;

    @SuppressWarnings("unchecked")
    public InscripcionesPersonas() {
        conexion = ConexionArchivo.getInstancia(ConfigurationStorage.tipoAlmacenamiento);
        listado = (List<Persona>) conexion.obtenerDatos("personas", List.class);
        if (listado == null || listado.isEmpty()) {
            this.listado = new ArrayList<>();
        }
    }

    public void inscribir(Persona aspirante) {
        listado.add(aspirante);
    }

    public void eliminar(Persona estudiante) {
        listado.removeIf(persona -> persona.getEmail().equals(estudiante.getEmail()));
    }

    public void actualizar(Persona personaActualizar) {
        listado.forEach(emailIndex -> {
            if (emailIndex.getEmail() == personaActualizar.getEmail()) {
                emailIndex = personaActualizar;
            }
        });
    }

    public void guardarInformacion() {
        conexion.guardarDatos("personas", listado);
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos() {
        listado = (List<Persona>) conexion.obtenerDatos("personas", List.class);
        if (listado == null) {
            System.err.println("La lista es null, inicializando nueva lista vacía");
            listado = new ArrayList<>();
        }
        if (!listado.isEmpty()) {
            System.out.println("\bPersonas Inscritas:");
            listado.forEach(System.out::println);
        }
    }

    @Override
    public String toString() {
        if (listado.isEmpty()) {
            return "La lista está vacía";
        } else {
            return "InscripcionesPersonas{" + "listado=" + listado + '}';
        }
    }
}