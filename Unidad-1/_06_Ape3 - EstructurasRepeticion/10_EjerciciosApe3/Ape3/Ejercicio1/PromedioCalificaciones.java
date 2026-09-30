import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadEstudiantes;
        int aprobados = 0, reprobados = 0;
        double nota, suma = 0, promedio;
        double mayor = 0, menor = 10;

        do {
            System.out.print("Cantidad de estudiantes: ");
            cantidadEstudiantes = scanner.nextInt();
            if (cantidadEstudiantes <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (cantidadEstudiantes <= 0);

        for (int i = 0; i < cantidadEstudiantes; i++) {
            do {
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);

            suma = suma + nota;
            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        promedio = suma / cantidadEstudiantes;
        System.out.println("Promedio general: " + promedio);
        System.out.println("Calificacion mayor: " + mayor);
        System.out.println("Calificacion menor: " + menor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
