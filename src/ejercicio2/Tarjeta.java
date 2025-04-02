package ejercicio2;

public class Tarjeta {
    private Integer nroTarjeta;
    private double saldo;
    private String titular;

    public Tarjeta(Integer nroTarjeta, double saldo, String titular){
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Integer getNroTarjeta(){ return nroTarjeta; }
    public double getSaldo(){ return saldo; }
    public String getTitular(){ return titular; }
}
