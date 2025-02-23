package com.mycompany.ejerciciopoo.persistence;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.mycompany.ejerciciopoo.interfaces.Almacenamiento;

import utils.ConfigurationStorage;

public class AlmacenamientoBinario implements Almacenamiento {

    private final String ARCHIVO = ConfigurationStorage.nombreArchivo;

    public AlmacenamientoBinario(){}

    @Override
    public void guardarDatos(Map<String, Object> datos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(datos);
            System.out.println("Datos guardados en el archivo "+ ARCHIVO);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    @Override
    public Map<String, Object> cargarDatos() {
        File file = new File(ARCHIVO);
        if (!file.exists()) return new HashMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            return (Map<String, Object>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
