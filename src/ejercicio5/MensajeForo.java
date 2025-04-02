package ejercicio5;

public class MensajeForo {
    private Integer idMensaje;
    private String mensaje;

    public MensajeForo(Integer idMensaje, String mensaje) {
        this.idMensaje = idMensaje;
        this.mensaje = mensaje;
    }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
