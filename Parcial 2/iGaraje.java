
package evaluacion;

/**
 *
 * @author USUARIO
 */
public interface iGaraje {
    double calcularIngresos();
    int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo);
}
