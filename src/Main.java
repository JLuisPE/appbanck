import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        //muestra los datos del cliente en pantalla
        System.out.println("****************************************");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: L" + saldoDisponible);
        System.out.println("****************************************");
        System.out.println();

        String menu = """
            ** Escriba el número de la opción deseada **
            1 - Consultar Saldo
            2 - Retirar
            3 - Depositar
            9 - Salir""";

        int opcion;
        Scanner datos = new Scanner(System.in);

        do {
            //muestra el menú en pantalla
            System.out.println(menu);
            System.out.println();
            opcion = datos.nextInt();
            //inicia el proceso de validación y ejecución según la opción elegida por el cliente
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es de: L" + saldoDisponible);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double cantidadRetirada = datos.nextDouble();
                    if (cantidadRetirada <= saldoDisponible) {
                        saldoDisponible -= cantidadRetirada;
                        System.out.println("Retiro exitoso. Su nuevo saldo es de: L" + saldoDisponible);
                        System.out.println();
                    } else {
                        System.out.println("Fondos insuficientes para realizar el retiro.");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double cantidadDepositada = datos.nextDouble();
                    saldoDisponible += cantidadDepositada;
                    System.out.println("Depósito exitoso. Su nuevo saldo es de: L" + saldoDisponible);
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        //Salir
        } while (opcion != 9);

        datos.close();

    }
}
