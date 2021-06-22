// Link repositorio Github https://github.com/Codice-Solution/Test.git

// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl

import java.sql.Array;
import java.util.Arrays;

public class Gps {//Super Clase
    private int id; // Identificador unico del GPS que se asociará a la patente
    private boolean senal; //prendido o apagado dependiendo del tiempo.
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

    public boolean isSenal() {
        return senal;
    }

    public void setSenal(boolean senal) {
        this.senal = senal;
    }


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public static int distancia(){ //funcion que calcula la distancia entro dos puntos, la cual determina la velocidad del vehiculo

        int distancia[];
        distancia = new int[4];
        distancia[0]= (int)(Math.random()*10+30); //punto en el eje cartesiano
        distancia[1]= (int)(Math.random()*31+50);//punto en el eje cartesiano
        distancia[2]= (int)(Math.random()*51+70);//punto en el eje cartesiano
        distancia[3]= (int)(Math.random()*71+100);//punto en el eje cartesiano

        int a = (int)Math.sqrt((int)Math.pow(distancia[1]-distancia[0], 2)+((int)Math.pow(distancia[3]-distancia[2],2)));//Calculo de la distancia segun los puntos cartesianos generados

        return a;
    }


}
