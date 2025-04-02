package ejercicio4;

public class CuentaAhorro extends Cuenta{
    private double tasaInteres;

    public CuentaAhorro(String numero, double saldo, Cliente cliente, double tasaInteres) {
        super(numero, saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() { return tasaInteres; }
    public void setTasaInteres(double tasaInteres) { this.tasaInteres = tasaInteres; }
}
