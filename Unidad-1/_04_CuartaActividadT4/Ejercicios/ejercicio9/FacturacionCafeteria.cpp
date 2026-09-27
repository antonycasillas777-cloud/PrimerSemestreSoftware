#include <iostream>
#include <iomanip>
#include <string>
using namespace std;
int main() {
    int opcion, cantidad;
    double precio = 0, subtotal = 0, descuento, total;
    string producto;
    do {
        cout << "\n--- CAFETERIA ---\n";
        cout << "1. Cafe - $1.50\n2. Sandwich - $2.50\n";
        cout << "3. Jugo - $1.75\n4. Ensalada - $3.00\n5. Finalizar\n";
        cout << "Seleccione una opcion: ";
        cin >> opcion;
        switch (opcion) {
            case 1: precio = 1.50; producto = "Cafe"; break;
            case 2: precio = 2.50; producto = "Sandwich"; break;
            case 3: precio = 1.75; producto = "Jugo"; break;
            case 4: precio = 3.00; producto = "Ensalada"; break;
            case 5: break;
            default: cout << "Opcion invalida.\n";
        }
        if (opcion >= 1 && opcion <= 4) {
            do {
                cout << "Cantidad de " << producto << ": ";
                cin >> cantidad;
                if (cantidad <= 0) cout << "La cantidad debe ser positiva.\n";
            } while (cantidad <= 0);
            subtotal += precio * cantidad;
            cout << fixed << setprecision(2)
                 << "Subtotal acumulado: $" << subtotal << '\n';
        }
    } while (opcion != 5);
    // El descuento se aplica una sola vez sobre el subtotal final.
    if (subtotal < 10) descuento = 0;
    else if (subtotal < 20) descuento = subtotal * 0.05;
    else if (subtotal < 50) descuento = subtotal * 0.10;
    else descuento = subtotal * 0.15;
    total = subtotal - descuento;
    cout << fixed << setprecision(2);
    cout << "Subtotal: $" << subtotal << '\n';
    cout << "Descuento: $" << descuento << '\n';
    cout << "Total a pagar: $" << total << '\n';
    return 0;
}
