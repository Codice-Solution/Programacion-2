public class ExcesoVelocidad extends Eventos {
public ExcesoVelocidad(){

}

    public static boolean excesoVelocidad(int velocidad) {
        int vel_max = 50;
        boolean condicion;
        if (velocidad > vel_max) {
            condicion = true;
        }else{
            condicion = false;
        }
        return condicion;
    }
}
