public class Vehiculo { //Super Clase
    private String patente; //Identificador de cada vehiculo.
    private String tipo;
    private int masa; //Masa actual del vehiculo.
    private int altura; //altura del vehiculo.
    protected Conductor driver;
    protected Gps gps;
    private  int velocidad;


    public Vehiculo(Conductor driver, Gps gps,String patente, int velocidad,String tipo,int masa,int altura){
        this.driver = driver;
        this.gps = gps;
        this.patente = patente;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.masa = masa;
        this.altura = altura;

    }
    public Vehiculo(){

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }


    public int getMasa() {
        return masa;
    }


    public void setMasa(int masa) {
        this.masa = masa;
    }


    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    public Conductor getDriver() {
        return driver;
    }

    //public void imprimir(){
      //  System.out.println("Tipo: Camion, "+ "Patente del vehiculo: " + getPatente() + ", Masa: " + getMasa() + ", Altura: " + getAltura());
    //}
    public void imprimir(){
        System.out.println("Tipo: "+this.tipo+", patente: "+ this.getPatente() +", Masa: " + this.getMasa() + ", Altura: " + getAltura());

    }
     public void imprimir_velocidad(){
         System.out.println("Tipo: " + getTipo()+ ", Patente: "+ getPatente() + ", Velocidad: " + this.gps.test());
     }



}