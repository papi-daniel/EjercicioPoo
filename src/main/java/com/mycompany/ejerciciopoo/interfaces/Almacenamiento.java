package com.mycompany.ejerciciopoo.interfaces;

import java.util.Map;

public interface Almacenamiento {

    public void guardarDatos(Map<String,Object> datos);
    Map<String,Object> cargarDatos();
    
} 