package cineCampus;

import java.util.Scanner;

public class CineCampus {
    public static void main(String[] args) {
        double PRECIO_2D = 5.00;
        double PRECIO_3D = 7.50;
        double PRECIO_IMAX = 10.00;
        double DESCUENTO_NINO = 0.30;
        double DESCUENTO_ADULTO_MAYOR = 0.25;
        Scanner sc = new Scanner(System.in);
        int opcion;
        int cantidadEntradas = 0;
        double total = 0.0;
        double precio;
        String formato;
        int edad;
        int cantidad;
        double descuento;
        double precioFinal;
        int numeroEntrada;

        do {
            System.out.println("\n--- CINECAMPUS ---");
            System.out.println("1. Pelicula 2D - $5.00");
            System.out.println("2. Pelicula 3D - $7.50");
            System.out.println("3. Pelicula IMAX - $10.00");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un numero del menu.");
                sc.next();
                System.out.print("Seleccione una opcion: ");
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    precio = PRECIO_2D;
                    formato = "2D";
                    break;
                case 2:
                    precio = PRECIO_3D;
                    formato = "3D";
                    break;
                case 3:
                    precio = PRECIO_IMAX;
                    formato = "IMAX";
                    break;
                case 4:
                    continue;
                default:
                    System.out.println("Opcion invalida.");
                    continue;
            }

            do {
                System.out.print("Ingrese la edad del cliente (0 a 120): ");
                while (!sc.hasNextInt()) {
                    System.out.println("La edad debe ser un numero entero.");
                    sc.next();
                    System.out.print("Ingrese la edad del cliente (0 a 120): ");
                }
                edad = sc.nextInt();
                if (edad < 0 || edad > 120) {
                    System.out.println("Edad invalida.");
                }
            } while (edad < 0 || edad > 120);

            do {
                System.out.print("Ingrese la cantidad de entradas (1 a 10): ");
                while (!sc.hasNextInt()) {
                    System.out.println("La cantidad debe ser un numero entero.");
                    sc.next();
                    System.out.print("Ingrese la cantidad de entradas (1 a 10): ");
                }
                cantidad = sc.nextInt();
                if (cantidad < 1 || cantidad > 10) {
                    System.out.println("Cantidad invalida.");
                }
            } while (cantidad < 1 || cantidad > 10);

            if (edad < 12) {
                descuento = precio * DESCUENTO_NINO;
            } else if (edad >= 65) {
                descuento = precio * DESCUENTO_ADULTO_MAYOR;
            } else {
                descuento = 0.0;
            }

            precioFinal = precio - descuento;
            for (numeroEntrada = 1; numeroEntrada <= cantidad; numeroEntrada++) {
                cantidadEntradas++;
                total += precioFinal;
                System.out.printf("Entrada #%d: %s | Precio final: $%.2f%n",
                        cantidadEntradas, formato, precioFinal);
            }
            System.out.printf("Total acumulado: $%.2f%n", total);
        } while (opcion != 4);

        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.println("Entradas compradas: " + cantidadEntradas);
        System.out.printf("Total final: $%.2f%n", total);
        System.out.println("Gracias por visitar CineCampus.");
        
    }
}

/*
Prueba ejecutada:


Resultado obtenido:
Entrada #1: 2D | Precio final: $3.50
Entrada #2: 2D | Precio final: $3.50
Entrada #3: IMAX | Precio final: $7.50
Entradas compradas: 3
Total final: $14.50
*/
