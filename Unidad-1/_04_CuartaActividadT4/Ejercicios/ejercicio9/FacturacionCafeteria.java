package ejercicio9;
import java.util.Scanner;
public class FacturacionCafeteria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, cantidad;
        double precio = 0, subtotal = 0, descuento, total;
        String producto = "";
        do {
            System.out.println("\n--- CAFETERÍA ---");
            System.out.println("1. Café - $1.50");
            System.out.println("2. Sándwich - $2.50");
            System.out.println("3. Jugo - $1.75");
            System.out.println("4. Ensalada - $3.00");
            System.out.println("5. Finalizar");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    precio = 1.50;
                    producto = "Café";
                    break;
                case 2:
                    precio = 2.50;
                    producto = "Sándwich";
                    break;
                case 3:
                    precio = 1.75;
                    producto = "Jugo";
                    break;
                case 4:
                    precio = 3.00;
                    producto = "Ensalada";
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            if (opcion >= 1 && opcion <= 4) {
                do {
                    System.out.print("Cantidad de " + producto + ": ");
                    cantidad = entrada.nextInt();
                    if (cantidad <= 0) {
                        System.out.println("La cantidad debe ser positiva.");
                    }
                } while (cantidad <= 0);
                subtotal += precio * cantidad;
                System.out.printf("Subtotal acumulado: $%.2f%n", subtotal);
            }
        } while (opcion != 5);
        // El descuento se aplica una sola vez sobre el subtotal final.
        if (subtotal < 10) {
            descuento = 0;
        } else if (subtotal < 20) {
            descuento = subtotal * 0.05;
        } else if (subtotal < 50) {
            descuento = subtotal * 0.10;
        } else {
            descuento = subtotal * 0.15;
        }
        total = subtotal - descuento;
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", total);
        entrada.close();
    }
}

