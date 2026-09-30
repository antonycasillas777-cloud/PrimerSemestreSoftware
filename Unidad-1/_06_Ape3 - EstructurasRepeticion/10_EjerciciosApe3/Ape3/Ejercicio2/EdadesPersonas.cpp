#include <iostream>
using namespace std;

int main() {
    int edad;
    int menores = 0, adultos = 0, mayores65 = 0;
    int cantidadPersonas = 0;
    double sumaEdades = 0, promedio;

    cout << "Ingrese una edad (-1 para terminar): ";
    cin >> edad;

    while (edad != -1) {
        if (edad < 0) {
            cout << "La edad no puede ser negativa." << endl;
        } else {
            sumaEdades = sumaEdades + edad;
            cantidadPersonas++;

            if (edad < 18) {
                menores++;
            } else if (edad <= 65) {
                adultos++;
            } else {
                mayores65++;
            }
        }
        cout << "Ingrese una edad (-1 para terminar): ";
        cin >> edad;
    }

    cout << "Menores de edad: " << menores << endl;
    cout << "Adultos de 18 a 65: " << adultos << endl;
    cout << "Mayores de 65: " << mayores65 << endl;

    if (cantidadPersonas > 0) {
        promedio = sumaEdades / cantidadPersonas;
        cout << "Promedio de edades: " << promedio << endl;
    } else {
        cout << "No se ingresaron edades validas." << endl;
    }
    cout << "Programa finalizado." << endl;
    return 0;
}
