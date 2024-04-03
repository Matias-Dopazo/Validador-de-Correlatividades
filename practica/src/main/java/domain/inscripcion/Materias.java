package domain.inscripcion;

import java.util.List;

public class Materias {
    private List<Materias>correlativas;

    public Materias(List<Materias> correlativas) {
        this.correlativas = correlativas;
    }

    public List<Materias> getCorrelativas() {
        return correlativas;
    }
    public Boolean mePuedenCursar(Alumno alumno){
        return this.getCorrelativas().stream().allMatch(materia -> alumno.materiaAprobada(materia));
    }
}
