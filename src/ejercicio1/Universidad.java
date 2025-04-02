package ejercicio1;

import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private String CUIT;
    private List<Departamento> departamentos;

    //Constructor
    public Universidad(String nombre, String direccion, String CUIT, List<Departamento> departamentos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.CUIT = CUIT;
        this.departamentos = departamentos;
    }
    // Getters and Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getCUIT() { return CUIT; }
    public void setCUIT(String CUIT) { this.CUIT = CUIT; }
    public List<Departamento> getDepartamentos() { return departamentos; }
    public void setDepartamentos(List<Departamento> departamentos) { this.departamentos = departamentos; }
}
