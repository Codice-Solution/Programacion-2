// Link repositorio Github https://github.com/Codice-Solution/Test.git

// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl

public class Gps {//Super Clase
    private int id; // Identificador unico del GPS que se asociará a la patente
    private String posicion; //Posición del vehiculo actualmente.
    private String marca; // Marcar del dispositivo.
    private PerdidaSeñal a;


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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int distancia(){ //funcion que calcula la distancia entro dos puntos, la cual determina la velocidad del vehiculo

        int distancia[];
        distancia = new int[4];
        distancia[0]= (int)(Math.random()*10+30); //punto en el eje cartesiano
        distancia[1]= (int)(Math.random()*31+50); //punto en el eje cartesiano
        distancia[2]= (int)(Math.random()*51+70); //punto en el eje cartesiano
        distancia[3]= (int)(Math.random()*71+100);//punto en el eje cartesiano

        int a = (int)Math.sqrt((int)Math.pow(distancia[1]-distancia[0], 2)+((int)Math.pow(distancia[3]-distancia[2],2)));//Calculo de la distancia segun los puntos cartesianos generados
        boolean senal = this.a.perdidaSenal(); // llamamos al metodo de perdidaSeñal para verificar si tenemos suficiente sañal para funcionar
        if (senal == false){//si se retorna un false significa que no tenemos señal para funcionar.
            a = 0;          //Por lo que le asignamos 0 a la velocidad
        }

        return a;
    }


}
