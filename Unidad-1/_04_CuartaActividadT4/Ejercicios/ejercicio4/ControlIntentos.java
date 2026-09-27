package ejercicio4;

import java.util.Scanner;
 
public class ControlIntentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "Java2026", claveIngresada = "";
        int intentos = 0, restantes;
        boolean accesoPermitido = false;
 
        while (intentos < 3 && !accesoPermitido) {
            System.out.print("Ingrese la contraseña: ");
            claveIngresada = sc.nextLine();
 
            if (claveIngresada.equals(claveCorrecta)) {
                accesoPermitido = true;
                System.out.println("Acceso permitido.");
            } else {
                intentos++;
                restantes = 3 - intentos;
                if (restantes > 0) {
                    System.out.println("Contraseña incorrecta. Intentos restantes: " + restantes);
                } else {
                    System.out.println("Usuario bloqueado.");
                }
            }
        }
        sc.close();
    }
}

