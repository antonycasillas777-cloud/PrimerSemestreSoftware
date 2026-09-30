#include <iostream>
#include <string>
using namespace std;

int main() {
    int opcion, cantidad, ventas = 0, unidades = 0;
    string producto;
    double precio, subtotal, total = 0, ventaMayor = 0, promedio;

    do {
        cout << "1. Registrar venta" << endl;
        cout << "2. Mostrar estadisticas" << endl;
        cout << "3. Salir" << endl;
        cin >> opcion;
        switch (opcion) {
            case 1:
                cout << "Producto (una palabra):" << endl;
                cin >> producto;
                cout << "Cantidad:" << endl;
                cin >> cantidad;
                while (cantidad <= 0) {
                    cout << "Ingrese una cantidad mayor que cero:" << endl;
                    cin >> cantidad;
                }
                cout << "Precio por unidad:" << endl;
                cin >> precio;
                while (precio <= 0) {
                    cout << "Ingrese un precio mayor que cero:" << endl;
                    cin >> precio;
                }

                subtotal = cantidad * precio;
                ventas++;
                unidades = unidades + cantidad;
                total = total + subtotal;
                if (subtotal > ventaMayor) {
                    ventaMayor = subtotal;
                }
                cout << "Venta registrada: " << producto << endl;
                cout << "Subtotal: " << subtotal << endl;
                break;
            case 2:
                // Evitamos dividir entre cero cuando no hay ventas.
                promedio = 0;
                if (ventas > 0) {
                    promedio = total / ventas;
                } else {
                    cout << "No hay ventas registradas." << endl;
                }
                cout << "Numero de ventas: " << ventas << endl;
                cout << "Unidades vendidas: " << unidades << endl;
                cout << "Total recaudado: " << total << endl;
                cout << "Venta mayor: " << ventaMayor << endl;
                cout << "Promedio por venta: " << promedio << endl;
                break;
            case 3:
                cout << "Programa finalizado." << endl;
                break;
            default:
                cout << "Opcion invalida. Elija de 1 a 3." << endl;
                break;
        }
    } while (opcion != 3);
    return 0;
}
