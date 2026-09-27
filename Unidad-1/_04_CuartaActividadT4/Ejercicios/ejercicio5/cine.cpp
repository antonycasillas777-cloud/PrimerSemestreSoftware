#include <iostream>
#include <iomanip>
using namespace std;
 
int main() {
    int opcion, edad, cantidadEntradas = 0;
    double precio = 0, descuento, precioFinal, total = 0;
 
    do {
        cout << "\n--- VENTA DE ENTRADAS ---\n";
        cout << "1. 2D - $5.00\n2. 3D - $7.50\n3. IMAX - $10.00\n4. Finalizar compra\n";
        cout << "Seleccione una opcion: ";
        cin >> opcion;
 
        switch (opcion) {
            case 1: precio = 5.00; break;
            case 2: precio = 7.50; break;
            case 3: precio = 10.00; break;
            case 4: break;
            default:
                cout << "Opcion invalida.\n";
                continue;
        }
 
        if (opcion != 4) {
            do {
                cout << "Ingrese la edad del cliente (0 a 120): ";
                cin >> edad;
                if (edad < 0 || edad > 120) cout << "Edad invalida.\n";
            } while (edad < 0 || edad > 120);
 
            if (edad < 12) descuento = precio * 0.30;
            else if (edad >= 65) descuento = precio * 0.25;
            else descuento = 0;
 
            precioFinal = precio - descuento;
            total += precioFinal;
            cantidadEntradas++;
            cout << fixed << setprecision(2) << "Precio de la entrada: $" << precioFinal << "\n";
            cout << "Total acumulado: $" << total << "\n";
        }
    } while (opcion != 4);
 
    cout << "Entradas compradas: " << cantidadEntradas << "\n";
    cout << fixed << setprecision(2) << "Total final: $" << total << "\n";
    return 0;
}
