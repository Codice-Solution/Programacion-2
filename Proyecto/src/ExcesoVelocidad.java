public class ExcesoVelocidad extends Eventos {
public ExcesoVelocidad(){
    super();

}

    public static boolean excesoVelocidad(int velocidad) {//Metodo para verificar si hay exceso de velocidad.
        int vel_max = 50;// Velocidad maxima declarada por los programades.
        boolean condicion;// condicion booleana.
        if (velocidad > vel_max) { //si el parametro que recibe la funcion es mayor a la velocidad declarada por los programadores
            condicion = true;      //La condicion es true lo que significa que hubo un exceso de velocidad.
        }else{
            condicion = false;
        }
        return condicion;
    }
}
