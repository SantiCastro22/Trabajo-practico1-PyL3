package ejercicio1;

import java.util.List;

public class Departamento {
    private String nombre;
    private List<Oficina> oficinas;
    private List<Profesor> profesores;
    private List<Aula> aulas;

    public Departamento(String nombre, List<Oficina> oficinas, List<Profesor> profesores, List<Aula> aulas) {
        this.nombre = nombre;
        this.oficinas = oficinas;
        this.profesores = profesores;
        this.aulas = aulas;
    }

    public String getNombre() { return nombre; }
    public List<Oficina> getOficinas() { return oficinas; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Aula> getAulas() { return aulas; }
}
