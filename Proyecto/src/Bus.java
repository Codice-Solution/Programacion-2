class Bus extends Vehiculo {
    private int cantidad_pasajeros;
    private Gps gps;

    public Bus(Conductor driver, String patente, String tipo,int masa, int altura) {
        super(driver, patente, tipo,masa, altura);


    }

    //public void imprimir() {
      //  System.out.println("Tipo: Bus, "+"Nombre del conductor: " + driver.getNombre() + ", Rut: " + driver.getRut() + ", Edad: " + driver.getEdad() +
        //        ", Patente del vehiculo: " + getPatente() + ", Masa: " + getMasa() + ", Altura: " + getAltura());


   // }

}