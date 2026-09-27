#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    double temperatura, suma = 0, mayor = 0, menor = 0, promedio;
    int cantidad = 0, frias = 0, templadas = 0, calidas = 0, muyCalidas = 0;
    cout << "Ingrese una temperatura (-50 a 60) o 999 para finalizar: ";
    cin >> temperatura;
    while (temperatura != 999) {
        // Se rechazan los datos que estén fuera del rango permitido.
        if (temperatura < -50 || temperatura > 60) {
            cout << "Temperatura invalida. Debe estar entre -50 y 60.\n";
        } else {
            // El primer dato válido inicializa el valor mayor y el menor.
            if (cantidad == 0) {
                mayor = temperatura;
                menor = temperatura;
            } else {
                if (temperatura > mayor) mayor = temperatura;
                if (temperatura < menor) menor = temperatura;
            }
            suma += temperatura;
            cantidad++;
            if (temperatura < 10) {
                frias++;
                cout << "Clasificacion: Frio\n";
            } else if (temperatura <= 24) {
                templadas++;
                cout << "Clasificacion: Templado\n";
            } else if (temperatura <= 34) {
                calidas++;
                cout << "Clasificacion: Calido\n";
            } else {
                muyCalidas++;
                cout << "Clasificacion: Muy calido\n";
            }
        }
        cout << "Ingrese otra temperatura o 999 para finalizar: ";
        cin >> temperatura;
    }
    if (cantidad > 0) {
        promedio = suma / cantidad;
        cout << "Cantidad de datos validos: " << cantidad << '\n';
        cout << "Temperatura mayor: " << mayor << '\n';
        cout << "Temperatura menor: " << menor << '\n';
        cout << fixed << setprecision(2) << "Promedio: " << promedio << '\n';
        cout << "Frio: " << frias << '\n';
        cout << "Templado: " << templadas << '\n';
        cout << "Calido: " << calidas << '\n';
        cout << "Muy calido: " << muyCalidas << '\n';
    } else {
        cout << "No se ingresaron temperaturas validas.\n";
    }
    return 0;
}
