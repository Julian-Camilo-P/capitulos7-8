
package SieteDos;

/**
 *
 * @author USUARIO
 */
public class Moto {
    private int velocidad;

    public Moto() {
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int incremento) {
        velocidad = Math.min(velocidad + incremento, 150);
    }

    public void frenar(int decremento) {
        velocidad = Math.max(velocidad - decremento, 0);
    }
}