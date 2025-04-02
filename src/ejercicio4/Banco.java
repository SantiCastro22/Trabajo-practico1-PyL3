package ejercicio4;

import java.util.List;

public class Banco {
    private Integer id;
    private String nombre;
    private String direccion;
    private List<Cliente> clientes;

    public Banco(Integer id, String nombre, String direccion, List<Cliente> clientes) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = clientes;
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public List<Cliente> getClientes() { return clientes; }
}
