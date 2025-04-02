package ejercicio5;

import java.util.List;

public class Tutor extends Usuario{
    private String areaEspecializacion;
    private List<Curso> cursos;

    public Tutor(Integer id, String nombre, String email, String password, String areaEspecializacion, List<Curso> cursos) {
        super(id, nombre, email, password);
        this.areaEspecializacion = areaEspecializacion;
        this.cursos = cursos;
    }

    public String getAreaEspecializacion() { return areaEspecializacion; }
    public List<Curso> getCursos() { return cursos; }
}
