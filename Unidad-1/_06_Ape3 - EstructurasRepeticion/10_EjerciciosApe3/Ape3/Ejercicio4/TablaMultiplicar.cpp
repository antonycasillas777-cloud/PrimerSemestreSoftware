#include <iostream>
using namespace std;

int main() {
    int numero, i, resultado;

    cout << "Ingrese un numero entero entre 1 y 12:" << endl;
    cin >> numero;

    // Repetimos la lectura si el numero esta fuera del rango.
    while (numero < 1 || numero > 12) {
        cout << "Numero invalido. Ingrese un numero entre 1 y 12:" << endl;
        cin >> numero;
    }

    cout << "Tabla de multiplicar del " << numero << endl;
    for (i = 1; i <= 12; i++) {
        resultado = numero * i;
        cout << numero << " x " << i << " = " << resultado << endl;
    }
    return 0;
}
