
package OchoTres;

/**
 *
 * @author USUARIO
 */
public abstract class Cuenta {
    
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

  
    public Cuenta(Persona cliente, long numeroCuenta) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; 
    }

    
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    
    public void ingresar(double x) {
        if (x > 0) {
            saldo += x;
            System.out.println("Se han ingresado " + x + "€. Saldo actual: " + saldo + "€");
        } else {
            System.out.println("El monto a ingresar debe ser positivo.");
        }
    }

    
    public abstract void retirar(double x);
}