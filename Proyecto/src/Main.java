import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        boolean continua ; //Condicion del ciclo while

        Scanner scanner = new Scanner(System.in);

        //Inicializando Objetos _________________________________________________________________________


        Camion camion_1 = new Camion(new Conductor("1234", "Miguel Maturana", 25), "FWLS23", "Camion",2000, 3);

        Bus bus_1 = new Bus(new Conductor("1234234", "Jose Mancilla", 21), "AFHJ23", "Bus",1500, 2);
        //________________________________________________________________________________________________


        do {
            System.out.println("Ingrese 1 si quiere ver los datos de los Vehiculos disponibles: ");
            try { //bloque de codigo por si el usurio se equivoca no genera error en la pantalla
                continua = false; //Si continua es falso se detiene el ciclo while
                int menu = scanner.nextInt(); //creando leyendo el objeto que lee la entrada por teclado.

                if (menu == 1) { // condicion if para generar el menu
                    camion_1.imprimir(); //llamando a la funcion imprimir definida en Vehiculo


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