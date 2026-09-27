#include <iostream>
#include <sstream>
#include <string>
using namespace std;
 
int main() {
    int numero;
    int opcion;
    int i;
    bool numeroValido;
    string entrada;
 
    cout << "TABLA DE MULTIPLICAR SELECCIONADA" << endl;
 
    // Se valida el numero antes de mostrar el menu
    do {
        cout << "Ingrese un numero entre 1 y 12: ";
        getline(cin, entrada);
 
        stringstream conversor(entrada);
        char sobrante;
        numeroValido = (conversor >> numero) && !(conversor >> sobrante)
                       && numero >= 1 && numero <= 12;
 
        if (numeroValido) {
            cout << "Numero valido." << endl;
        } else {
            cout << "Numero invalido. Debe ser un entero entre 1 y 12." << endl;
        }
    } while (!numeroValido);
 
    // El menu se ejecuta al menos una vez y se repite hasta elegir Salir
    do {
        cout << "\n========== MENU ==========" << endl;
        cout << "1. Tabla ascendente" << endl;
        cout << "2. Tabla descendente" << endl;
        cout << "3. Salir" << endl;
        cout << "Elija una opcion: ";
        getline(cin, entrada);
 
        stringstream conversorOpcion(entrada);
        char sobrante;
        if (!(conversorOpcion >> opcion) || (conversorOpcion >> sobrante)) {
            opcion = 0;
        }
 
        switch (opcion) {
            case 1:
                cout << "\nTABLA ASCENDENTE DEL " << numero << endl;
                for (i = 1; i <= 12; i++) {
                    cout << numero << " x " << i << " = " << numero * i << endl;
                }
                break;
 
            case 2:
                cout << "\nTABLA DESCENDENTE DEL " << numero << endl;
                for (i = 12; i >= 1; i--) {
                    cout << numero << " x " << i << " = " << numero * i << endl;
                }
                break;
 
            case 3:
                cout << "Gracias por usar el programa. Hasta pronto." << endl;
                break;
 
            default:
                cout << "Opcion invalida. Elija 1, 2 o 3." << endl;
                break;
        }
    } while (opcion != 3);
 
    return 0;
}
