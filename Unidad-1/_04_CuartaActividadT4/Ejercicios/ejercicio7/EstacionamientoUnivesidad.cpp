#include <iostream>
#include <iomanip>
#include <string>
using namespace std;
int main() {
    int opcion, tipoVehiculo, rol, horas, boletoPerdido, vehiculosRegistrados = 0;
    double tarifaHora = 0, subtotal, descuento, recargo, total, recaudacion = 0;
    string nombreVehiculo;
    do {
        cout << "\n--- ESTACIONAMIENTO UNIVERSITARIO ---\n";
        cout << "1. Calcular tarifa\n2. Ver tarifas\n3. Mostrar recaudacion\n4. Salir\n";
        cout << "Seleccione una opcion: "; cin >> opcion;
        switch (opcion) {
            case 1:
                do {
                    cout << "Tipo (1 Motocicleta, 2 Automovil, 3 Camioneta): ";
                    cin >> tipoVehiculo;
                    if (tipoVehiculo < 1 || tipoVehiculo > 3) cout << "Tipo invalido.\n";
                } while (tipoVehiculo < 1 || tipoVehiculo > 3);
                switch (tipoVehiculo) {
                    case 1: tarifaHora = 0.50; nombreVehiculo = "Motocicleta"; break;
                    case 2: tarifaHora = 1.00; nombreVehiculo = "Automovil"; break;
                    default: tarifaHora = 1.50; nombreVehiculo = "Camioneta";
                }
                do {
                    cout << "Rol (1 Estudiante, 2 Docente, 3 Otro): "; cin >> rol;
                    if (rol < 1 || rol > 3) cout << "Rol invalido.\n";
                } while (rol < 1 || rol > 3);
                do {
                    cout << "Horas (1 a 24): "; cin >> horas;
                    if (horas < 1 || horas > 24) cout << "Horas invalidas.\n";
                } while (horas < 1 || horas > 24);
                do {
                    cout << "Boleto perdido (1 Si, 0 No): "; cin >> boletoPerdido;
                    if (boletoPerdido != 0 && boletoPerdido != 1) cout << "Respuesta invalida.\n";
                } while (boletoPerdido != 0 && boletoPerdido != 1);
                subtotal = tarifaHora * horas;
                if (rol == 1) descuento = subtotal * 0.20;
                else if (rol == 2) descuento = subtotal * 0.10;
                else descuento = 0;
                recargo = boletoPerdido == 1 ? 5.00 : 0;
                total = subtotal - descuento + recargo;
                recaudacion += total; vehiculosRegistrados++;
                cout << "Vehiculo: " << nombreVehiculo << '\n';
                cout << fixed << setprecision(2) << "Subtotal: $" << subtotal
                     << "\nDescuento: $" << descuento << "\nRecargo: $" << recargo
                     << "\nTotal a pagar: $" << total << '\n';
                break;
            case 2:
                cout << "Motocicleta: $0.50/h\nAutomovil: $1.00/h\nCamioneta: $1.50/h\n";
                break;
            case 3:
                cout << fixed << setprecision(2) << "Recaudacion acumulada: $" << recaudacion << '\n';
                cout << "Vehiculos registrados: " << vehiculosRegistrados << '\n';
                break;
            case 4: cout << "Programa finalizado.\n"; break;
            default: cout << "Opcion invalida.\n";
        }
    } while (opcion != 4);
    return 0;
}
