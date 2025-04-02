package ejercicio5;

import java.util.List;

public class Profesor extends Usuario {
    private String certificacion;
    private List<Curso> cursos;

    public Profesor(Integer id, String nombre, String email, String password, String certificacion, List<Curso> cursos) {
        super(id, nombre, email, password);
        this.certificacion = certificacion;
        this.cursos = cursos;
    }

    public String getCertificacion() { return certificacion; }
    public List<Curso> getCursos() { return cursos; }
}
