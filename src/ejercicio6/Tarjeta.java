package ejercicio6;

public class Tarjeta {
    private Integer id;
    private String numero;
    private double saldo;
    private Usuario usuario;

    public Tarjeta(Integer id, String numero, double saldo, Usuario usuario) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public Usuario getUsuario() { return usuario; }
}
