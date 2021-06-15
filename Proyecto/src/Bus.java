// Link repositorio Github https://github.com/Codice-Solution/Test.git

// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl
/**
 * Clase extendida de vehiculo
 * @see Vehiculo
 * @author Codice Solution.
 */
public class Bus extends Vehiculo {
    private int cantidad_pasajeros;

    public Bus(Conductor driver, Gps gps, String patente, String tipo, int masa, int altura) {//Constructor de la clase padre vehiculo
        super(driver, gps, patente,tipo, masa, altura);

    }

    /**
     * Metodo que imprime los datos del Vehiculo desde el metodo ubicado en la clase padre {@link Vehiculo#imprimir()}
     * @see Vehiculo#imprimir()
     */

    public void Imprimir_datos(){ // funcion que llama a la funcion de la clase padre para imprimir los datos del bus

        super.imprimir();
    }

    /**
     * Metodo que imprime la velocidad del Vehiculo desde el metodo ubicado en la clase padre {@linkplain Vehiculo#imprimir_velocidad()}
     */
    public void velocidad() throws InterruptedException { // funcion que determina la velocidad del bus.
        int a = this.gps.distancia(); //a es una variable a la cual se le asigna un valor random obtenido de la funcion ubicada en la clase gps
        setVelocidad(a); // cambiamos el valor de velocidad.
        super.imprimir_velocidad(); // funcion ubicada en la clase padre que imprime la velocidad actual del bus
    }
}