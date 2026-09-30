#include <iostream>
#include <string>
using namespace std;

int main() {
    int estudiantes, dias, i, j;
    int totalAsistencias = 0, totalAusencias = 0;
    string marca;

    cout << "Numero de estudiantes:" << endl;
    cin >> estudiantes;
    while (estudiantes <= 0) {
        cout << "Ingrese una cantidad mayor que cero:" << endl;
        cin >> estudiantes;
    }
    cout << "Numero de dias:" << endl;
    cin >> dias;
    while (dias <= 0) {
        cout << "Ingrese una cantidad mayor que cero:" << endl;
        cin >> dias;
    }

    int* asistencias = new int[estudiantes];
    int* ausencias = new int[estudiantes];
    for (i = 0; i < estudiantes; i++) {
        asistencias[i] = 0;
        ausencias[i] = 0;
        for (j = 0; j < dias; j++) {
            cout << "Estudiante " << (i + 1) << ", dia " << (j + 1) << endl;
            cout << "Ingrese P (presente) o A (ausente):" << endl;
            cin >> marca;
            while (marca != "P" && marca != "A") {
                cout << "Marca invalida. Ingrese P o A:" << endl;
                cin >> marca;
            }
            if (marca == "P") {
                asistencias[i]++;
                totalAsistencias++;
            } else {
                ausencias[i]++;
                totalAusencias++;
            }
        }
    }

    // Mostramos los resultados cuando termina todo el registro.
    for (i = 0; i < estudiantes; i++) {
        cout << "Estudiante " << (i + 1) << endl;
        cout << "Asistencias: " << asistencias[i] << endl;
        cout << "Ausencias: " << ausencias[i] << endl;
    }
    cout << "Total de asistencias: " << totalAsistencias << endl;
    cout << "Total de ausencias: " << totalAusencias << endl;
    delete[] asistencias;
    delete[] ausencias;
    return 0;
}
