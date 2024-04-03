package domain.inscripcion;


import java.util.List;

public class Alumno {
    private List<Materias> materiasAprobadas;

    public Alumno(List<Materias> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materias> getMateriasAprobadas() {
        return materiasAprobadas;
    }



    public Boolean materiaAprobada(Materias materia){
        return  this.getMateriasAprobadas().contains(materia);
    }
}
