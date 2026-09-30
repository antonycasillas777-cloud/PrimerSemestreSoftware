#include <iostream>
using namespace std;

int main() {
    double saldo, monto;
    int opcion, transacciones = 0;

    do {
        cout << "Ingrese el saldo inicial (0 o mayor):" << endl;
        cin >> saldo;
        if (saldo < 0) {
            cout << "El saldo no puede ser negativo." << endl;
        }
    } while (saldo < 0);

    do {
        cout << "1. Consultar saldo" << endl;
        cout << "2. Depositar" << endl;
        cout << "3. Retirar" << endl;
        cout << "4. Ver numero de transacciones" << endl;
        cout << "5. Salir" << endl;
        cin >> opcion;
        switch (opcion) {
            case 1:
                cout << "Saldo: " << saldo << endl;
                break;
            case 2:
                cout << "Ingrese el monto a depositar:" << endl;
                cin >> monto;
                if (monto <= 0) {
                    cout << "El monto debe ser mayor que cero." << endl;
                } else {
                    saldo = saldo + monto;
                    transacciones++;
                    cout << "Deposito realizado. Saldo: " << saldo << endl;
                }
                break;
            case 3:
                cout << "Ingrese el monto a retirar:" << endl;
                cin >> monto;
                if (monto <= 0) {
                    cout << "El monto debe ser mayor que cero." << endl;
                } else if (monto > saldo) {
                    cout << "Saldo insuficiente." << endl;
                } else {
                    saldo = saldo - monto;
                    transacciones++;
                    cout << "Retiro realizado. Saldo: " << saldo << endl;
                }
                break;
            case 4:
                cout << "Transacciones: " << transacciones << endl;
                break;
            case 5:
                cout << "Programa finalizado." << endl;
                break;
            default:
                cout << "Opcion invalida." << endl;
                break;
        }
    } while (opcion != 5);
    return 0;
}
