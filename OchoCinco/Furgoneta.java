
package OchoCinco;

/**
 *
 * @author USUARIO
 */
class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
        super(precioCompra, marca);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        if (capacidadCarga > 10) {
            return precioVentaBase * 1.2; 
        }
        return precioVentaBase;
    }
}
