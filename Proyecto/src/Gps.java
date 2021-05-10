
public class Gps {//Super Clase
    private int id; // Identificador unico del GPS que se asociará a la patente
    private boolean señal; //prendido o apagado dependiendo del tiempo.
    private String posicion; //Posición del vehiculo actualmente.
    private String marca; // Marcar del dispositivo.
    private Carretera test;
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

    public int calculo_velocidad(int a, int b){ //Metodo de ejemplo para calcular la velocidad
        a = a * b; //parametros que recibe el metodo, en el caso del proyecto dos distancias distintan.

        return a; // retorna el resultado

    }

  /*  public int test(){

        int a = test.distancia();
        return a;
    }*/
    public static int distancia(){

        int x1 = (int)(Math.random()*10+30);
        int x2 = (int)(Math.random()*31+50);
        int y1 = (int)(Math.random()*51+70);
        int y2 = (int)(Math.random()*71+100);
        int a = (int)Math.sqrt((int)Math.pow(x2-x1, 2)+((int)Math.pow(y2-y1,2)));

        return a;
    }

}
