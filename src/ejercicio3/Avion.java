package ejercicio3;

public class Avion {
    private Integer id;
    private String matricula;
    private Estado estado;
    private SituacionActual situacionActual;
    private TipoAvion tipoAvion;

    public Avion(Integer id, String matricula, Estado estado, SituacionActual situacionActual, TipoAvion tipoAvion) {
        this.id = id;
        this.matricula = matricula;
        this.estado = estado;
        this.situacionActual = situacionActual;
        this.tipoAvion = tipoAvion;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }
    public SituacionActual getSituacionActual() { return situacionActual; }
    public void setSituacionActual(SituacionActual situacionActual) { this.situacionActual = situacionActual; }
    public TipoAvion getTipoAvion() { return tipoAvion; }
    public void setTipoAvion(TipoAvion tipoAvion) { this.tipoAvion = tipoAvion; }

}
