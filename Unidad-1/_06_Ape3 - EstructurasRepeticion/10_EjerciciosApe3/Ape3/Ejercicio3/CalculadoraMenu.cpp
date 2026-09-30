#include <iostream>
using namespace std;

int main() {
    int opcion;
    double numero1 = 0, numero2 = 0, resultado;

    do {
        cout << "\nMENU DE OPERACIONES" << endl;
        cout << "1) Sumar" << endl;
        cout << "2) Restar" << endl;
        cout << "3) Multiplicar" << endl;
        cout << "4) Dividir" << endl;
        cout << "5) Salir" << endl;
        cout << "Seleccione una opcion: ";
        cin >> opcion;

        if (opcion >= 1 && opcion <= 4) {
            cout << "Primer numero: ";
            cin >> numero1;
            cout << "Segundo numero: ";
            cin >> numero2;
        }

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                cout << "Resultado: " << resultado << endl;
                break;
            case 2:
                resultado = numero1 - numero2;
                cout << "Resultado: " << resultado << endl;
                break;
            case 3:
                resultado = numero1 * numero2;
                cout << "Resultado: " << resultado << endl;
                break;
            case 4:
                // Comprobamos el divisor antes de dividir.
                if (numero2 == 0) {
                    cout << "No se puede dividir entre cero." << endl;
                } else {
                    resultado = numero1 / numero2;
                    cout << "Resultado: " << resultado << endl;
                }
                break;
            case 5:
                cout << "Programa finalizado." << endl;
                break;
            default:
                cout << "Opcion invalida. Elija de 1 a 5." << endl;
                break;
        }
    } while (opcion != 5);
    return 0;
}
