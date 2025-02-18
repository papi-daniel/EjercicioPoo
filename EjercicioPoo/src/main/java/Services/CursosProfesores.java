package Services;

import com.mycompany.ejerciciopoo.models.CursoProfesor;
import java.util.ArrayList;
import java.util.List;

public class CursosProfesores {
    
    List<CursoProfesor> listado;

    public CursosProfesores() {
        listado = new ArrayList<>();
    }
    
    public void inscribir(CursoProfesor curso){
        listado.add(curso);
    }
    
    public void guardarInformacion(CursoProfesor curso){
        
    }
    
    public void cargarDatos(){}
    
    
    
}
