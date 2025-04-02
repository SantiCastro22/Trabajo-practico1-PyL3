package ejercicio2;

public class Pelicula {
    private Integer ID;
    private String titulo;
    private String fechaLanzamiento;
    private double precioAlquiler;
    private double precioVenta;
    private boolean disponible;
    private int cantDisponble;

    public Pelicula(Integer ID, String titulo, String fechaLanzamiento, double precioAlquiler, double precioVenta, boolean disponible, int cantDisponble){
        this.ID = ID;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precioAlquiler = precioAlquiler;
        this.precioVenta = precioVenta;
        this.disponible = disponible;
        this.cantDisponble = cantDisponble;
    }

    public Integer getID(){ return ID; }
    public String getTitulo(){ return titulo; }
    public String getFechaLanzamiento(){ return fechaLanzamiento; }
    public double getPrecioAlquiler(){ return precioAlquiler; }
    public double getPrecioVenta(){ return precioVenta; }
    public boolean getDisponible(){ return disponible; }
    public int getCantDisponible(){ return cantDisponble; }
}
