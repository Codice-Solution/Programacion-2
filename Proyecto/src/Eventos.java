// Link repositorio Github https://github.com/Codice-Solution/Test.git

// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl
//
class Eventos {
    private int vel_max;

    public Eventos() {
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

