
package SieteCinco;

/**
 *
 * @author USUARIO
 */
public class Semaforo {
    private String color;

    public Semaforo() {
        this.color = "rojo";
    }

    public void cambio() {
        switch (color) {
            case "rojo":
                color = "verde";
                break;
            case "verde":
                color = "amarillo";
                break;
            case "amarillo":
                color = "rojo";
                break;
        }
        System.out.println("El color del semáforo es ahora: " + color);
    }
}



