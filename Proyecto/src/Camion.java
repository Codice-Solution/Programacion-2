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

    public void imprimir_datos(){
        int a=gps.test();
        setVelocidad(a);
        super.imprimir();
    }

    public void velo(){

        super.imprimir_velocidad();
    }





}