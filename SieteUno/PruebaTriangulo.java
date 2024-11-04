
package SieteUno;

/**
 *
 * @author USUARIO
 */
public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5, 10);
        System.out.println("Área de t1: " + t1.calcularArea());

        t1.setBase(8);
        t1.setAltura(12);
        System.out.println("Nueva área de t1: " + t1.calcularArea());
    }
}