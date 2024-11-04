
package SieteDos;

/**
 *
 * @author USUARIO
 */
public class PruebaMoto {
    public static void main(String[] args) {
        Moto moto = new Moto();
        
        moto.acelerar(50);
        System.out.println("Velocidad tras acelerar: " + moto.getVelocidad());

        moto.acelerar(120);
        System.out.println("Velocidad tras acelerar más: " + moto.getVelocidad());

        moto.frenar(30);
        System.out.println("Velocidad tras frenar: " + moto.getVelocidad());

        moto.frenar(200);
        System.out.println("Velocidad tras frenar demasiado: " + moto.getVelocidad());
    }
}
