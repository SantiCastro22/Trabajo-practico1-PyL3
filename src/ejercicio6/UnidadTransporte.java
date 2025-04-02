package ejercicio6;

public class UnidadTransporte {
    private String patente;
    private String marca;
    private String modelo;
    private Integer capacidad;
    private Estado estado;
    private Conductor conductor;

    public UnidadTransporte(String patente, String marca, String modelo, Integer capacidad, Estado estado, Conductor conductor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.estado = estado;
        this.conductor = conductor;
    }
}
