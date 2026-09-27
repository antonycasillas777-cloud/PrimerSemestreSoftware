package ejercicio2;
import java.util.Scanner;
 
public class tablaMultiplicar {
    public static void main(String[] args) {
        int numero;
        int opcion;
        int i;
        boolean numeroValido;
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("TABLA DE MULTIPLICAR SELECCIONADA");
 
        // Se valida el numero antes de mostrar el menu
        do {
            System.out.print("Ingrese un numero entre 1 y 12: ");
            String entradaNumero = scanner.nextLine();
 
            try {
                numero = Integer.parseInt(entradaNumero);
                numeroValido = numero >= 1 && numero <= 12;
 
                if (numeroValido) {
                    System.out.println("Numero valido.");
                } else {
                    System.out.println("Numero invalido. Debe estar entre 1 y 12.");
                }
            } catch (NumberFormatException e) {
                numero = 0;
                numeroValido = false;
                System.out.println("Entrada invalida. Ingrese un numero entero.");
            }
        } while (!numeroValido);
 
        // El menu se ejecuta al menos una vez y se repite hasta elegir Salir
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Tabla ascendente");
            System.out.println("2. Tabla descendente");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
 
            String entradaOpcion = scanner.nextLine();
            try {
                opcion = Integer.parseInt(entradaOpcion);
            } catch (NumberFormatException e) {
                opcion = 0;
            }
 
            switch (opcion) {
                case 1:
                    System.out.println("\nTABLA ASCENDENTE DEL " + numero);
                    for (i = 1; i <= 12; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;
 
                case 2:
                    System.out.println("\nTABLA DESCENDENTE DEL " + numero);
                    for (i = 12; i >= 1; i--) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;
 
                case 3:
                    System.out.println("Gracias por usar el programa. Hasta pronto.");
                    break;
 
                default:
                    System.out.println("Opcion invalida. Elija 1, 2 o 3.");
                    break;
            }
        } while (opcion != 3);
 
        scanner.close();
    }
}

