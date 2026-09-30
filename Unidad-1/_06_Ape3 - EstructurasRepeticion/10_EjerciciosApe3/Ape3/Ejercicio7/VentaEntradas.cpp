#include <iostream>
#include <string>
using namespace std;

int main() {
    string tipoEntrada;
    int cantidad, continuar, ventas = 0;
    double precio, subtotal, total = 0;

    do {
        cout << "Tipo de entrada (una palabra):" << endl;
        cin >> tipoEntrada;

        do {
            cout << "Cantidad de entradas:" << endl;
            cin >> cantidad;
            if (cantidad <= 0) {
                cout << "La cantidad debe ser mayor que cero." << endl;
            }
        } while (cantidad <= 0);

        do {
            cout << "Precio por entrada:" << endl;
            cin >> precio;
            if (precio < 0) {
                cout << "El precio no puede ser negativo." << endl;
            }
        } while (precio < 0);

        // Acumulamos una venta con datos validos.
        subtotal = cantidad * precio;
        total = total + subtotal;
        ventas++;
        cout << "Tipo: " << tipoEntrada << endl;
        cout << "Subtotal de la venta: " << subtotal << endl;
        cout << "Total acumulado: " << total << endl;

        do {
            cout << "Otra venta? 1. Si  2. No" << endl;
            cin >> continuar;
            if (continuar != 1 && continuar != 2) {
                cout << "Opcion invalida. Elija 1 o 2." << endl;
            }
        } while (continuar != 1 && continuar != 2);
    } while (continuar == 1);

    cout << "Ventas registradas: " << ventas << endl;
    cout << "Total final: " << total << endl;
    return 0;
}
