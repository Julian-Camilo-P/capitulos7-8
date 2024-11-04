
package OchoCinco;

/**
 *
 * @author USUARIO
 */
class Camion extends Vehiculo {
    private double tamanoRemolque;
    private int ejes;

    public Camion(double precioCompra, String marca, double tamanoRemolque, int ejes) {
        super(precioCompra, marca);
        this.tamanoRemolque = tamanoRemolque;
        this.ejes = ejes;
    }

    @Override
    public double precioVenta() {
        return precioVentaBase * ejes;
    }
}