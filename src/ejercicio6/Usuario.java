package ejercicio6;

import java.util.List;

public class Usuario {
    private Integer id;
    private String nombre;
    private TipoUsuario tipoUsuario;
    private Tarjeta tarjeta;
    private List<Recarga> recargas;

    public Usuario(Integer id, String nombre, TipoUsuario tipoUsuario, Tarjeta tarjeta, List<Recarga> recargas) {
        this.id = id;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.tarjeta = tarjeta;
        this.recargas = recargas;
    }

}
