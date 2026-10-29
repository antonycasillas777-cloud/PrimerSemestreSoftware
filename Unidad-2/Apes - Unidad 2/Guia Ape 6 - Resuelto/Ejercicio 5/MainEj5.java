class Usuario {
    String nombre;
    String cedula;

    Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

class Libro {
    String titulo;
    boolean disponible;

    Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }

        return false;
    }

    void devolver() {
        disponible = true;
        System.out.println("Libro devuelto correctamente.");
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;

    Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    void registrar() {
        if (libro.prestar()) {
            System.out.println("Prestamo registrado correctamente.");
            System.out.println("Usuario: " + usuario.nombre);
            System.out.println("Libro: " + libro.titulo);
        } else {
            System.out.println("El libro no esta disponible para " + usuario.nombre);
        }

        System.out.println();
    }
}

public class MainEj5 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "1801234567");
        Usuario usuario2 = new Usuario("Maria", "1807654321");

        Libro libro1 = new Libro("Java para principiantes");

        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        Prestamo prestamo2 = new Prestamo(usuario2, libro1);

        prestamo1.registrar();
        prestamo2.registrar();
    }
}