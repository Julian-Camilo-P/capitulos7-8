
package OchoTres;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String[] args) {
        
        Persona cliente1 = new Persona("Juan Pérez", "12345678A");
        Persona cliente2 = new Persona("Ana García", "87654321B");

        
        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente1, 10001L, 500.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente2, 10002L, 200.0);

        
        cuentaCorriente.ingresar(300.0);
        cuentaCorriente.retirar(200.0);
        cuentaCorriente.retirar(600.0); 

        cuentaAhorro.ingresar(1000.0);
        cuentaAhorro.retirar(700.0);
        cuentaAhorro.retirar(900.0); 
    }
}
