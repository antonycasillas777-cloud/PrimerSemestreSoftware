package ejercicio10;
import java.util.Scanner;
public class SistemaAcademicoIntegrador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, cantidadEstudiantes = 0, i, posicion;
        double nota, suma, asistencia, promedio;
        boolean encontrado;
        String nombre, clasificacion, nombreBuscado;
        String nombreActual = "", clasificacionActual = "";
        double promedioActual = 0, asistenciaActual = 0;
        // Se usan variables individuales; no se utilizan arreglos ni colecciones.
        String nombre1 = "", nombre2 = "", nombre3 = "", nombre4 = "";
        String clase1 = "", clase2 = "", clase3 = "", clase4 = "";
        double promedio1 = 0, promedio2 = 0, promedio3 = 0, promedio4 = 0;
        double asistencia1 = 0, asistencia2 = 0, asistencia3 = 0, asistencia4 = 0;
        do {
            System.out.println("\n--- SISTEMA ACADÉMICO ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    if (cantidadEstudiantes >= 4) {
                        System.out.println("Ya se registraron los cuatro estudiantes permitidos.");
                    } else {
                        System.out.print("Nombre del estudiante: ");
                        nombre = entrada.nextLine();
                        while (nombre.trim().isEmpty()) {
                            System.out.print("El nombre no puede estar vacío. Ingrese nuevamente: ");
                            nombre = entrada.nextLine();
                        }
                        suma = 0;
                        for (i = 1; i <= 3; i++) {
                            do {
                                System.out.print("Calificación " + i + " (0 a 10): ");
                                nota = entrada.nextDouble();
                                if (nota < 0 || nota > 10)
                                    System.out.println("Calificación fuera de rango.");
                            } while (nota < 0 || nota > 10);
                            suma += nota;
                        }
                        do {
                            System.out.print("Asistencia (0 a 100): ");
                            asistencia = entrada.nextDouble();
                            if (asistencia < 0 || asistencia > 100)
                                System.out.println("Asistencia fuera de rango.");
                        } while (asistencia < 0 || asistencia > 100);
                        promedio = suma / 3;
                        if (promedio >= 9 && asistencia >= 90) clasificacion = "Excelente";
                        else if (promedio >= 7 && asistencia >= 70) clasificacion = "Aprobado";
                        else if (promedio >= 5 && asistencia >= 70) clasificacion = "Supletorio";
                        else clasificacion = "Reprobado";
                        cantidadEstudiantes++;
                        switch (cantidadEstudiantes) {
                            case 1:
                                nombre1 = nombre; promedio1 = promedio;
                                asistencia1 = asistencia; clase1 = clasificacion; break;
                            case 2:
                                nombre2 = nombre; promedio2 = promedio;
                                asistencia2 = asistencia; clase2 = clasificacion; break;
                            case 3:
                                nombre3 = nombre; promedio3 = promedio;
                                asistencia3 = asistencia; clase3 = clasificacion; break;
                            case 4:
                                nombre4 = nombre; promedio4 = promedio;
                                asistencia4 = asistencia; clase4 = clasificacion; break;
                        }
                        System.out.println("Estudiante registrado correctamente.");
                    }
                    break;
                case 2:
                    if (cantidadEstudiantes == 0) {
                        System.out.println("No existen estudiantes registrados.");
                    } else {
                        for (i = 1; i <= cantidadEstudiantes; i++) {
                            switch (i) {
                                case 1: nombreActual = nombre1; promedioActual = promedio1;
                                    asistenciaActual = asistencia1; clasificacionActual = clase1; break;
                                case 2: nombreActual = nombre2; promedioActual = promedio2;
                                    asistenciaActual = asistencia2; clasificacionActual = clase2; break;
                                case 3: nombreActual = nombre3; promedioActual = promedio3;
                                    asistenciaActual = asistencia3; clasificacionActual = clase3; break;
                                case 4: nombreActual = nombre4; promedioActual = promedio4;
                                    asistenciaActual = asistencia4; clasificacionActual = clase4; break;
                            }
                            System.out.printf("%s | Promedio: %.2f | Asistencia: %.2f%% | %s%n",
                                    nombreActual, promedioActual, asistenciaActual, clasificacionActual);
                        }
                    }
                    break;
                case 3:
                    if (cantidadEstudiantes == 0) {
                        System.out.println("No existen estudiantes registrados.");
                    } else {
                        System.out.print("Nombre que desea buscar: ");
                        nombreBuscado = entrada.nextLine();
                        posicion = 1;
                        encontrado = false;
                        while (posicion <= cantidadEstudiantes && !encontrado) {
                            switch (posicion) {
                                case 1: nombreActual = nombre1; promedioActual = promedio1;
                                    asistenciaActual = asistencia1; clasificacionActual = clase1; break;
                                case 2: nombreActual = nombre2; promedioActual = promedio2;
                                    asistenciaActual = asistencia2; clasificacionActual = clase2; break;
                                case 3: nombreActual = nombre3; promedioActual = promedio3;
                                    asistenciaActual = asistencia3; clasificacionActual = clase3; break;
                                case 4: nombreActual = nombre4; promedioActual = promedio4;
                                    asistenciaActual = asistencia4; clasificacionActual = clase4; break;
                            }
                            if (nombreActual.equalsIgnoreCase(nombreBuscado)) encontrado = true;
                            else posicion++;
                        }
                        if (encontrado) {
                            System.out.printf("Encontrado: %s | Promedio: %.2f | Asistencia: %.2f%% | %s%n",
                                    nombreActual, promedioActual, asistenciaActual, clasificacionActual);
                        } else {
                            System.out.println("Estudiante no encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        entrada.close();
    }
}
