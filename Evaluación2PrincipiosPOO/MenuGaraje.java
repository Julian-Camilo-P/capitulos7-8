
package Evaluación2PrincipiosPOO;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class MenuGaraje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje();

        while (true) {
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
            System.out.println("5. Listado de matrículas, cuota mensual y tipo de vehículo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    System.out.print("Ingrese la matrícula del vehículo a retirar: ");
                    String placa = scanner.next();
                    if (garaje.retirarVehiculo(placa)) {
                        System.out.println("Vehículo retirado.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingresos mensuales: " + garaje.calcularIngresos());
                    break;
                case 4:
                    int numAutos = garaje.calcularOcupacionPorTipoVehiculo(Auto.class);
                    int numMotos = garaje.calcularOcupacionPorTipoVehiculo(Moto.class);
                    System.out.println("Proporción autos/motos: " + numAutos + "/" + numMotos);
                    break;
                case 5:
                    garaje.listarVehiculos();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}

