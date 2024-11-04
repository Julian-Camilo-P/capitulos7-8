
package SieteOcho;

/**
 *
 * @author USUARIO
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private int saldo;
    private Persona titular;

    public CuentaBancaria(String numeroCuenta, int saldoInicial, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
        if (saldo >= 1000) saldo += saldo * 0.02;
    }

    public void ingreso(int cantidad) {
        saldo += cantidad;
        if (saldo >= 1000) saldo += saldo * 0.02;
    }

    public boolean extraccion(int cantidad) {
        if (titular.getEdad() < 18 || saldo < cantidad) return false;
        saldo -= cantidad;
        return true;
    }

    public void ingresoTotal(CuentaBancaria otraCuenta) {
        this.saldo += otraCuenta.saldo;
        otraCuenta.saldo = 0;
    }


}

