class Perdida_senal extends Eventos {

    private boolean conexion;

    public void imprimir_advertencia() {

        if (conexion == true) {
            System.out.println("conexion estable"); }

        else {
            System.out.println("la senal de ha perdido"); }
    }
}