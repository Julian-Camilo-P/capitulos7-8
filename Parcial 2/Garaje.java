
package evaluacion;

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
//2a
    public int buscarVehiculo(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPlaca().equals(matricula)) {
                return i;
            }
        }
        return -99;
    }
//2b
    public int cantidadPorTipoVehiculo(Class<? extends Vehiculo> tipo) {
        return (int) vehiculos.stream().filter(tipo::isInstance).count();
    }
//2c     
    public boolean alquilarEspacio(Vehiculo v) {
        if (vehiculos.size() < NUM_ESPACIOS && v.getPlaca() != null) {
            int cantidadMotos = cantidadPorTipoVehiculo(Moto.class);
            int cantidadCamionetas = cantidadPorTipoVehiculo(Camioneta.class);

            if (v instanceof Moto && cantidadMotos >= NUM_ESPACIOS * 0.3) {
                return false; // Límite del 30% para motos alcanzado
            }
            if (v instanceof Camioneta && cantidadCamionetas >= NUM_ESPACIOS * 0.2) {
                return false; // Límite del 20% para camionetas alcanzado
            }
            return vehiculos.add(v);
        }
        return false;
    }
//2d    
    public String calcularProporcionVehiculos() {
        int totalVehiculos = vehiculos.size();
        if (totalVehiculos == 0) {
            return "No hay vehículos en el garaje.";
        }

        int cantidadAutos = cantidadPorTipoVehiculo(Auto.class);
        int cantidadMotos = cantidadPorTipoVehiculo(Moto.class);
        int cantidadCamionetas = cantidadPorTipoVehiculo(Camioneta.class);

        double proporcionAutos = (double) cantidadAutos / totalVehiculos * 100;
        double proporcionMotos = (double) cantidadMotos / totalVehiculos * 100;
        double proporcionCamionetas = (double) cantidadCamionetas / totalVehiculos * 100;

        return String.format("Proporción: Autos: %.2f%%, Motos: %.2f%%, Camionetas: %.2f%%",
                proporcionAutos, proporcionMotos, proporcionCamionetas);
    }
//2e    
    public void contarCamionetasPorTipo() {
        long suvCount = vehiculos.stream().filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equalsIgnoreCase("SUV")).count();
        long pickupCount = vehiculos.stream().filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equalsIgnoreCase("pickup")).count();
        long cargaCount = vehiculos.stream().filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equalsIgnoreCase("Carga")).count();
        long otroCount = vehiculos.stream().filter(v -> v instanceof Camioneta && ((Camioneta) v).getTipoServicio().equalsIgnoreCase("Otro")).count();

        System.out.println("Cantidad de camionetas por tipo:");
        System.out.println("SUV: " + suvCount);
        System.out.println("Pickup: " + pickupCount);
        System.out.println("Carga: " + cargaCount);
        System.out.println("Otro: " + otroCount);
    }
    
    //public boolean alquilarEspacio(Vehiculo v) {
       // if (vehiculos.size() < NUM_ESPACIOS && v.getPlaca() != null) {
            //long motosCount = vehiculos.stream().filter(vehiculo -> vehiculo instanceof Moto).count();
           // if (!(v instanceof Moto) || motosCount < NUM_ESPACIOS * 0.8) {
            //    return vehiculos.add(v);
          //  }
      //  }
      //  return false;
   // }

    public boolean retirarVehiculo(String placa) {
        return vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    //public double calcularIngresos() {
        //return vehiculos.stream().mapToDouble(Vehiculo::getCuotaMesGaraje).sum();
    //}

    //public int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo) {
       // return (int) vehiculos.stream().filter(tipo::isInstance).count();
    //}

    //public void listarVehiculos() {
        //vehiculos.forEach(v -> System.out.println("Matrícula: " + v.getPlaca() + ", Cuota: " + v.getCuotaMesGaraje() + ", Tipo: " + v.getClass().getSimpleName()));
    //}//

    @Override
    public double calcularIngresos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Class<? extends Vehiculo> tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void listarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}