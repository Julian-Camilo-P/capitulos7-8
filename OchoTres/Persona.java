
package OchoTres;

/**
 *
 * @author USUARIO
 */
public class Persona {
    
    private String nombre;
    private String NIF;

    
    public Persona(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
}

