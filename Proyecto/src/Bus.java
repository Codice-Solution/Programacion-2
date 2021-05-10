public class Bus extends Vehiculo {
    private int cantidad_pasajeros;


    public Bus(Conductor driver, Gps gps, String patente, int velocidad, String tipo, int masa, int altura) {
        super(driver, gps, patente, velocidad, tipo, masa, altura);

    }

    public Bus(){

    }

    public void Imprimir_datos(){
        super.imprimir();
    }

    public void velo(){
        super.imprimir_velocidad();

    }
}