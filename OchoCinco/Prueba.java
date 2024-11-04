package OchoCinco;

/**
 *
 * @author USUARIO
 */
public class Prueba {

    public static void main(String[] args) {

        Camion[] camiones = {
            new Camion(20000, "Volvo", 15, 4),
            new Camion(25000, "Mercedes", 20, 3),
            new Camion(30000, "MAN", 25, 2)
        };

        double totalPrecioCamiones = 0;
        for (Camion camion : camiones) {
            totalPrecioCamiones += camion.precioVenta();
        }
        System.out.println("Precio de venta total de todos los camiones: " + totalPrecioCamiones);

        Furgoneta[] furgonetas = {
            new Furgoneta(10000, "Ford", 12),
            new Furgoneta(12000, "Fiat", 8)
        };

        double totalPrecioFurgonetas = 0;
        for (Furgoneta furgoneta : furgonetas) {
            totalPrecioFurgonetas += furgoneta.precioVenta();
        }
        System.out.println("Precio de venta total de todas las furgonetas: " + totalPrecioFurgonetas);
    }
}
