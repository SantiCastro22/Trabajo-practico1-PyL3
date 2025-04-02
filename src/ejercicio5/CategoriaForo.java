package ejercicio5;

public class CategoriaForo {
    private String nombre;
    private String descripcion;
    private Foro foro;

    public CategoriaForo(String nombre, String descripcion, Foro foro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foro = foro;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Foro getForo() { return foro; }
    public void setForo(Foro foro) { this.foro = foro; }

}
