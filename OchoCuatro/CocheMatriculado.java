
package OchoCuatro;

/**
 *
 * @author USUARIO
 */
public class CocheMatriculado extends Coche {
    private final int anioMatriculacion;
    private final int mesMatriculacion;
    private double impuestoMatriculacion;

    public CocheMatriculado(String marca, String color, double precio, double factor_contaminacion, int anio, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factor_contaminacion, anio);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    private void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        if (2023 - getAnio() > 10) {
            impuestoMatriculacion += 100;
        }
    }

   
    public double getImpuestoMatriculacion() { return impuestoMatriculacion; }

    private int getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getAnio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}