public class Conductor {
    private String rut;
    private String nombre;
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

    public void imprimir_driver(){
        System.out.println("Nombre: "+ this.getNombre() + ", Rut: " + this.getRut() + ", Edad: " + this.getEdad());
    }

}