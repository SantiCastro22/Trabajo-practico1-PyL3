package ejercicio5;

import java.util.List;

public class Curso {
    private Integer idCurso;
    private String nombre;
    private String descripcion;
    private NivelCurso nivel;
    private Profesor profesor;
    private List<Tutor> tutores;
    private List<Alumno> alumnos;
    private List<Recurso> recursos;
    private List<Foro> foros;

    public Curso(Integer idCurso, String nombre, String descripcion, NivelCurso nivel, Profesor profesor, List<Tutor> tutores, List<Alumno> alumnos, List<Recurso> recursos, List<Foro> foros) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.profesor = profesor;
        this.tutores = tutores;
        this.alumnos = alumnos;
        this.recursos = recursos;
        this.foros = foros;
    }
}
