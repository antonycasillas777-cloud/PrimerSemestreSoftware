import java.util.Scanner;

public class RegistroVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipo, vehiculos = 0;
        String nombreTipo;
        double horas, tarifa, valor, recaudacion = 0;

        System.out.println("Tipo: 1. Automovil  2. Motocicleta"
                + "  3. Camioneta  0. Salir");
        tipo = scanner.nextInt();

        while (tipo != 0) {
            if (tipo < 1 || tipo > 3) {
                System.out.println("Tipo invalido. Elija una opcion entre 0 y 3.");
            } else {
                if (tipo == 1) {
                    nombreTipo = "Automovil";
                } else if (tipo == 2) {
                    nombreTipo = "Motocicleta";
                } else {
                    nombreTipo = "Camioneta";
                }

                System.out.println("Numero de horas:");
                horas = scanner.nextDouble();
                while (horas <= 0) {
                    System.out.println("Ingrese horas mayores que cero:");
                    horas = scanner.nextDouble();
                }

                System.out.println("Tarifa por hora para " + nombreTipo + ":");
                tarifa = scanner.nextDouble();
                while (tarifa < 0) {
                    System.out.println("Ingrese una tarifa no negativa:");
                    tarifa = scanner.nextDouble();
                }

                // Acumulamos solo los registros con datos validos.
                valor = horas * tarifa;
                recaudacion = recaudacion + valor;
                vehiculos++;
                System.out.println("Vehiculo: " + nombreTipo);
                System.out.println("Valor individual: " + valor);
            }
            System.out.println("Tipo: 1. Automovil  2. Motocicleta"
                + "  3. Camioneta  0. Salir");
            tipo = scanner.nextInt();
        }

        System.out.println("Vehiculos registrados: " + vehiculos);
        System.out.println("Recaudacion total: " + recaudacion);
        scanner.close();
    }
}
