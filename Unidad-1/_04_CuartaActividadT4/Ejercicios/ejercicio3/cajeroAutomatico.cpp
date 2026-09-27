#include <iostream>
#include <iomanip>
using namespace std;
 
int main() {
    double saldo = 500.0, monto;
    int opcion;
 
    do {
        cout << "\n--- CAJERO AUTOMATICO ---\n";
        cout << "1. Consultar saldo\n2. Depositar\n3. Retirar\n4. Salir\n";
        cout << "Seleccione una opcion: ";
        cin >> opcion;
 
        switch (opcion) {
            case 1:
                cout << fixed << setprecision(2) << "Saldo actual: $" << saldo << "\n";
                break;
            case 2:
                cout << "Monto a depositar: $";
                cin >> monto;
                if (monto > 0) {
                    saldo += monto;
                    cout << "Deposito realizado correctamente.\n";
                } else {
                    cout << "Monto invalido. Debe ser positivo.\n";
                }
                cout << fixed << setprecision(2) << "Saldo actual: $" << saldo << "\n";
                break;
            case 3:
                cout << "Monto a retirar: $";
                cin >> monto;
                if (monto <= 0)
                    cout << "Monto invalido. Debe ser positivo.\n";
                else if (monto > 500)
                    cout << "El retiro no puede superar $500.\n";
                else if (monto > saldo)
                    cout << "Fondos insuficientes.\n";
                else {
                    saldo -= monto;
                    cout << "Retiro realizado correctamente.\n";
                }
                cout << fixed << setprecision(2) << "Saldo actual: $" << saldo << "\n";
                break;
            case 4:
                cout << fixed << setprecision(2) << "Saldo final: $" << saldo << "\n";
                cout << "Gracias por usar el cajero.\n";
                break;
            default:
                cout << "Opcion invalida. Elija del 1 al 4.\n";
        }
    } while (opcion != 4);
    return 0;
}
