class Eventos {
    private int vel_max;

    public Eventos() {
    }


    public static boolean exceso(int vel_excedida) {
        int vel_max = 70;
        boolean a;
        if (vel_excedida > vel_max) {
            a = true;
        }else{
            a = false;
        }
        return a;
    }
    }
