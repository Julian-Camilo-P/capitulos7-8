package OchoTres;

/**
 *
 * @author USUARIO
 */
public class CuentaCorriente extends Cuenta {

    
    private double maximoRetirable;

    
    public CuentaCorriente(Persona cliente, long numeroCuenta, double maximoRetirable) {
        super(cliente, numeroCuenta);
        this.maximoRetirable = maximoRetirable;
    }

    
    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

   
    @Override
    public void retirar(double x) {
        if (x > 0 && x <= maximoRetirable && x <= getSaldo()) {
            setSaldo(getSaldo() - x);
            System.out.println("Se han retirado " + x + "€. Saldo actual: " + getSaldo() + "€");
        } else {
            System.out.println("Retiro no permitido. Asegúrese de que el monto sea mayor a 0, no supere el máximo retirable y haya saldo suficiente.");
        }
    }

    
    @Override
    public String toString() {
        return "CuentaCorriente{"
                + "numeroCuenta=" + getNumeroCuenta()
                + ", saldo=" + getSaldo()
                + ", cliente=" + getCliente().getNombre()
                + ", maximoRetirable=" + maximoRetirable
                + '}';
    }
}
