package ejercicio2;

import java.util.ArrayList;

public class Catalogo {
    private String nombre;
    private String descripcion;
    private ArrayList<Pelicula> peliculas;

    public Catalogo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peliculas = new ArrayList<Pelicula>();
    }

    public String getNombre(){ return nombre; }
    public String getDescripcion(){ return descripcion; }
    public ArrayList<Pelicula> getPeliculas(){ return peliculas; }
}
