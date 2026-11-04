class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void reducirStock(int cantidad) {
        if (cantidad > 0 && stock >= cantidad) {
            stock = stock - cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}

class Venta {
    int cantidad;

    Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    void aplicar(Producto producto) {
        if (cantidad > 0 && producto.stock >= cantidad) {
            producto.reducirStock(cantidad);
            double total = producto.precio * cantidad;
            System.out.println("Total a pagar: $" + total);
            producto.mostrarProducto();
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}

public class MainEj3 {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado", 15.0, 10);

        Venta v1 = new Venta(3);
        v1.aplicar(p1);

        System.out.println();

        Venta v2 = new Venta(20);
        v2.aplicar(p1);
    }
}