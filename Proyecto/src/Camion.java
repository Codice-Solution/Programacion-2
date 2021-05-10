public class Camion extends Vehiculo{
    private int capacidad_de_carga;



    public Camion(Conductor driver, Gps gps,String patente, int velocidad,String tipo,int masa, int altura){
        super(driver, gps ,patente, velocidad,tipo ,masa, altura);

    }


    public int getCapacidad_de_carga() {
        return capacidad_de_carga;
    }

    public void setCapacidad_de_carga(int capacidad_de_carga) {
        this.capacidad_de_carga = capacidad_de_carga;
    }

    public Gps getGps() {
        return gps;
    }

    public void setGps(Gps gps) {
        this.gps = gps;
    }

    //public void imprimir(){
      //  System.out.println("patente: "+ this.getPatente() + "Masa: " + this.getMasa() + "Altura: " + getAltura());
    //}



    @Override
    public void imprimir() {

        int a = getVelocidad(); // declaramos una variable obtenemos la velociad del camion
         a= gps.calculo_velocidad(getVelocidad() , 2); // llamamos a la funcion con los parametros que requiere en este caso dos int.
        this.setVelocidad(a); // cambiamos la velocidad por la que retorno el metodo anterior
        super.imprimir(); // funcion imprimir declarada en la superclase Vehiculo.


    }

}