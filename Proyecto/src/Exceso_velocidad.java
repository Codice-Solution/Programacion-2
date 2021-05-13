public class Exceso_velocidad extends Eventos{
    int vel_max;
    public Exceso_velocidad(){
    }

    public static boolean exceso(int vel_excedida) {
        int vel_max = 20;
        boolean condicion;
        if (vel_excedida > vel_max) {
            condicion = true;
        }else{
            condicion = false;
        }
        return condicion;
    }


}
