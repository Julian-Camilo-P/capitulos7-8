
package Evaluación2PrincipiosPOO;

/**
 *
 * @author USUARIO
 */
public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String placa, String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(placa, marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        if (tieneRadio) this.impuestoCirculacion += this.impuestoCirculacion * 0.01;
        if (tieneNavegador) this.impuestoCirculacion += this.impuestoCirculacion * 0.02;
        if (cilindraje > 2499) this.cuotaMesGaraje += this.cuotaMesGaraje * 0.20;
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    
}

