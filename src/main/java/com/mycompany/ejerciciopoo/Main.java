package com.mycompany.ejerciciopoo;

import com.mycompany.ejerciciopoo.Services.CursosInscritos;
import com.mycompany.ejerciciopoo.Services.CursosProfesores;
import com.mycompany.ejerciciopoo.Services.InscripcionesPersonas;
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
        Persona persona1 = new Persona("Daniel", "pinilla", "jdpinilla");
        Persona persona2 = new Persona("Edward", "Castro", "@Edw");
        Persona decano1 = new Persona("Marco", "Gutierrez", "@marco");
        Profesor profesor1 = new Profesor("Catedratico", 1, "Jesus", "Reyes", "@jrc");
        Facultad facultad1 = new Facultad(1, "Basicas", decano1);
        Programa programa1 = new Programa(1, "Sistemas", 120, "utfgtf", facultad1);
        Estudiante estudiante1 = new Estudiante(123456, programa1, true, 3.3, persona1 );
        Estudiante estudiante2 = new Estudiante(1234, programa1, true, 3.3, persona2 );
        Curso bases = new Curso(1, programa1, true);
        Inscripcion inscripcion1 = new Inscripcion(bases, 2025, 4, estudiante1);
        Inscripcion inscripcion2 = new Inscripcion(bases, 2027, 9, estudiante2);
        CursoProfesor curPro1 = new CursoProfesor(profesor1, 2025, 4, bases);
        
        InscripcionesPersonas gestionarPersonas = new InscripcionesPersonas();
        CursosInscritos gestionarCursos = new CursosInscritos();
        CursosProfesores gestionarCursospProfesores = new CursosProfesores();

        gestionarPersonas.inscribir(persona1);
        gestionarPersonas.guardarInformacion();
        gestionarPersonas.cargarDatos();
        
        System.err.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        gestionarCursos.inscribirCurso(inscripcion1);
        gestionarCursos.inscribirCurso(inscripcion2);
        gestionarCursos.guardarInformacion(inscripcion2);
        gestionarCursos.cargarDatos();

        System.err.println("----------------------------------------------------------");
        inscripcion2.setAnio(2025);
        gestionarCursos.actualizar(inscripcion2);
        gestionarCursos.guardarInformacion(inscripcion2);
        gestionarCursos.cargarDatos();

        System.err.println("************************************************************************");
        inscripcion1.setAnio(2024);
        gestionarCursos.actualizar(inscripcion1);
        gestionarCursos.cargarDatos();


        gestionarCursospProfesores.inscribir(curPro1);

    }
    

    
}
