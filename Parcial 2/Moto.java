
package evaluacion;

/**
 *
 * @author USUARIO
 */
public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String placa, String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(placa, marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar) {
            this.impuestoCirculacion += this.impuestoCirculacion * 0.10;
            this.cuotaMesGaraje += this.cuotaMesGaraje * 0.50;
        }
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
}
