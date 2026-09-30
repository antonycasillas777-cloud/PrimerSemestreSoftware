import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double numero1 = 0, numero2 = 0, resultado;

        do {
            System.out.println("\nMENU DE OPERACIONES");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer numero: ");
                numero1 = scanner.nextDouble();
                System.out.print("Segundo numero: ");
                numero2 = scanner.nextDouble();
            }

            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    // Comprobamos el divisor antes de dividir.
                    if (numero2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida. Elija de 1 a 5.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}
