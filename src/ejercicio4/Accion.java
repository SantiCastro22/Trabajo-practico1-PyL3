package ejercicio4;

public class Accion {
    private Integer id;
    private String nombre;
    private int cantidad;
    private double precio;

    public Accion(Integer id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio;}

}
