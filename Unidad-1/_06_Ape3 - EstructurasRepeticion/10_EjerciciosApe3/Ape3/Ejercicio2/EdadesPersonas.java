import java.util.Scanner;

public class EdadesPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        int menores = 0, adultos = 0, mayores65 = 0;
        int cantidadPersonas = 0;
        double sumaEdades = 0, promedio;

        System.out.print("Ingrese una edad (-1 para terminar): ");
        edad = scanner.nextInt();

        while (edad != -1) {
            if (edad < 0) {
                System.out.println("La edad no puede ser negativa.");
            } else {
                sumaEdades = sumaEdades + edad;
                cantidadPersonas++;

                if (edad < 18) {
                    menores++;
                } else if (edad <= 65) {
                    adultos++;
                } else {
                    mayores65++;
                }
            }
            System.out.print("Ingrese una edad (-1 para terminar): ");
            edad = scanner.nextInt();
        }

        System.out.println("Menores de edad: " + menores);
        System.out.println("Adultos de 18 a 65: " + adultos);
        System.out.println("Mayores de 65: " + mayores65);

        if (cantidadPersonas > 0) {
            promedio = sumaEdades / cantidadPersonas;
            System.out.println("Promedio de edades: " + promedio);
        } else {
            System.out.println("No se ingresaron edades validas.");
        }
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
