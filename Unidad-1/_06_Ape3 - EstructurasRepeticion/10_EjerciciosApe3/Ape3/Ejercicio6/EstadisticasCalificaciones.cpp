#include <iostream>
using namespace std;

int main() {
    int cantidadEstudiantes;
    int aprobados = 0, reprobados = 0;
    double nota, suma = 0, promedio;
    double mayor = 0, menor = 10;
    double porcentajeAprobados, porcentajeReprobados;

    do {
        cout << "Cantidad de estudiantes: ";
        cin >> cantidadEstudiantes;
        if (cantidadEstudiantes <= 0) {
            cout << "La cantidad debe ser mayor que cero." << endl;
        }
    } while (cantidadEstudiantes <= 0);

    for (int i = 0; i < cantidadEstudiantes; i++) {
        do {
            cout << "Nota del estudiante " << (i + 1) << ": ";
            cin >> nota;
            if (nota < 0 || nota > 10) {
                cout << "La nota debe estar entre 0 y 10." << endl;
            }
        } while (nota < 0 || nota > 10);

        suma = suma + nota;
        if (nota > mayor) {
            mayor = nota;
        }
        if (nota < menor) {
            menor = nota;
        }
        if (nota >= 7) {
            aprobados++;
        } else {
            reprobados++;
        }
    }
    promedio = suma / cantidadEstudiantes;
    porcentajeAprobados = aprobados * 100.0 / cantidadEstudiantes;
    porcentajeReprobados = reprobados * 100.0 / cantidadEstudiantes;
    cout << "Promedio general: " << promedio << endl;
    cout << "Calificacion mayor: " << mayor << endl;
    cout << "Calificacion menor: " << menor << endl;
    cout << "Aprobados: " << aprobados << endl;
    cout << "Reprobados: " << reprobados << endl;
    cout << "Porcentaje de aprobados: " << porcentajeAprobados << " %" << endl;
    cout << "Porcentaje de reprobados: " << porcentajeReprobados << " %" << endl;
    cout << "Programa finalizado." << endl;
    return 0;
}
