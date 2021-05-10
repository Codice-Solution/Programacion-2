class Bus extends Vehiculo {
    private int cantidad_pasajeros;


    public Bus(Conductor driver, Gps gps, String patente, int velocidad, String tipo, int masa, int altura) {
        super(driver, gps, patente, velocidad, tipo, masa, altura);


    }


    @Override
    public void imprimir() {
        int a = getVelocidad(); // instanciamos un entero y le asignamos el valor de la velocidad del bus
        a = gps.calculo_velocidad(a , 2); // llamamo al metodo ubicado en gps para que retorne la velocidad.
        setVelocidad(a); // Cambiamos la velocidad
        super.imprimir(); // imprimimos con el metodo ubicado en la clase padre
        //this.gps.setId(5678);


    }
}