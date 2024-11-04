
package Evaluación2PrincipiosPOO;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
    protected String placa;
    protected String marca;
    protected double precio;
    protected int cilindraje;
    protected double impuestoCirculacion;
    protected double cuotaMesGaraje;
    private static final double CUOTA_MES_GARAJE_DEFAULT = 100;

    public Vehiculo(String placa, String marca, double precio, int cilindraje) {
        this.placa = null;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTA_MES_GARAJE_DEFAULT;
        calcularImpuestoCirculacion();
    }

    public String getPlaca() { 
        return placa; 
    }
    public String getMarca() { 
        return marca; 
    }
    public double getPrecio() { 
        return precio; 
    }
    public int getCilindraje() { 
        return cilindraje; 
    }
    public double getImpuestoCirculacion() { 
        return impuestoCirculacion; 
    }
    public double getCuotaMesGaraje() { 
        return cuotaMesGaraje; 
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if (cuotaMesGaraje >= 0) {
            this.cuotaMesGaraje = cuotaMesGaraje;
        }
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = precio * 0.02;
    }

    public boolean matricular(String placa) {
        if (placa.length() == 6) {
            this.placa = placa;
            return true;
        }
        return false;
    }
}
