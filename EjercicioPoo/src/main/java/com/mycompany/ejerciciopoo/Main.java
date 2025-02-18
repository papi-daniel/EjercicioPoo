package com.mycompany.ejerciciopoo;

import Services.CursosProfesores;
import Services.InscripcionesPersonas;
import com.mycompany.ejerciciopoo.models.Curso;
import com.mycompany.ejerciciopoo.models.CursoProfesor;
import com.mycompany.ejerciciopoo.models.Estudiante;
import com.mycompany.ejerciciopoo.models.Facultad;
import com.mycompany.ejerciciopoo.models.Inscripcion;
import com.mycompany.ejerciciopoo.models.Persona;
import com.mycompany.ejerciciopoo.models.Profesor;
import com.mycompany.ejerciciopoo.models.Programa;

public class Main {
    
    public static void main(String[] args){
        Persona persona1 = new Persona(1, "Daniel", "pinilla", "jdpinilla");
        Persona decano1 = new Persona(2, "Marco", "Gutierrez", "@marco");
        Profesor profesor1 = new Profesor("Catedratico", 1, "Jesus", "Reyes", "@jrc");
        Facultad facultad1 = new Facultad(1, "Basicas", decano1);
        Programa programa1 = new Programa(1, "Sistemas", 120, "utfgtf", facultad1);
        Estudiante estudiante1 = new Estudiante(123456, programa1, true, 3.3, persona1 );
        Curso bases = new Curso(1, programa1, true);
        Inscripcion inscripcion1 = new Inscripcion(bases, 2025, 4, estudiante1);
        InscripcionesPersonas insPer = new InscripcionesPersonas();
        CursoProfesor curPro1 = new CursoProfesor(profesor1, 2025, 4, bases);
        CursosProfesores curPro = new CursosProfesores();
        
        curPro.inscribir(curPro1);
        
        //insPer.inscribir(persona1);
        
        //insPer.eliminar(persona1);
        
        //persona1.setNombre("Edward");
        
        //insPer.actualizar(persona1);

        //System.out.println(insPer);
        
        System.out.println(curPro1);
        
    }
    

    
}
