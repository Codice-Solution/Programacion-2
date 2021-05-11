import java.util.Scanner;
// Link repositorio Github https://github.com/Codice-Solution/Test.git

public class Main{
    public static void main(String[] args) {
        boolean continua ; //Condicion del ciclo while

        Scanner scanner = new Scanner(System.in);

        //Inicializando Objetos _________________________________________________________________________

        int a = 1;
        int b = 1;

        Camion camion_1 = new Camion(new Conductor("1234", "Miguel Maturana", 25), new Gps(0, "Mazda"),"FWLS23" ,"Camion",2000, 3);

        Bus bus_1 = new Bus(new Conductor("1234234", "Jose Mancilla", 21), new Gps(1,"BMW"),"AFHJ23" ,"Bus",1500, 2);
        //________________________________________________________________________________________________


        do {
            System.out.println("Ingrese \n1 si quiere ver los datos de los Vehiculos disponibles\n2 si quiere ver los conductores disponibles\n3 Si quiere ver la velocidad de cada camion\n4 Si quiere cerrar el menu presione");
            try { //bloque de codigo por si el usurio se equivoca no genera error en la pantalla
                continua = false; //Si continua es falso se detiene el ciclo while
                int menu = scanner.nextInt(); //creando leyendo el objeto que lee la entrada por teclado.

                if (menu == 1) { // condicion if para generar el menu
                    camion_1.imprimir_datos(); //llamando a la funcion imprimir definida en camion.
                    bus_1.Imprimir_datos();
                    continua = true;
                }
                else if (menu == 2){
                    camion_1.driver.imprimir_driver();
                    bus_1.driver.imprimir_driver();
                    continua = true;
                }
                else if (menu == 3){
                    bus_1.velocidad();
                    camion_1.velocidad();
                    continua = true;

                }

                else if (menu == 4){
                    continua = false;
                }

                else { //si el ingresa un numero pero no el requerido entra a este bloque de codigo
                    System.out.println("Valor no valido"); //imprime una alerta
                    continua = true; // continua es verdadera para que el ciclo no se corte y pregunte nuevamente el numero
                }

            } catch (java.util.InputMismatchException e) { //bloque de codigo por si algo falla en try
                System.out.println("Valor no valido, intentelo de nuevo"); //imprime una alerta
                scanner.next();
                continua = true; //continua queda verdadero para que el que el ciclo no se corte

            }
        }while (continua); // verifica si continua en false

    }

}