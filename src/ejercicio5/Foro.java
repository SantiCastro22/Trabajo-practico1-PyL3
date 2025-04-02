package ejercicio5;

import java.util.ArrayList;

public class Foro {
    private Integer id;
    private String titulo;
    private CategoriaForo categoria;
    private ArrayList<MensajeForo> mensajes;

    public Foro(Integer id, String titulo, CategoriaForo categoria, Curso curso) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.mensajes = new ArrayList<MensajeForo>();
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public CategoriaForo getCategoria() { return categoria; }
    public void setCategoria(CategoriaForo categoria) { this.categoria = categoria; }
    public ArrayList<MensajeForo> getMensajes() { return mensajes; }
    public void setMensajes(ArrayList<MensajeForo> mensajes) { this.mensajes = mensajes; }
}
