
package OchoCuatro;

/**
 *
 * @author USUARIO
 */
public class Coche {
    private final String marca;
    private String color;
    private int km = 0;
    private double precio;
    private final double factor_contaminacion;
    private final int anio;
    private String matricula;
    private String dniTitular;

    public Coche(String marca, String color, double precio, double factor_contaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.factor_contaminacion = factor_contaminacion;
        this.anio = anio;
    }

    public void comprarCoche(Coche otroCoche) {
        if (this.dniTitular != null && otroCoche.dniTitular != null) {
            this.dniTitular = otroCoche.dniTitular;
        }
    }

   
    public void setColor(String color) { this.color = color; }
    public void setKm(int km) { this.km += km; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setMatricula(String matricula) { if (this.matricula == null) this.matricula = matricula; }
    public void setDniTitular(String dniTitular) { this.dniTitular = dniTitular; }
}