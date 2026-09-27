package ejercicio8;

import java.util.Scanner;
public class ProcesamientoEstadisticoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, numero;
        int positivos = 0, negativos = 0, ceros = 0;
        int pares = 0, impares = 0, multiplosTres = 0;
        long suma = 0;
        double promedio;
        do {
            System.out.print("¿Cuántos números se ingresarán? ");
            cantidad = entrada.nextInt();
            if (cantidad < 0) {
                System.out.println("La cantidad no puede ser negativa.");
            }
        } while (cantidad < 0);
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();
            // Se clasifica el signo del número.
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
            // El residuo permite saber si es par o impar.
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (numero % 3 == 0) {
                multiplosTres++;
            }
            suma += numero;
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Múltiplos de 3: " + multiplosTres);
        System.out.println("Suma total: " + suma);
        if (cantidad > 0) {
            promedio = (double) suma / cantidad;
            System.out.printf("Promedio: %.2f%n", promedio);
        } else {
            System.out.println("Promedio: no se calcula porque no hay datos.");
        }
        entrada.close();
    }
}

