package ejercicio3;

public class Aeropuerto {
    private Integer id;
    private String nombre;
    private String ciudad;
    private String pais;

    public Aeropuerto(Integer id, String nombre, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}
