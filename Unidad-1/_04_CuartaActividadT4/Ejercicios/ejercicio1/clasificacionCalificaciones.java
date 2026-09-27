package ejercicio1;
import java.util.Scanner;
 
public class clasificacionCalificaciones {
    public static void main(String[] args) {
        // Variables de entrada y control
        double nota;
        int i;
        boolean notaValida;
 
        // Acumulador y contadores separados
        double sumaNotas = 0.0;
        double promedio;
        int cantidadAprobados = 0;
        int cantidadReprobados = 0;
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("CLASIFICACION DE CALIFICACIONES");
 
        // El ciclo se repite hasta procesar cinco notas validas
        for (i = 1; i <= 5; i++) {
            do {
                System.out.print("Ingrese la calificacion " + i + " (0 a 10): ");
                String entrada = scanner.nextLine();
 
                try {
                    nota = Double.parseDouble(entrada);
                    notaValida = nota >= 0 && nota <= 10;
 
                    if (!notaValida) {
                        System.out.println("Calificacion invalida. Debe estar entre 0 y 10.");
                    }
                } catch (NumberFormatException e) {
                    nota = 0;
                    notaValida = false;
                    System.out.println("Entrada invalida. Ingrese un valor numerico.");
                }
            } while (!notaValida);
 
            // La nota se procesa solo despues de ser validada
            sumaNotas = sumaNotas + nota;
 
            if (nota >= 9) {
                System.out.println("Clasificacion: Excelente");
            } else if (nota >= 7) {
                System.out.println("Clasificacion: Aprobado");
            } else if (nota >= 5) {
                System.out.println("Clasificacion: Supletorio");
            } else {
                System.out.println("Clasificacion: Reprobado");
            }
 
            // Para el resumen, se considera aprobada una nota desde 7
            if (nota >= 7) {
                cantidadAprobados++;
            } else {
                cantidadReprobados++;
            }
        }
 
        promedio = sumaNotas / 5;
 
        System.out.println("\n========== RESULTADOS ==========");
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Cantidad de aprobados: " + cantidadAprobados);
        System.out.println("Cantidad de reprobados: " + cantidadReprobados);
        System.out.println("================================");
 
        scanner.close();
    }
}
