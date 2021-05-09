class Bus extends Vehiculo {
    private int cantidad_pasajeros;
    private Gps gps;

    public Bus(Conductor driver, String patente, String tipo,int masa, int altura) {
        super(driver, patente, tipo,masa, altura);


    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}