package ejercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Integer id;
    private TipoPedido tipo;
    private Date fecha;
    private Socio socio;
    private ArrayList<Pelicula> pelicula;
    private double montoTotal;

    public Pedido(Integer id, TipoPedido tipo, Date fecha, Socio socio, ArrayList<Pelicula> pelicula, double montoTotal){
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.socio = socio;
        this.pelicula = pelicula;
        this.montoTotal = montoTotal;
    }

}
