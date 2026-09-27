package ejercicio5;

import java.util.Scanner;
 
public class cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, edad, cantidadEntradas = 0;
        double precio = 0, descuento, precioFinal, total = 0;
 
        do {
            System.out.println("\n--- VENTA DE ENTRADAS ---");
            System.out.println("1. 2D - $5.00");
            System.out.println("2. 3D - $7.50");
            System.out.println("3. IMAX - $10.00");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
 
            switch (opcion) {
                case 1: precio = 5.00; break;
                case 2: precio = 7.50; break;
                case 3: precio = 10.00; break;
                case 4: break;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }
 
            if (opcion != 4) {
                do {
                    System.out.print("Ingrese la edad del cliente (0 a 120): ");
                    edad = sc.nextInt();
                    if (edad < 0 || edad > 120)
                        System.out.println("Edad inválida.");
                } while (edad < 0 || edad > 120);
 
                if (edad < 12) descuento = precio * 0.30;
                else if (edad >= 65) descuento = precio * 0.25;
                else descuento = 0;
 
                precioFinal = precio - descuento;
                total += precioFinal;
                cantidadEntradas++;
                System.out.printf("Precio de la entrada: $%.2f%n", precioFinal);
                System.out.printf("Total acumulado: $%.2f%n", total);
            }
        } while (opcion != 4);
 
        System.out.println("Entradas compradas: " + cantidadEntradas);
        System.out.printf("Total final: $%.2f%n", total);
        sc.close();
    }
}
