import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        System.out.println();
        System.out.println("****************************************");
        System.out.println();
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: L" + saldoDisponible);
        System.out.println();
        System.out.println("****************************************");

        int opcion;
        do {
            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            System.out.println();

            opcion = datos.nextInt();

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
        } while (opcion != 9);

        datos.close();

    }
}
