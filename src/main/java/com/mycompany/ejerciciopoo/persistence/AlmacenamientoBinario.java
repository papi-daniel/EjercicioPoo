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


    public AlmacenamientoBinario(){}

    @Override
    public void guardarDatos(Map<String, Object> datos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ConfigurationStorage.nombreArchivo))) {
            oos.writeObject(datos);
            System.out.println("\bDatos guardados en el archivo "+ ConfigurationStorage.nombreArchivo);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    @Override
    public Map<String, Object> cargarDatos() {
        File file = new File(ConfigurationStorage.nombreArchivo);
        if (!file.exists()) return new HashMap<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ConfigurationStorage.nombreArchivo))) {
            return (Map<String, Object>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
