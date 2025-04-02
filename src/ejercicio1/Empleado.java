package ejercicio1;

public class Empleado extends Persona{
    private Oficina oficina;

    public Empleado(String id, String nombre, String apellido, String dni, Oficina oficina) {
        super(id, nombre, apellido, dni);
        this.oficina = oficina;
    }

    public Oficina getOficina() { return oficina; }
}
