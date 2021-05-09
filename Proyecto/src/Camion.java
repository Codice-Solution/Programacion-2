public class Camion extends Vehiculo{
    private int capacidad_de_carga;
    private Gps gps;

    public Camion(Conductor driver, String patente, int masa, int altura){
        super(driver, patente, masa, altura);

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

    public void imprimir(){
        System.out.println("Tipo: Camion, "+"Nombre del conductor: " + driver.getNombre() + ", Rut: "+ driver.getRut() + ", Edad: " + driver.getEdad() +
                ", Patente del vehiculo: " + getPatente() + ", Masa: " + getMasa() + ", Altura: " + getAltura());
    }

}