package ejercicio5;

import java.util.List;

public class Alumno extends Usuario{
    private String matricula;
    private List<Curso> cursos;
    private Progreso progreso;
    private Subscripcion subscripcion;

    public Alumno(Integer id, String nombre, String email, String password, String matricula, List<Curso> cursos, Progreso progreso, Subscripcion subscripcion) {
        super(id, nombre, email, password);
        this.matricula = matricula;
        this.cursos = cursos;
        this.progreso = progreso;
        this.subscripcion = subscripcion;
    }

    public String getMatricula() { return matricula; }
    public List<Curso> getCursos() { return cursos; }
    public Progreso getProgreso() { return progreso; }
    public Subscripcion getSubscripcion() { return subscripcion; }
}
