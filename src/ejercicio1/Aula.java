package ejercicio1;


import java.util.List;

public class Aula {
    private int id;
    private int capacidad;
    private List<Silla> sillas;

    public Aula(int id, int capacidad, List<Silla> sillas) {
        this.id = id;
        this.capacidad = capacidad;
        this.sillas = sillas;
    }

    public int getId() { return id; }
    public int getCapacidad() { return capacidad; }
    public List<Silla> getSillas() { return sillas; }
}
