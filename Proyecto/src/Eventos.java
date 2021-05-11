class Eventos {
    private int vel_max;

    public Eventos() {
    }


    public static int exceso(int vel_excedida) {
        int vel_max = 70;
        int a = 0;
        if (vel_excedida > vel_max) {
            a = 1;
        }else{
            a = 0;
        }
        return a;
    }
    }
