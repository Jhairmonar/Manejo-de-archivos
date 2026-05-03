# Prácticas de Archivos en Java y C++ 🚀

Este repositorio contiene ejercicios de lógica de programación orientados a la lectura y procesamiento de datos desde archivos de texto (`.txt`). 

## 📂 Contenido del Repositorio

1. **Sistema de Notas (Java)**
   * **Archivo:** `SistemaNotasArchivo.java`
   * **Datos:** `estudiantes.txt`
   * **Descripción:** Lee una lista de estudiantes con tres calificaciones cada uno. El programa calcula el promedio individual, determina el estado (Aprobado/Reprobado) y al final genera un reporte con el promedio general de la clase.

2. **Gestión de Productos (Java y C++)**
   * **Archivos:** `SistemaProductos.java` / `productos.cpp`
   * **Datos:** `productos.txt`
   * **Descripción:** Procesa un listado de compras con el formato `[Nombre] [Precio] [Cantidad]`. El algoritmo calcula el subtotal por artículo, suma el total de la compra y determina cuál fue el producto con el subtotal más alto.

## ⚙️ Instrucciones de Ejecución

Para que los programas funcionen correctamente, es **indispensable** seguir estas reglas:

1. Los archivos de texto (`estudiantes.txt` y `productos.txt`) deben estar ubicados exactamente en la misma carpeta desde donde se compila y ejecuta el código fuente.
2. **Formato de números:** Los valores decimales en los archivos `.txt` deben escribirse obligatoriamente con **punto** (ej. `850.0`), no con coma, para evitar excepciones de tipo `InputMismatchException`. Las cantidades deben ser números enteros.
