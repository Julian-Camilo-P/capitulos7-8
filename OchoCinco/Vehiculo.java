
package OchoCinco;

/**
 *
 * @author USUARIO
 */
abstract class Vehiculo {
    protected double precioCompra;
    protected String marca;
    protected double precioVentaBase;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
        this.precioVentaBase = precioCompra * 1.6;
    }

    public abstract double precioVenta();
}