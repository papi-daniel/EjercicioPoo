package Services;

import com.mycompany.ejerciciopoo.models.Inscripcion;
import java.util.List;

public class CursosInscritos {
    List<Inscripcion> listado;

    public CursosInscritos(List<Inscripcion> listado) {
        this.listado = listado;
    }
    
    public void inscribirCurso(Inscripcion curso){
        listado.add(curso);
    }
    
    public void eliminar(Inscripcion curso){
        listado.removeIf(cursoIndex -> cursoIndex.getCurso().getID() == curso.getCurso().getID());
    }
    
    public void actualizar(Inscripcion curso){
        listado.add(curso);
    }
    
    public void guardarInformacion(Inscripcion curso){}
    
    public void cargarDatos(){}
    
}

