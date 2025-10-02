public class Program {
    final static int OPCION_INGRESAR = 1, OPCION_RETIRAR = 2, OPCION_MOSTRAR = 3, OPCION_SALIR = 4;
    public static void main(String[] args) {

        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        playBanco(cuentaBancaria);
    }

    private static void playBanco(CuentaBancaria cuentaBancaria) {

        while(true){
            menu();
            int opcion = CheckValues.enteroCorrecto("Seleccione una opción del menú: ",1,4);
            double ingreso = 0;
            double saldo = cuentaBancaria.saldo;
            if ( opcion == OPCION_INGRESAR) {
                ingreso = CheckValues.doubleCorrecto("Indica la cantidad a ingresar: ", 0, Double.MAX_VALUE);
                saldo = cuentaBancaria.ingresarSaldo(ingreso);
                System.out.println("Ingreso realizado correctamente");
            }

            if (opcion == OPCION_RETIRAR) {
                ingreso = CheckValues.doubleCorrecto("Indica la cantidad a retirar: ", 0, Double.MAX_VALUE);
                saldo = cuentaBancaria.retirarDinero(ingreso);
                System.out.println("Se ha retirado el dinero correctamente");
                if(saldo == -1){
//                    saldo = cuentaBancaria.ingresarSaldo(ingreso);
                    System.err.println("Saldo insuficiente");
                }
            }

            if (opcion == OPCION_MOSTRAR) {
                saldo = cuentaBancaria.getSaldo();
            }
            if (opcion == OPCION_SALIR){
                System.out.println("Gracias por operar con nosotros, !!! Adios !!!");
                break;

            }
            System.out.println("Su saldo actual es " + saldo);
//            playBanco(cuentaBancaria);
        }
    }

    private static void menu() {
        System.out.println("\tOpciones del Programa\n\n" +
                            "1.- Ingresar dinero.\n" +
                            "2.- Retirar dinero.\n" +
                            "3.- Mostrar saldo.\n" +
                            "4.- Salir del programa.\n");
    }
}
