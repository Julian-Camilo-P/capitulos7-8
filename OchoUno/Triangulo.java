
package OchoUno;

/**
 *
 * @author USUARIO
 */
public class Triangulo extends Forma implements IFormas {
    private double base;
    private double altura;

    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
       
        double lado = Math.sqrt((base / 2) * (base / 2) + altura * altura);
        return 2 * lado + base;
    }
}