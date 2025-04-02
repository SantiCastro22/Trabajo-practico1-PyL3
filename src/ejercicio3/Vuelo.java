package ejercicio3;

import java.util.Date;

public class Vuelo {
    private String id;
    private Aeropuerto origen;
    private Aeropuerto destino;
    private Date horarioSalida;
    private Date horarioLlegada;
    private Piloto piloto;
    private Piloto copiloto;
    private Avion avion;

    public Vuelo(String id, Aeropuerto origen, Aeropuerto destino, Date horarioSalida,
                 Date horarioLlegada, Piloto piloto, Piloto copiloto, Avion avion) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.avion = avion;
    }
}

