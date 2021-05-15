// Link repositorio Github https://github.com/Codice-Solution/Programacion-2/tree/Entrega_1/Proyecto
// Codificado en Intellij Idea
// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl

class Perdida_senal extends Eventos {

    private boolean conexion;

    public void imprimir_advertencia() {

        if (conexion == true) {
            System.out.println("conexion estable"); }

        else {
            System.out.println("la senal de ha perdido"); }
    }
}
