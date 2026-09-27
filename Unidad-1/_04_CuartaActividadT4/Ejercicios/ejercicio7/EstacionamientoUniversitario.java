package ejercicio7;

import java.util.Scanner;
public class EstacionamientoUniversitario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, tipoVehiculo, rol, horas, boletoPerdido;
        int vehiculosRegistrados = 0;
        double tarifaHora = 0, subtotal, descuento, recargo, total, recaudacion = 0;
        String nombreVehiculo = "";
        do {
            System.out.println("\n--- ESTACIONAMIENTO UNIVERSITARIO ---");
            System.out.println("1. Calcular tarifa");
            System.out.println("2. Ver tarifas");
            System.out.println("3. Mostrar recaudación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.print("Tipo (1 Motocicleta, 2 Automóvil, 3 Camioneta): ");
                        tipoVehiculo = entrada.nextInt();
                        if (tipoVehiculo < 1 || tipoVehiculo > 3)
                            System.out.println("Tipo de vehículo inválido.");
                    } while (tipoVehiculo < 1 || tipoVehiculo > 3);
                    switch (tipoVehiculo) {
                        case 1: tarifaHora = 0.50; nombreVehiculo = "Motocicleta"; break;
                        case 2: tarifaHora = 1.00; nombreVehiculo = "Automóvil"; break;
                        default: tarifaHora = 1.50; nombreVehiculo = "Camioneta";
                    }
                    do {
                        System.out.print("Rol (1 Estudiante, 2 Docente, 3 Otro): ");
                        rol = entrada.nextInt();
                        if (rol < 1 || rol > 3) System.out.println("Rol inválido.");
                    } while (rol < 1 || rol > 3);
                    do {
                        System.out.print("Horas de estacionamiento (1 a 24): ");
                        horas = entrada.nextInt();
                        if (horas < 1 || horas > 24) System.out.println("Horas inválidas.");
                    } while (horas < 1 || horas > 24);
                    do {
                        System.out.print("¿Perdió el boleto? (1 Sí, 0 No): ");
                        boletoPerdido = entrada.nextInt();
                        if (boletoPerdido != 0 && boletoPerdido != 1)
                            System.out.println("Respuesta inválida.");
                    } while (boletoPerdido != 0 && boletoPerdido != 1);
                    subtotal = tarifaHora * horas;
                    if (rol == 1) descuento = subtotal * 0.20;
                    else if (rol == 2) descuento = subtotal * 0.10;
                    else descuento = 0;
                    recargo = boletoPerdido == 1 ? 5.00 : 0;
                    total = subtotal - descuento + recargo;
                    recaudacion += total;
                    vehiculosRegistrados++;
                    System.out.println("Vehículo: " + nombreVehiculo);
                    System.out.printf("Subtotal: $%.2f%n", subtotal);
                    System.out.printf("Descuento: $%.2f%n", descuento);
                    System.out.printf("Recargo: $%.2f%n", recargo);
                    System.out.printf("Total a pagar: $%.2f%n", total);
                    break;
                case 2:
                    System.out.println("Motocicleta: $0.50/h");
                    System.out.println("Automóvil: $1.00/h");
                    System.out.println("Camioneta: $1.50/h");
                    break;
                case 3:
                    System.out.printf("Recaudación acumulada: $%.2f%n", recaudacion);
                    System.out.println("Vehículos registrados: " + vehiculosRegistrados);
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

