
public class Gps {//Super Clase
    private int id; // Identificador unico del GPS que se asociará a la patente
    private boolean señal; //prendido o apagado dependiendo del tiempo.
    private String posicion; //Posición del vehiculo actualmente.
    private String marca; // Marcar del dispositivo.
    private Bus bus;


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

    public static int distancia(){ //funcion que calcula la distancia entro dos puntos, la cual determina la velocidad del vehiculo

        int x1 = (int)(Math.random()*10+30); //punto en el eje cartesiano
        int x2 = (int)(Math.random()*31+50);//punto en el eje cartesiano
        int y1 = (int)(Math.random()*51+70);//punto en el eje cartesiano
        int y2 = (int)(Math.random()*71+100);//punto en el eje cartesiano
        int a = (int)Math.sqrt((int)Math.pow(x2-x1, 2)+((int)Math.pow(y2-y1,2)));

        return a;
    }


}
