package ejercicio6;

import java.util.List;

public class Recorrido {
    private Integer id;
    private List<Parada> paradas;
    private Linea linea;
    private UnidadTransporte unidadTransporte;

    public Recorrido(Integer id, List<Parada> paradas, Linea linea, UnidadTransporte unidadTransporte) {
        this.id = id;
        this.paradas = paradas;
        this.linea = linea;
        this.unidadTransporte = unidadTransporte;
    }
}
