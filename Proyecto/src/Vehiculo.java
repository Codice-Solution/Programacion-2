import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Esta clase es la superclase para definir varios tipos de Vehiculos
 * @author Codice Solution
 */
public abstract class Vehiculo { //Super Clase
    /**
     * Patente de cada vehiculo
     */
    private String patente; //Identificador de cada vehiculo.
    /**
     * Tipo de vehiculo
     */
    private String tipo;
    /**
     * masa del Vehiculo
     */
    private int masa; //Masa actual del vehiculo.
    private int altura; //altura del vehiculo.
    protected Conductor driver;
    protected Gps gps;
    private int velocidad;
    private Eventos maximo;
    private Bus bus;


    public Vehiculo(Conductor driver, Gps gps,String patente, String tipo,int masa,int altura){
        this.driver = driver;
        this.gps = gps;
        this.patente = patente;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.masa = masa;
        this.altura = altura;

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

    /**
     * Este metodo imprime los datos del vehiculo.
     */
    public void imprimir(){ //Funcion que imprime los datos de las clases hijas obteniendo sus valores.
        System.out.println("Tipo: "+this.tipo+", patente: "+ this.getPatente() +", Masa: " + this.getMasa() + ", Altura: " + getAltura());

    }

    /**
     * Metodo que imprime la velocidad del vehiculo
     */
     public void imprimir_velocidad() throws InterruptedException { //funcion que imprime la velocidad de las clases hijas con la velocidad acual.
         System.out.println("Tipo: " + getTipo()+ ", Patente: "+ getPatente()+", Velocidad: "+this.getVelocidad()+"  Km/h");
         Thread.sleep(1000);

         boolean b = this.maximo.exceso(this.getVelocidad()); //llamamos a la funcion exeso ubicada en la Clase Eventos la cual determina si hubo exceso de velocidad
         if (b==true){//condicion if que imprime SPEED_MAX_EXCEEDED si es que la funcion exceso retorna un 1 lo que significa que hubo exceso de velocidad
             System.out.println("SPEED_MAX_EXCEEDED");
             try(FileWriter fw = new FileWriter("reporte.txt");
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw))

             {
               out.println("El Conductor: "+getDriver().getNombre()+ " En el vehiculo: " + getTipo() + " Patente: " + getPatente() +
                       " tuvo un exceso de velocidad "+ "La velocidad fue: " + getVelocidad() +"\n");

             } catch (IOException e) {

             }
         }





     }

}