package ejercicio3;

import java.util.Scanner;
 
public class cajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 500.0, monto;
        int opcion;
 
        do {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
 
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: $");
                    monto = sc.nextDouble();
                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Deposito realizado correctamente.");
                    } else {
                        System.out.println("Monto invalido. Debe ser positivo.");
                    }
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;
                case 3:
                    System.out.print("Monto a retirar: $");
                    monto = sc.nextDouble();
                    if (monto <= 0) {
                        System.out.println("Monto invalido. Debe ser positivo.");
                    } else if (monto > 500) {
                        System.out.println("El retiro no puede superar $500.");
                    } else if (monto > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= monto;
                        System.out.println("Retiro realizado correctamente.");
                    }
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;
                case 4:
                    System.out.printf("Saldo final: $%.2f%n", saldo);
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opcion invalida. Elija del 1 al 4.");
            }
        } while (opcion != 4);
        sc.close();
    }
}

