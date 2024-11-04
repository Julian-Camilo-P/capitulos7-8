
package SieteCuatro;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 20);
        persona1.esMayorDeEdad();
        System.out.println("Años desde mayoría de edad: " + persona1.cuantoHaceMayorEdad(18));
        System.out.println("Asignación de DNI: " + persona1.asignarDNI("123456789"));
        System.out.println("¿Está jubilado? " + persona1.estaJubilado(65));
    }
}

