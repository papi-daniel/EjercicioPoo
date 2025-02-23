package com.mycompany.ejerciciopoo.Services;

import java.util.Map;

import com.mycompany.ejerciciopoo.factory.FabricaAlmacenamiento;
import com.mycompany.ejerciciopoo.interfaces.Almacenamiento;

public class ConexionArchivo {
    private static ConexionArchivo instancia;
    private Almacenamiento almacenamiento;
    private Map<String, Object> datos;   

    private ConexionArchivo(String tipoAlmacenamiento){
        this.almacenamiento = FabricaAlmacenamiento.crearAlmacenamiento();
        this.datos = almacenamiento.cargarDatos();
    }

    // 🔹 Método para obtener instancia (Singleton)
    public static synchronized ConexionArchivo getInstancia(String tipoAlmacenamiento) {
        if (instancia == null) {
            instancia = new ConexionArchivo(tipoAlmacenamiento);
        }
        return instancia;
    }

    // 🔹 Guardar y obtener datos
    public void guardarDatos(String clave, Object objeto) {
        datos.put(clave, objeto);
        almacenamiento.guardarDatos(datos);
    }

    public <T> T obtenerDatos(String clave, Class<T> tipo) {
        return tipo.cast(datos.get(clave));
    }
}
