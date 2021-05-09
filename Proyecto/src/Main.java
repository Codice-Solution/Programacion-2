import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        boolean continua ;

        Scanner scanner = new Scanner(System.in);

        //Inicializando Objetos _________________________________________________________________________
        Camion camion_1 = new Camion(new Conductor("1234", "Miguel Maturana", 25), "FWLS23", "Camion",2000, 3);
        Bus bus_1 = new Bus(new Conductor("1234234", "Jose Mancilla", 21), "AFHJ23", "Bus",1500, 2);
        //________________________________________________________________________________________________

        do {
            System.out.println("Ingrese 1 si quiere ver los datos de los Vehiculos disponibles: ");
            try {
                continua = false;
                int menu = scanner.nextInt();

                if (menu == 1) {
                    camion_1.imprimir();
                    // bus_1.imprimir();
                }
                else {
                    System.out.println("Valor no valido");
                    continua = true;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Valor no valido, intentelo de nuevo");
                scanner.next();
                continua = true;

            }
        }while (continua);


    }

}