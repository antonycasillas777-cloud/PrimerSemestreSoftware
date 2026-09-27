#include <iostream>
#include <iomanip>
#include <string>
using namespace std;
int main() {
    int opcion, cantidadEstudiantes = 0, i, posicion;
    double nota, suma, asistencia, promedio;
    bool encontrado;
    string nombre, clasificacion, nombreBuscado;
    string nombreActual = "", clasificacionActual = "";
    double promedioActual = 0, asistenciaActual = 0;
    // Variables individuales: no se usan arreglos ni vectores.
    string nombre1 = "", nombre2 = "", nombre3 = "", nombre4 = "";
    string clase1 = "", clase2 = "", clase3 = "", clase4 = "";
    double promedio1 = 0, promedio2 = 0, promedio3 = 0, promedio4 = 0;
    double asistencia1 = 0, asistencia2 = 0, asistencia3 = 0, asistencia4 = 0;
    do {
        cout << "\n--- SISTEMA ACADEMICO ---\n";
        cout << "1. Registrar estudiante\n2. Mostrar resultados\n";
        cout << "3. Buscar estudiante\n4. Salir\nSeleccione una opcion: ";
        cin >> opcion;
        cin.ignore(10000, '\n');
        switch (opcion) {
            case 1:
                if (cantidadEstudiantes >= 4) {
                    cout << "Ya se registraron los cuatro estudiantes permitidos.\n";
                } else {
                    cout << "Nombre del estudiante: ";
                    getline(cin, nombre);
                    while (nombre.empty()) {
                        cout << "El nombre no puede estar vacio. Ingrese nuevamente: ";
                        getline(cin, nombre);
                    }
                    suma = 0;
                    for (i = 1; i <= 3; i++) {
                        do {
                            cout << "Calificacion " << i << " (0 a 10): ";
                            cin >> nota;
                            if (nota < 0 || nota > 10) cout << "Calificacion fuera de rango.\n";
                        } while (nota < 0 || nota > 10);
                        suma += nota;
                    }
                    do {
                        cout << "Asistencia (0 a 100): ";
                        cin >> asistencia;
                        if (asistencia < 0 || asistencia > 100) cout << "Asistencia fuera de rango.\n";
                    } while (asistencia < 0 || asistencia > 100);
                    promedio = suma / 3;
                    if (promedio >= 9 && asistencia >= 90) clasificacion = "Excelente";
                    else if (promedio >= 7 && asistencia >= 70) clasificacion = "Aprobado";
                    else if (promedio >= 5 && asistencia >= 70) clasificacion = "Supletorio";
                    else clasificacion = "Reprobado";
                    cantidadEstudiantes++;
                    switch (cantidadEstudiantes) {
                        case 1: nombre1 = nombre; promedio1 = promedio; asistencia1 = asistencia; clase1 = clasificacion; break;
                        case 2: nombre2 = nombre; promedio2 = promedio; asistencia2 = asistencia; clase2 = clasificacion; break;
                        case 3: nombre3 = nombre; promedio3 = promedio; asistencia3 = asistencia; clase3 = clasificacion; break;
                        case 4: nombre4 = nombre; promedio4 = promedio; asistencia4 = asistencia; clase4 = clasificacion; break;
                    }
                    cout << "Estudiante registrado correctamente.\n";
                }
                break;
            case 2:
                if (cantidadEstudiantes == 0) cout << "No existen estudiantes registrados.\n";
                else {
                    for (i = 1; i <= cantidadEstudiantes; i++) {
                        switch (i) {
                            case 1: nombreActual = nombre1; promedioActual = promedio1; asistenciaActual = asistencia1; clasificacionActual = clase1; break;
                            case 2: nombreActual = nombre2; promedioActual = promedio2; asistenciaActual = asistencia2; clasificacionActual = clase2; break;
                            case 3: nombreActual = nombre3; promedioActual = promedio3; asistenciaActual = asistencia3; clasificacionActual = clase3; break;
                            case 4: nombreActual = nombre4; promedioActual = promedio4; asistenciaActual = asistencia4; clasificacionActual = clase4; break;
                        }
                        cout << fixed << setprecision(2) << nombreActual << " | Promedio: "
                             << promedioActual << " | Asistencia: " << asistenciaActual
                             << "% | " << clasificacionActual << '\n';
                    }
                }
                break;
            case 3:
                if (cantidadEstudiantes == 0) cout << "No existen estudiantes registrados.\n";
                else {
                    cout << "Nombre que desea buscar: ";
                    getline(cin, nombreBuscado);
                    posicion = 1;
                    encontrado = false;
                    while (posicion <= cantidadEstudiantes && !encontrado) {
                        switch (posicion) {
                            case 1: nombreActual = nombre1; promedioActual = promedio1; asistenciaActual = asistencia1; clasificacionActual = clase1; break;
                            case 2: nombreActual = nombre2; promedioActual = promedio2; asistenciaActual = asistencia2; clasificacionActual = clase2; break;
                            case 3: nombreActual = nombre3; promedioActual = promedio3; asistenciaActual = asistencia3; clasificacionActual = clase3; break;
                            case 4: nombreActual = nombre4; promedioActual = promedio4; asistenciaActual = asistencia4; clasificacionActual = clase4; break;
                        }
                        if (nombreActual == nombreBuscado) encontrado = true;
                        else posicion++;
                    }
                    if (encontrado) {
                        cout << fixed << setprecision(2) << "Encontrado: " << nombreActual
                             << " | Promedio: " << promedioActual << " | Asistencia: "
                             << asistenciaActual << "% | " << clasificacionActual << '\n';
                    } else cout << "Estudiante no encontrado.\n";
                }
                break;
            case 4: cout << "Programa finalizado.\n"; break;
            default: cout << "Opcion invalida.\n";
        }
    } while (opcion != 4);
    return 0;
}
