
package SieteSiete;

/**
 *
 * @author USUARIO
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        ajustar();
    }

    public Reloj(int hora, int minuto) { this(hora, minuto, 0); }

    public Reloj(int hora) { this(hora, 0, 0); }

    private void ajustar() {
        if (segundo >= 60) { minuto += segundo / 60; segundo %= 60; }
        if (minuto >= 60) { hora += minuto / 60; minuto %= 60; }
        if (hora >= 24) hora %= 24;
    }

    public void adelantarReloj(int cantidadDeSegundos) {
        segundo += cantidadDeSegundos;
        ajustar();
    }

    public void atrasarReloj(int cantidadDeSegundos) {
        segundo -= cantidadDeSegundos;
        ajustar();
    }

}
