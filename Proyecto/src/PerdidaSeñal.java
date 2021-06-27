public class PerdidaSeñal extends Eventos{
    public PerdidaSeñal() {
        super();
    }

    public static boolean perdidaSenal(){
        int numeroRandom;
        boolean condicion = true;
        numeroRandom = (int)(Math.random()*99); //Numero random de 0 a 99, con el que se simula la señal que le llega al gps.
        if (numeroRandom >=29){//si numeroRandom esta entre 29 y 99 al gps le llega suficiente señal para funcionar y se retorna un true.
            condicion = true;
        }else { // si es menor a 29 no le llega suficiente señal y se retorna un false.
            condicion = false;
        }


        return condicion;
    }
}

