// Link repositorio Github https://github.com/Codice-Solution/Programacion-2/tree/Entrega_1/Proyecto
// Codificado en Intellij Idea
// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl

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
