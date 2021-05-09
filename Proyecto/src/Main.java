class Main{
    public static void main(String[] args) {
        System.out.println("Hola Criaturitas");
        System.out.println("Miguelito");

        Camion camion_1 = new Camion(new Conductor("1234", "Miguel Maturana", 25), "FWLS23", 2000, 3);
        camion_1.imprimir();

        Bus bus_1Bus = new Bus(new Conductor("1234", "Miguel Maturana", 25), "FWLS23", 2000, 3);



    }

}