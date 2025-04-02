package ejercicio3;

import java.util.List;

public class TipoAvion {
    private String modelo;
    private int capacidadPilotos;
    private int capacidadPasajeros;
    private List<RolPiloto> rolPiloto;


    public TipoAvion(String modelo, int capacidadPilotos, int capacidadPasajeros, List<RolPiloto> rolPiloto) {
        this.modelo = modelo;
        this.capacidadPilotos = capacidadPilotos;
        this.capacidadPasajeros = capacidadPasajeros;
        this.rolPiloto = rolPiloto;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getCapacidadPilotos() { return capacidadPilotos; }
    public void setCapacidadPilotos(int capacidadPilotos) { this.capacidadPilotos = capacidadPilotos; }
    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }
    public List<RolPiloto> getRolPiloto() { return rolPiloto; }
    public void setRolPiloto(List<RolPiloto> rolPiloto) { this.rolPiloto = rolPiloto; }
}
