
package SieteCuatro;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "";
    }

    public void esMayorDeEdad() {
        System.out.println(edad >= 18 ? "Es mayor de edad" : "No es mayor de edad");
    }

    public int cuantoHaceMayorEdad(int edadMayoria) {
        return edad >= edadMayoria ? edad - edadMayoria : 0;
    }

    public boolean asignarDNI(String dni) {
        if (dni.length() == 9) {
            this.dni = dni;
            return true;
        }
        return false;
    }

    public boolean estaJubilado(int edadDeJubilacion) {
        return edad >= edadDeJubilacion;
    }
}


