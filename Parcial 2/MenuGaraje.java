
package evaluacion;

import java.util.Scanner;

public class MenuGaraje {

    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Opciones del Garaje:");
            System.out.println("1. Alquilar espacio para vehiculo");
            System.out.println("2. Retirar vehiculo del garaje");
            System.out.println("3. Buscar vehiculo por matricula");
            System.out.println("4. Calcular proporcion de Autos/Motos/Camionetas");
            System.out.println("5. Contar camionetas por tipo de servicio");
            System.out.println("6. Listar vehiculos en el garaje");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de vehiculo (1: Moto, 2: Auto, 3: Camioneta): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Ingrese la matricula: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese el cilindraje: ");
                    int cilindraje = scanner.nextInt();

                    Vehiculo vehiculo = null;

                    switch (tipo) {
                        case 1:
                            System.out.print("¿Tiene sidecar? (true/false): ");
                            boolean tieneSidecar = scanner.nextBoolean();
                            vehiculo = new Moto(placa, marca, precio, cilindraje, tieneSidecar);
                            break;
                        case 2:
                            System.out.print("¿Tiene radio? (true/false): ");
                            boolean tieneRadio = scanner.nextBoolean();
                            System.out.print("¿Tiene navegador? (true/false): ");
                            boolean tieneNavegador = scanner.nextBoolean();
                            vehiculo = new Auto(placa, marca, precio, cilindraje, tieneRadio, tieneNavegador);
                            break;
                        case 3:
                            System.out.print("Tipo de servicio (SUV, Pickup, Carga, Otro): ");
                            scanner.nextLine(); 
                            String tipoServicio = scanner.nextLine();
                            System.out.print("Número de pasajeros: ");
                            int pasajeros = scanner.nextInt();
                            System.out.print("¿Tiene remolque? (true/false): ");
                            boolean tieneRemolque = scanner.nextBoolean();
                            vehiculo = new Camioneta(placa, marca, precio, cilindraje, tipoServicio, pasajeros, tieneRemolque);
                            break;
                        default:
                            System.out.println("Tipo de vehiculo no valido.");
                            break;
                    }

                    if (vehiculo != null && garaje.alquilarEspacio(vehiculo)) {
                        System.out.println("Espacio alquilado exitosamente.");
                    } else {
                        System.out.println("No se pudo alquilar el espacio.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la matricula del vehiculo a retirar: ");
                    scanner.nextLine(); 
                    String placaRetiro = scanner.nextLine();
                    if (garaje.retirarVehiculo(placaRetiro)) {
                        System.out.println("Vehiculo retirado exitosamente.");
                    } else {
                        System.out.println("No se encontro el vehiculo con la matricula proporcionada.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la matricula del vehiculo a buscar: ");
                    scanner.nextLine(); 
                    String matriculaBusqueda = scanner.nextLine();
                    int posicion = garaje.buscarVehiculo(matriculaBusqueda);
                    if (posicion != -99) {
                        System.out.println("Vehiculo encontrado en la posicion: " + posicion);
                    } else {
                        System.out.println("No se encontro el vehículo con la matricula proporcionada.");
                    }
                    break;

                case 4:
                    System.out.println(garaje.calcularProporcionVehiculos());
                    break;

                case 5:
                    garaje.contarCamionetasPorTipo();
                    break;

                case 6:
                    System.out.println("Listado de vehiculos en el garaje:");
                    // Descomentar la linea 110 si usted quiere listar los vehículos
                    // garaje.listarVehiculos();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

            System.out.println();

        } while (opcion != 7);

        scanner.close();
    }
}
