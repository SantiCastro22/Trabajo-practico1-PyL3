package ejercicio5;

public class Recurso {
    private Integer idRecurso;
    private String nombre;
    private TipoRecurso tipoRecurso;

    public Recurso(Integer idRecurso, String nombre, TipoRecurso tipoRecurso) {
        this.idRecurso = idRecurso;
        this.nombre = nombre;
        this.tipoRecurso = tipoRecurso;
    }
}
