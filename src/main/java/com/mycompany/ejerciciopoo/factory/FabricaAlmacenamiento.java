package com.mycompany.ejerciciopoo.factory;

import com.mycompany.ejerciciopoo.Services.ConexionArchivo;
import com.mycompany.ejerciciopoo.interfaces.Almacenamiento;
import com.mycompany.ejerciciopoo.persistence.AlmacenamientoBinario;

import utils.ConfigurationStorage;

public class FabricaAlmacenamiento {
    
    public static Almacenamiento crearAlmacenamiento(){
        switch (ConfigurationStorage.tipoAlmacenamiento.toLowerCase()) {
            case "binario":
                return new AlmacenamientoBinario();
        
            default:
                break;
        }

        return null;
    }
}
