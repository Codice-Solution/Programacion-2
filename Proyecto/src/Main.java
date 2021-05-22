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

        do {
            System.out.println("\nIngrese: \n[1] si quiere ver los datos de los Vehiculos disponibles.\n[2] si quiere ver los conductores disponibles.\n[3] Si quiere ver la velocidad de cada camion.\n[4] Si quiere cerrar el menu.");
            try { //bloque de codigo por si el usurio se equivoca no genera error en la pantalla
                continua = false; //Si continua es falso se detiene el ciclo while
                int menu = scanner.nextInt(); //creando leyendo el objeto que lee la entrada por teclado.
                switch (menu){
                    case 1:
                        camion_1.imprimir_datos(); //llamando a la funcion imprimir definida en camion.
                        bus_1.Imprimir_datos();
                        continua = true;
                        break;
                    case 2:
                        camion_1.driver.imprimir_driver();
                        bus_1.driver.imprimir_driver();
                        continua = true;
                        break;
                    case 3:
                        bus_1.velocidad();
                        camion_1.velocidad();
                        continua = true;
                        break;
                    case 4:
                        continua = false;
                        break;
                    default: // funcion por si el usuario ingresa una opcion incorrecta, se imprime que no es valido y continua el ciclo
                        System.out.println("Valor no valido");
                        continua = true;
                }

            } catch (java.util.InputMismatchException e) { //bloque de codigo por si algo falla en try
                System.out.println("Valor no valido, intentelo de nuevo"); //imprime una alerta
                scanner.next();
                continua = true; //continua queda verdadero para que el que el ciclo no se corte

            }
        }while (continua); // verifica si continua en false

    }

}