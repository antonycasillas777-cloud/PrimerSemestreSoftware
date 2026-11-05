import java.io.File;

public class Ejercicio3BorrarArchivo {

    private static final String RUTA = "estudiantes.txt";

    public static void main(String[] args) {
        File objetivo = new File(RUTA);

        if (!objetivo.exists()) {
            System.out.println("[AVISO] El archivo " + RUTA + " no existe, no hay nada que borrar.");
            return;
        }

        if (objetivo.delete()) {
            System.out.println("[OK] Se eliminó el archivo " + RUTA);
        } else {
            System.out.println("[ERROR] No se pudo eliminar " + RUTA
                    + ". Revise los permisos o si está abierto en otro programa.");
        }
    }
}
