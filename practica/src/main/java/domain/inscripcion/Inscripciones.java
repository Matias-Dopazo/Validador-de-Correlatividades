package domain.inscripcion;

import java.util.List;

public class Inscripciones {
    private Alumno alumno;
    private List<Materias> materias;

    public Inscripciones(Alumno alumno, List<Materias> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materias> getMaterias() {
        return materias;
    }

    public Boolean aprobado(){
        return  this.getMaterias().stream().allMatch(materia -> materia.mePuedenCursar(this.getAlumno()));
    }
}
