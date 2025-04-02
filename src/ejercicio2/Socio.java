package ejercicio2;

public class Socio extends Usuario{
    private Tarjeta tarjeta;

    public Socio(Integer id, String nombre, String email, Tarjeta tarjeta) {
        super(id,nombre, email);
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() { return tarjeta; }
}
