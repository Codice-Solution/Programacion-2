// Link repositorio Github https://github.com/Codice-Solution/Test.git

// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl

public class Conductor {
    private String rut;
    protected String nombre;
    private int edad;

    public Conductor(String rut, String nombre, int edad){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que imprime los datos del concuctor.
     *
     */

    public void imprimir_driver(){
        System.out.println("Nombre: "+ this.getNombre() + ", Rut: " + this.getRut() + ", Edad: " + this.getEdad());
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre+"\n"+
                "Rut: " + rut +"\n"+
                "Edad: " + edad + "\n";
    }
}