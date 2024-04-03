package domain;

import domain.inscripcion.Alumno;
import domain.inscripcion.Inscripciones;
import domain.inscripcion.Materias;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testInscripcion {
    @Test
    public void prueba(){
        Materias ingles1 = new Materias(Arrays.asList());
        Materias ingles2 = new Materias(Arrays.asList(ingles1));
        Materias algoritmo = new Materias(Arrays.asList());
        Materias paradigmas = new Materias(Arrays.asList(algoritmo));
        Materias disenioDeSistemas = new Materias(Arrays.asList(paradigmas));
        Materias analisisMatmatico1 = new Materias(Arrays.asList());
        Materias algebra = new Materias(Arrays.asList());
        Materias analisisMatmatico2 = new Materias(Arrays.asList(analisisMatmatico1,algebra));
        Alumno jorge = new Alumno(Arrays.asList(algoritmo,paradigmas,ingles1));
        Inscripciones inscripto1 = new Inscripciones(jorge,Arrays.asList(disenioDeSistemas,ingles2));
        Assert.assertTrue(inscripto1.aprobado());
        Alumno martina = new Alumno(Arrays.asList(algoritmo,ingles1,analisisMatmatico1));
        Inscripciones inscripto2 = new Inscripciones(martina,Arrays.asList(analisisMatmatico2,paradigmas));
        Assert.assertFalse(inscripto2.aprobado());

    }
}
