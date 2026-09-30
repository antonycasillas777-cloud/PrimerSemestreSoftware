import java.util.Scanner;

public class ControlAsistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estudiantes, dias, i, j;
        int totalAsistencias = 0, totalAusencias = 0;
        String marca;

        System.out.println("Numero de estudiantes:");
        estudiantes = scanner.nextInt();
        while (estudiantes <= 0) {
            System.out.println("Ingrese una cantidad mayor que cero:");
            estudiantes = scanner.nextInt();
        }
        System.out.println("Numero de dias:");
        dias = scanner.nextInt();
        while (dias <= 0) {
            System.out.println("Ingrese una cantidad mayor que cero:");
            dias = scanner.nextInt();
        }

        int[] asistencias = new int[estudiantes];
        int[] ausencias = new int[estudiantes];
        for (i = 0; i < estudiantes; i++) {
            asistencias[i] = 0;
            ausencias[i] = 0;
            for (j = 0; j < dias; j++) {
                System.out.println("Estudiante " + (i + 1) + ", dia " + (j + 1));
                System.out.println("Ingrese P (presente) o A (ausente):");
                marca = scanner.next();
                while (marca.equals("P") == false && marca.equals("A") == false) {
                    System.out.println("Marca invalida. Ingrese P o A:");
                    marca = scanner.next();
                }
                if (marca.equals("P")) {
                    asistencias[i]++;
                    totalAsistencias++;
                } else {
                    ausencias[i]++;
                    totalAusencias++;
                }
            }
        }

        // Mostramos los resultados cuando termina todo el registro.
        for (i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.println("Asistencias: " + asistencias[i]);
            System.out.println("Ausencias: " + ausencias[i]);
        }
        System.out.println("Total de asistencias: " + totalAsistencias);
        System.out.println("Total de ausencias: " + totalAusencias);
        scanner.close();
    }
}
