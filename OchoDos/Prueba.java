
package OchoDos;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan Pérez", "12345678A", 30, true, 2500.0);
        Programador programador = new Programador("Ana García", "87654321B", 28, false, 3000.0, 50, "Java");

        
        System.out.println("Datos del Empleado:");
        System.out.println(empleado);
        System.out.println("Clasificación: " + empleado.clasifica());
        empleado.subirSalario(10); 
        System.out.println("Salario después del aumento: " + empleado.getSalario());

        System.out.println("\nDatos del Programador:");
        System.out.println(programador);
        System.out.println("Clasificación: " + programador.clasifica());
        programador.subirSalario(15); 
        System.out.println("Salario después del aumento: " + programador.getSalario());
        System.out.println("Salario calculado basado en líneas de código: " + programador.calculaSalario());
    }
}
