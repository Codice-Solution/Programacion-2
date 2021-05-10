class Gps {//Super Clase
    private int id; // Identificador unico del GPS que se asociará a la patente
    private boolean señal; //prendido o apagado dependiendo del tiempo.
    private String posicion; //Posición del vehiculo actualmente.
    private String marca; // Marcar del dispositivo.


    public Gps(int id, String marca){
        this.id = id;
        this.marca= marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSeñal() {
        return señal;
    }

    public void setSeñal(boolean señal) {
        this.señal = señal;
    }


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void gos(){

    }
}
