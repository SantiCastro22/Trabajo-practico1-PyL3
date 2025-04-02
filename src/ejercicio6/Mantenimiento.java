package ejercicio6;

import java.util.Date;

public class Mantenimiento {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private TipoMantenimiento tipo;
    private UnidadTransporte unidad;

    public Mantenimiento(Integer id, String descripcion, Date fecha, TipoMantenimiento tipo, UnidadTransporte unidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
        this.unidad = unidad;
    }

}
