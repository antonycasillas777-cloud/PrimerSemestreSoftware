<div align="center">

# 💻 PRIMER SEMESTRE · SOFTWARE

### De la primera idea al programa que funciona.

**ANTONY CASILLAS** · Portafolio de programación

`JAVA` &nbsp; `C++` &nbsp; `ALGORITMOS` &nbsp; `DIAGRAMAS DE FLUJO`

[Explorar Unidad 1](Unidad-1/) · [Mapa de actividades](#-mapa-de-actividades) · [Ejecutar un programa](#-del-repositorio-a-la-consola)

---

</div>

## 👋 Bienvenido a mi recorrido

Este repositorio reúne mis tareas y prácticas de programación del primer semestre. Cada actividad conserva sus archivos de trabajo: código, informes, diagramas e infografías, según el ejercicio.

La **Unidad 1** es el punto de partida: resolver problemas mediante variables, decisiones, ciclos y validaciones, con ejemplos de cafeterías, cines, parqueaderos y otros sistemas de consola.

> 🧭 **Empieza aquí:** abre [Unidad-1](Unidad-1/), elige una actividad y entra en la carpeta del ejercicio que quieras consultar.

## 📚 Mapa de actividades

| Actividad | Contenido |
| :--- | :--- |
| [T1 · Programa de cafetería](Unidad-1/_01_PrimerActividadT1) | Documento de la primera actividad. |
| [T2 · Cine universitario](Unidad-1/_02_SegundaActividadT2) | Venta de entradas, validaciones y cálculo de importes. |
| [T3 · Parqueadero universitario](Unidad-1/_03_TercerActividadT3) | Tarifas, descuentos y menú de consulta. |
| [T4 · Estructuras de selección](Unidad-1/_04_CuartaActividadT4) | Diez ejercicios numerados y dos carpetas adicionales de práctica. |
| [T5 · Estructuras de control](Unidad-1/_05_QuintaActividadT5) | Diez ejercicios sobre ciclos, registros y depuración. |
| [APE 1 · Lenguajes de programación](Unidad-1/APE1%20-%20Lenguajes%20de%20programacion) | Documento de la actividad. |
| [APE 2 · Estructuras de selección](Unidad-1/Ape2%20-%20EstructurasSeleccion) | Control de hora, cuentas bancarias y gestión de un jean. |

## 🧰 Lo que encontrarás

| Código fuente | Documentación | Recursos visuales |
| :---: | :---: | :---: |
| 27 archivos Java · 25 archivos C++ | PDF y Word | Infografías y flujogramas |

Los conteos incluyen archivos pendientes. Las implementaciones de Java y C++ se consultan por separado; no todos los ejercicios contienen ambos lenguajes.

## ▶️ Del repositorio a la consola

Necesitas un **JDK** para Java o un compilador como **g++** para C++. Abre una terminal dentro de la carpeta del ejercicio. Compila cada programa por separado.

### Java · ejemplo de T2

Desde `Unidad-1/_02_SegundaActividadT2`:

```bash
javac -encoding UTF-8 cineUniversidad.java
java cineUniversidad
```

### Java · ejemplo con paquete

`ControlHora.java` declara el paquete `ApeEjercicio1`. Desde su carpeta `Ejercicio1`:

```bash
javac -encoding UTF-8 -d out ControlHora.java
java -cp out ApeEjercicio1.ControlHora
```

### C++ · ejemplo de T2 en Windows

Desde `Unidad-1/_02_SegundaActividadT2`, con g++ disponible:

```powershell
g++ cineUniversidad.cpp -o cineUniversidad.exe
.\cineUniversidad.exe
```

También puedes abrir los archivos en tu editor o IDE y configurar el proyecto para el lenguaje correspondiente. Respeta los nombres de clase y las declaraciones `package` de Java.

## 🚧 Estado del material

Este es un portafolio de aprendizaje. La organización y los enlaces se revisaron; el código no se ha validado mediante una ejecución completa de todos los programas.

Los siguientes archivos C++ están vacíos en el material original y quedan pendientes:

- [Jean.cpp](Unidad-1/Ape2%20-%20EstructurasSeleccion/Ejercicio3/Jean.cpp).
- [clasificacionCalificaciones.cpp](Unidad-1/_04_CuartaActividadT4/Ejercicios/ejercicio1/clasificacionCalificaciones.cpp).
- [ejercicioPaquete.cpp](Unidad-1/_04_CuartaActividadT4/Ejercicios/EjercicioPaquetes/ejercicioPaquete.cpp).

Los ejercicios de T4 y T5 están desplegados en carpetas para facilitar su consulta. Los archivos `.drawio` son diagramas editables; las imágenes PNG y SVG permiten consultar otros flujogramas.

---

<div align="center">

**Aprender · practicar · corregir · volver a intentar** 🚀

</div>
