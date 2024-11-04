
package OchoCinco;

/**
 *
 * @author USUARIO
 */
class Coche extends Vehiculo {
    private int puertas;

    public Coche(double precioCompra, String marca, int puertas) {
        super(precioCompra, marca);
        this.puertas = puertas;
    }

    @Override
    public double precioVenta() {
        return precioVentaBase;
    }
}