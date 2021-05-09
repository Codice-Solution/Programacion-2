class Vehiculo { //Super Clase
    private String patente; //Identificador de cada vehiculo.
    private int masa; //Masa actual del vehiculo.
    private int altura; //altura del vehiculo.
    protected Conductor driver;


    public Vehiculo(Conductor driver, String patente, int masa,int altura){
        this.driver = driver;
        this.patente = patente;
        this.masa = masa;
        this.altura = altura;

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


}