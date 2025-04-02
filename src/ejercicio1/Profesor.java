package ejercicio1;

public class Profesor extends Persona{
    private Categoria categoria;
    private Dedicacion dedicacion;
    private Departamento departamento;

    public Profesor(String id, String nombre, String apellido, String dni,
                    Categoria categoria, Dedicacion dedicacion, Departamento departamento) {
        super(id, nombre, apellido, dni);
        this.categoria = categoria;
        this.dedicacion = dedicacion;
        this.departamento = departamento;
    }

    public Categoria getCategoria() { return categoria; }
    public Dedicacion getDedicacion() { return dedicacion; }
    public Departamento getDepartamento() { return departamento; }
}
