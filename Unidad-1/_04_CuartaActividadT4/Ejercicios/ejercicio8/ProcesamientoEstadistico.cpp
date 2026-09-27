#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    int cantidad, numero;
    int positivos = 0, negativos = 0, ceros = 0;
    int pares = 0, impares = 0, multiplosTres = 0;
    long long suma = 0;
    double promedio;
    do {
        cout << "¿Cuantos numeros se ingresaran? ";
        cin >> cantidad;
        if (cantidad < 0) cout << "La cantidad no puede ser negativa.\n";
    } while (cantidad < 0);
    for (int i = 1; i <= cantidad; i++) {
        cout << "Ingrese el numero " << i << ": ";
        cin >> numero;
        // Se clasifica el signo del número.
        if (numero > 0) positivos++;
        else if (numero < 0) negativos++;
        else ceros++;
        // El residuo permite saber si es par o impar.
        if (numero % 2 == 0) pares++;
        else impares++;
        if (numero % 3 == 0) multiplosTres++;
        suma += numero;
    }
    cout << "\n--- RESULTADOS ---\n";
    cout << "Positivos: " << positivos << '\n';
    cout << "Negativos: " << negativos << '\n';
    cout << "Ceros: " << ceros << '\n';
    cout << "Pares: " << pares << '\n';
    cout << "Impares: " << impares << '\n';
    cout << "Multiplos de 3: " << multiplosTres << '\n';
    cout << "Suma total: " << suma << '\n';
    if (cantidad > 0) {
        promedio = static_cast<double>(suma) / cantidad;
        cout << fixed << setprecision(2) << "Promedio: " << promedio << '\n';
    } else {
        cout << "Promedio: no se calcula porque no hay datos.\n";
    }
    return 0;
}
