package ejercicio3;

public class Piloto {
    private String id;
    private String nombre;
    private int nivelExperiencia;

    public Piloto(String id, String nombre, int nivelExperiencia, RolPiloto rol) {
        this.id = id;
        this.nombre = nombre;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getNivelExperiencia() { return nivelExperiencia; }
    public void setNivelExperiencia(int nivelExperiencia) { this.nivelExperiencia = nivelExperiencia; }

}
