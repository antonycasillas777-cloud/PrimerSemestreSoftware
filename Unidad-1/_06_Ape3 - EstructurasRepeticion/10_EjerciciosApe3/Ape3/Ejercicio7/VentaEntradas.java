import java.util.Scanner;

public class VentaEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoEntrada;
        int cantidad, continuar, ventas = 0;
        double precio, subtotal, total = 0;

        do {
            System.out.println("Tipo de entrada (una palabra):");
            tipoEntrada = scanner.next();

            do {
                System.out.println("Cantidad de entradas:");
                cantidad = scanner.nextInt();
                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor que cero.");
                }
            } while (cantidad <= 0);

            do {
                System.out.println("Precio por entrada:");
                precio = scanner.nextDouble();
                if (precio < 0) {
                    System.out.println("El precio no puede ser negativo.");
                }
            } while (precio < 0);

            // Acumulamos una venta con datos validos.
            subtotal = cantidad * precio;
            total = total + subtotal;
            ventas++;
            System.out.println("Tipo: " + tipoEntrada);
            System.out.println("Subtotal de la venta: " + subtotal);
            System.out.println("Total acumulado: " + total);

            do {
                System.out.println("Otra venta? 1. Si  2. No");
                continuar = scanner.nextInt();
                if (continuar != 1 && continuar != 2) {
                    System.out.println("Opcion invalida. Elija 1 o 2.");
                }
            } while (continuar != 1 && continuar != 2);
        } while (continuar == 1);

        System.out.println("Ventas registradas: " + ventas);
        System.out.println("Total final: " + total);
        scanner.close();
    }
}
