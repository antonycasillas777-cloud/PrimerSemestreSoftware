import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, cantidad, ventas = 0, unidades = 0;
        String producto;
        double precio, subtotal, total = 0, ventaMayor = 0, promedio;

        do {
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Producto (una palabra):");
                    producto = scanner.next();
                    System.out.println("Cantidad:");
                    cantidad = scanner.nextInt();
                    while (cantidad <= 0) {
                        System.out.println("Ingrese una cantidad mayor que cero:");
                        cantidad = scanner.nextInt();
                    }
                    System.out.println("Precio por unidad:");
                    precio = scanner.nextDouble();
                    while (precio <= 0) {
                        System.out.println("Ingrese un precio mayor que cero:");
                        precio = scanner.nextDouble();
                    }

                    subtotal = cantidad * precio;
                    ventas++;
                    unidades = unidades + cantidad;
                    total = total + subtotal;
                    if (subtotal > ventaMayor) {
                        ventaMayor = subtotal;
                    }
                    System.out.println("Venta registrada: " + producto);
                    System.out.println("Subtotal: " + subtotal);
                    break;
                case 2:
                    // Evitamos dividir entre cero cuando no hay ventas.
                    promedio = 0;
                    if (ventas > 0) {
                        promedio = total / ventas;
                    } else {
                        System.out.println("No hay ventas registradas.");
                    }
                    System.out.println("Numero de ventas: " + ventas);
                    System.out.println("Unidades vendidas: " + unidades);
                    System.out.println("Total recaudado: " + total);
                    System.out.println("Venta mayor: " + ventaMayor);
                    System.out.println("Promedio por venta: " + promedio);
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida. Elija de 1 a 3.");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }
}
