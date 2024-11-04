
package SieteTres;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Java Programming", "Autor 1", 3);
        libro1.prestar();
        System.out.println("Prestamos el libro: " + libro1.prestar());
        System.out.println("Devolvemos el libro: " + libro1.devolver());
    }
}
