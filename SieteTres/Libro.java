
package SieteTres;

/**
 *
 * @author USUARIO
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.ejemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
    }

    public boolean prestar() {
        if (ejemplaresPrestados < ejemplares) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

}



