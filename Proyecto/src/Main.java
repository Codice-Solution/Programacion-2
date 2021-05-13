// Link repositorio Github https://github.com/Codice-Solution/Test.git

// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.uv.cl

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        boolean continua ; //Condicion del ciclo while

        Scanner scanner = new Scanner(System.in);

        //Inicializando Objetos _________________________________________________________________________

        Camion camion_1 = new Camion(new Conductor("18.999.258-0", "Miguel Maturana", 25), new Gps(0, "Mazda"),"FWLS23" ,"Camion",2000, 3);

        Bus bus_1 = new Bus(new Conductor("20.476.565-0", "Jose Mancilla", 21), new Gps(1,"BMW"),"AFHJ23" ,"Bus",1500, 2);
        //________________________________________________________________________________________________


    }

}