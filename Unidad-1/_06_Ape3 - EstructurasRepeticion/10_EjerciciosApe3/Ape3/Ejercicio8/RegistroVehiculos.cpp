#include <iostream>
#include <string>
using namespace std;

int main() {
    int tipo, vehiculos = 0;
    string nombreTipo;
    double horas, tarifa, valor, recaudacion = 0;

    cout << "Tipo: 1. Automovil  2. Motocicleta  3. Camioneta  0. Salir" << endl;
    cin >> tipo;

    while (tipo != 0) {
        if (tipo < 1 || tipo > 3) {
            cout << "Tipo invalido. Elija una opcion entre 0 y 3." << endl;
        } else {
            if (tipo == 1) {
                nombreTipo = "Automovil";
            } else if (tipo == 2) {
                nombreTipo = "Motocicleta";
            } else {
                nombreTipo = "Camioneta";
            }

            cout << "Numero de horas:" << endl;
            cin >> horas;
            while (horas <= 0) {
                cout << "Ingrese horas mayores que cero:" << endl;
                cin >> horas;
            }

            cout << "Tarifa por hora para " << nombreTipo << ":" << endl;
            cin >> tarifa;
            while (tarifa < 0) {
                cout << "Ingrese una tarifa no negativa:" << endl;
                cin >> tarifa;
            }

            // Acumulamos solo los registros con datos validos.
            valor = horas * tarifa;
            recaudacion = recaudacion + valor;
            vehiculos++;
            cout << "Vehiculo: " << nombreTipo << endl;
            cout << "Valor individual: " << valor << endl;
        }
        cout << "Tipo: 1. Automovil  2. Motocicleta  3. Camioneta  0. Salir" << endl;
        cin >> tipo;
    }

    cout << "Vehiculos registrados: " << vehiculos << endl;
    cout << "Recaudacion total: " << recaudacion << endl;
    return 0;
}
