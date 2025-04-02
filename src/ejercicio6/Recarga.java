package ejercicio6;

import java.util.Date;

public class Recarga {
    private Integer id;
    private double monto;
    private Date fecha;
    private Tarjeta tarjeta;
    private Usuario usuario;

    public Recarga(Integer id, double monto, Date fecha, Tarjeta tarjeta, Usuario usuario) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.tarjeta = tarjeta;
        this.usuario = usuario;
    }
}
