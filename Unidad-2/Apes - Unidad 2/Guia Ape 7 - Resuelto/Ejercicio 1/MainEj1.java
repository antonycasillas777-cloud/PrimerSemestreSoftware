class Autor {
    String nombre;
    String nacionalidad;

    Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
}

class Libro {
    String titulo;
    int anio;
    Autor autor;

    Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Autor: " + autor.nombre);
        System.out.println();
    }
}

public class MainEj1 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("Miguel de Cervantes", "Española");

        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("Don Quijote", 1605, autor2);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}