import java.io.File;
import java.io.IOException;

public class Ejercicio1CrearArchivo {

    private static final String RUTA = "curso.txt";

    public static void main(String[] args) {
        File documento = new File(RUTA);

        try {
            boolean fueCreado = documento.createNewFile();

            if (fueCreado) {
                System.out.println("[OK] Se creó el archivo: " + documento.getName());
            } else {
                System.out.println("[AVISO] El archivo " + documento.getName() + " ya estaba creado.");
            }
            System.out.println("Ubicación: " + documento.getAbsolutePath());

        } catch (IOException ex) {
            System.out.println("[ERROR] No fue posible crear el archivo: " + ex.getMessage());
        }
    }
}
