
package OchoDos;

/**
 *
 * @author USUARIO
 */
public class Programador extends Empleado {
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    
    public Programador() {}

    
    public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    
    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    
    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nLíneas de código por hora: " + lineasDeCodigoPorHora + "\nLenguaje dominante: " + lenguajeDominante;
    }
}

