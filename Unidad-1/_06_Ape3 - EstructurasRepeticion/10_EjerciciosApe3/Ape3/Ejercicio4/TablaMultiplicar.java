import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, i, resultado;

        System.out.println("Ingrese un numero entero entre 1 y 12:");
        numero = scanner.nextInt();

        // Repetimos la lectura si el numero esta fuera del rango.
        while (numero < 1 || numero > 12) {
            System.out.println("Numero invalido. Ingrese un numero entre 1 y 12:");
            numero = scanner.nextInt();
        }

        System.out.println("Tabla de multiplicar del " + numero);
        for (i = 1; i <= 12; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
