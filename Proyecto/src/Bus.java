class Bus extends Vehiculo {
    private int cantidad_pasajeros;


    public Bus(Conductor driver, Gps gps,String patente, int velocidad ,String tipo,int masa, int altura) {
        super(driver, gps,patente, velocidad,tipo,masa, altura);


    }

    @Override
    public void setVelocidad(int velocidad) {
        super.setVelocidad(velocidad);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        this.gps.setId(5678);


    }
}