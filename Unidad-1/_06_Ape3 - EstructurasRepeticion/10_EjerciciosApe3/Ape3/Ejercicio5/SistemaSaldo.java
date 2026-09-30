import java.util.Scanner;

public class SistemaSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo, monto;
        int opcion, transacciones = 0;

        do {
            System.out.println("Ingrese el saldo inicial (0 o mayor):");
            saldo = scanner.nextDouble();
            if (saldo < 0) {
                System.out.println("El saldo no puede ser negativo.");
            }
        } while (saldo < 0);

        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver numero de transacciones");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar:");
                    monto = scanner.nextDouble();
                    if (monto <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                    } else {
                        saldo = saldo + monto;
                        transacciones++;
                        System.out.println("Deposito realizado. Saldo: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar:");
                    monto = scanner.nextDouble();
                    if (monto <= 0) {
                        System.out.println("El monto debe ser mayor que cero.");
                    } else if (monto > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - monto;
                        transacciones++;
                        System.out.println("Retiro realizado. Saldo: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Transacciones: " + transacciones);
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}
