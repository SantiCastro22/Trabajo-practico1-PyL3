package ejercicio3;

import java.util.List;

public class Aerolinea {
    private Integer id;
    private String nombre;
    private List<Avion> aviones;
    private List<Piloto> pilotos;
    private List<Vuelo> vuelos;

    public Aerolinea(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void agregarVuelo(Vuelo vuelo) { vuelos.add(vuelo); }
    public void agregarAvion(Avion avion) { aviones.add(avion); }
    public void agregarPiloto(Piloto piloto) { pilotos.add(piloto); }

}
