import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2EscribirArchivo {

    private static final String RUTA = "estudiantes.txt";

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el texto a guardar: ");
            String texto = entrada.nextLine();

            guardarTexto(texto);
            System.out.println("[OK] El texto se añadió al final de " + RUTA);
        } catch (IOException ex) {
            System.out.println("[ERROR] No se pudo escribir en el archivo: " + ex.getMessage());
        }
    }

    // El segundo parámetro (true) activa el modo "append": conserva el contenido previo
    private static void guardarTexto(String texto) throws IOException {
        try (BufferedWriter salida = new BufferedWriter(new FileWriter(RUTA, true))) {
            salida.write(texto);
            salida.newLine();
        }
    }
}
