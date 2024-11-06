
package evaluacion;

/**
 *
 * @author USUARIO
 */
public class Camioneta extends Vehiculo {
    private String tipoServicio;
    private int numeroPasajeros;
    private boolean tieneRemolque;

    
    public Camioneta(String placa, String marca, double precio, int cilindraje, String tipoServicio, int numeroPasajeros, boolean tieneRemolque) {
        super(placa, marca, precio, cilindraje);
        
        
        this.tipoServicio = tipoServicio;
        this.tieneRemolque = tieneRemolque;

        
        if (tipoServicio.equalsIgnoreCase("pickup") || tipoServicio.equalsIgnoreCase("carga")) {
            if (numeroPasajeros != 2) {
                throw new IllegalArgumentException("Las camionetas pickup y de carga solo pueden tener 2 pasajeros.");
            }
        } else if (numeroPasajeros < 1 || numeroPasajeros > 5) {
            throw new IllegalArgumentException("El numero de pasajeros para este tipo de camioneta debe ser entre 1 y 5.");
        }
        this.numeroPasajeros = numeroPasajeros;

        
        calcularImpuestoCirculacion();
        calcularCuotaMesGaraje();
    }

    
    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    public void setTieneRemolque(boolean tieneRemolque) {
        this.tieneRemolque = tieneRemolque;
    }

    
    @Override
    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = precio * 0.05;
    }
    
    public void calcularCuotaMesGaraje() {
       
        if (tipoServicio.equalsIgnoreCase("pickup") || tipoServicio.equalsIgnoreCase("carga") || tipoServicio.equalsIgnoreCase("otro")) {
            this.cuotaMesGaraje += this.cuotaMesGaraje * 0.45;
        } else if (tipoServicio.equalsIgnoreCase("suv")) {
            this.cuotaMesGaraje += this.cuotaMesGaraje * 0.10;
        }

        
        if (numeroPasajeros == 2) {
            this.cuotaMesGaraje += this.cuotaMesGaraje * 0.50;  
        } else {
            this.cuotaMesGaraje += this.cuotaMesGaraje * 0.60;  
        }

        
        if (tieneRemolque) {
            this.cuotaMesGaraje += this.cuotaMesGaraje * 0.10;  
        }
    }
}
