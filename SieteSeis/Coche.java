
package SieteSeis;

/**
 *
 * @author USUARIO
 */
public class Coche {
    private final String marca;
    private String color;
    private int km;
    private double precio;
    private final double factorContaminacion;
    private final int anio;
    private String matricula;
    private double impuestoMatriculacion;
  

    public Coche(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.km = 0;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
    }

 

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getKm() { return km; }
    public void anadirKm(int km) { this.km += km; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getImpuestoMatriculacion() { return impuestoMatriculacion; }
    public void setImpuestoMatriculacion(double impuestoMatriculacion) { this.impuestoMatriculacion = impuestoMatriculacion; }

    

    public double calcularImpuestoContaminacion() {
        if (factorContaminacion < 5.0) return precio * 0.02;
        else if (factorContaminacion < 10.0) return precio * 0.05;
        else return precio * 0.10;
    }

}

