#include <iostream>
#include <string>
using namespace std;
 
int main() {
    const string claveCorrecta = "Java2026";
    string claveIngresada = "";
    int intentos = 0, restantes;
    bool accesoPermitido = false;
 
    while (intentos < 3 && !accesoPermitido) {
        cout << "Ingrese la contraseña: ";
        getline(cin, claveIngresada);
 
        if (claveIngresada == claveCorrecta) {
            accesoPermitido = true;
            cout << "Acceso permitido.\n";
        } else {
            intentos++;
            restantes = 3 - intentos;
            if (restantes > 0)
                cout << "Contraseña incorrecta. Intentos restantes: " << restantes << "\n";
            else
                cout << "Usuario bloqueado.\n";
        }
    }
    return 0;
}
