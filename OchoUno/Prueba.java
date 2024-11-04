
package OchoUno;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
      
        Cuadrado cuadrado1 = new Cuadrado("Cuadrado1", 0, 0, "Rojo", 4);
        Cuadrado cuadrado2 = new Cuadrado("Cuadrado2", 1, 1, "Azul", 5);
        Triangulo triangulo1 = new Triangulo("Triángulo1", 2, 2, "Verde", 6, 8);
        
        Forma[] formas = {cuadrado1, cuadrado2, triangulo1};

       
        double sumaAreas = 0;
        double sumaAreasCuadrados = 0;
        int contadorCuadrados = 0;
        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de todas las áreas: " + sumaAreas);
        System.out.println("Media de las áreas de los cuadrados: " + (contadorCuadrados > 0 ? sumaAreasCuadrados / contadorCuadrados : 0));

        
        double sumaPerimetros = 0;
        for (Forma forma : formas) {
            if (forma instanceof IFormas) {
                sumaPerimetros += ((IFormas) forma).calcularPerimetro();
            }
        }
        System.out.println("Suma de todos los perímetros: " + sumaPerimetros);
    }
}