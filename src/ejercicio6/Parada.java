package ejercicio6;

public class Parada {
    private Integer id;
    private String nombre;
    private String direccion;
    private Recorrido recorrido;

    public Parada(Integer id, String nombre, String direccion, Recorrido recorrido) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.recorrido = recorrido;
    }
}
