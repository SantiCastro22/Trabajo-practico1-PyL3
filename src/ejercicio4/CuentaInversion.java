package ejercicio4;

import java.util.List;

public class CuentaInversion extends Cuenta{
    private List<Accion> acciones;

    public CuentaInversion(String numero, double saldo, Cliente cliente, List<Accion> acciones) {
        super(numero, saldo, cliente);
        this.acciones = acciones;
    }

    public List<Accion> getAcciones() { return acciones; }
}
