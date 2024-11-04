
package Evaluación2PrincipiosPOO;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;

public class Garaje implements iGaraje {
    private static final int NUM_ESPACIOS = 50;
    private List<Vehiculo> vehiculos;

    public Garaje() {
        vehiculos = new ArrayList<>(NUM_ESPACIOS);
    }

    public boolean alquilarEspacio(Vehiculo v) {
        if (vehiculos.size() < NUM_ESPACIOS && v.getPlaca() != null) {
            long motosCount = vehiculos.stream().filter(vehiculo -> vehiculo instanceof Moto).count();
            if (!(v instanceof Moto) || motosCount < NUM_ESPACIOS * 0.8) {
                return vehiculos.add(v);
            }
        }
        return false;
    }

    public boolean retirarVehiculo(String placa) {
        return vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public double calcularIngresos() {
        return vehiculos.stream().mapToDouble(Vehiculo::getCuotaMesGaraje).sum();
    }

    public int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo) {
        return (int) vehiculos.stream().filter(tipo::isInstance).count();
    }

    public void listarVehiculos() {
        vehiculos.forEach(v -> System.out.println("Matrícula: " + v.getPlaca() + ", Cuota: " + v.getCuotaMesGaraje() + ", Tipo: " + v.getClass().getSimpleName()));
    }
}
