package OchoTres;

/**
 *
 * @author USUARIO
 */
public class CuentaAhorro extends Cuenta {

    
    private double saldoMinimo;

    
    public CuentaAhorro(Persona cliente, long numeroCuenta, double saldoMinimo) {
        super(cliente, numeroCuenta);
        this.saldoMinimo = saldoMinimo;
    }

    
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    
    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo() - x) >= saldoMinimo) {
            setSaldo(getSaldo() - x);
            System.out.println("Se han retirado " + x + "€. Saldo actual: " + getSaldo() + "€");
        } else {
            System.out.println("Retiro no permitido. Asegúrese de que el monto sea mayor a 0 y no supere el saldo mínimo.");
        }
    }

   
    @Override
    public String toString() {
        return "CuentaAhorro{"
                + "numeroCuenta=" + getNumeroCuenta()
                + ", saldo=" + getSaldo()
                + ", cliente=" + getCliente().getNombre()
                + ", saldoMinimo=" + saldoMinimo
                + '}';
    }
}
