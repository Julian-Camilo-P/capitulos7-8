
package SieteNueve;

/**
 *
 * @author USUARIO
 */
public class Rectangulo {
    private float base;
    private float altura;
    private float x;
    private float y;

    public Rectangulo(float base, float altura, float x, float y) {
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public Rectangulo(float base, float altura) { this(base, altura, 0, 0); }

    public Rectangulo(float base) { this(base, 1, 0, 0); }

    public Rectangulo() { this(1, 1, 0, 0); }

    public float getArea() { return base * altura; }

    public float getPerimetro() { return 2 * (base + altura); }

    public void agranda(float aumentaBase, float aumentaAltura) {
        this.base += aumentaBase;
        this.altura += aumentaAltura;
    }

    public void agranda(float valor) { agranda(valor, valor); }

    public void agranda() { agranda(1, 1); }

    public Rectangulo copiar() { return new Rectangulo(base, altura, x, y); }
}

