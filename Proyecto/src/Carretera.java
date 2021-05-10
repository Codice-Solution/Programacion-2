public class Carretera {
    private static int a; //Superclase

    private int masa_maxima; //Masa maxima que soporta la carretera.
    private int velocidad_maxima; //Velocidad maxima que permite la carretera.
    private boolean tunel; // si hay tunel o no hay tunel.
    private int altura_maxima; //altura maxima que permite la cerretara.
    private Gps gps;



    public static int distancia(){

        int x1 = (int)(Math.random()*10+30);
        int x2 = (int)(Math.random()*31+50);
        int y1 = (int)(Math.random()*51+70);
        int y2 = (int)(Math.random()*71+100);
        a = (int)Math.sqrt((int)Math.pow(x2-x1, 2)+((int)Math.pow(y2-y1,2)));

        return a;
    }
}
