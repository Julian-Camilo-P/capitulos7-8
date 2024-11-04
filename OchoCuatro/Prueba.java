
package OchoCuatro;

/**
 *
 * @author USUARIO
 */
// Clase principal para pruebas
public class Prueba {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.02, 2015);
        coche1.setDniTitular("12345678A");

        CocheMatriculado cocheMatriculado1 = new CocheMatriculado("Ford", "Azul", 15000, 0.03, 2010, 2010, 5);
        cocheMatriculado1.setDniTitular("87654321B");

        // Pruebas de los métodos
        coche1.comprarCoche(cocheMatriculado1);
    }
}