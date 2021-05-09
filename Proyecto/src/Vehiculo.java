class Vehiculo { //Super Clase
    private String patente; //Identificador de cada vehiculo.
    private String tipo;
    private int masa; //Masa actual del vehiculo.
    private int altura; //altura del vehiculo.
    protected Conductor driver;


    public Vehiculo(Conductor driver, String patente, String tipo,int masa,int altura){
        this.driver = driver;
        this.patente = patente;
        this.tipo = tipo;
        this.masa = masa;
        this.altura = altura;

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
        System.out.println("Tipo: "+this.tipo+", patente: "+ this.getPatente() + ", Masa: " + this.getMasa() + ", Altura: " + getAltura());
    }


}