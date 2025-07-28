 🎬 Sistema de Contenidos Audiovisuales en Java

Este proyecto consiste en un sistema de gestión de contenidos audiovisuales, como películas, series y documentales. Está desarrollado en Java y estructurado siguiendo el patrón de diseño **MVC (Modelo-Vista-Controlador)**, aplicando principios de **Código Limpio** y **SOLID** para garantizar un diseño mantenible y escalable. Además, incluye pruebas unitarias con **JUnit**.

---

## 📁 Estructura del Proyecto

```
proyecto-audiovisual/
├── src/
│   ├── App.java                         # Clase principal (main)
│   ├── controller/
│   │   └── ContenidoController.java     # Controlador MVC
│   ├── model/
│   │   ├── ContenidoAudiovisual.java    # Superclase abstracta
│   │   ├── Pelicula.java                # Subclase
│   │   ├── SerieDeTV.java               # Subclase
│   │   ├── Documental.java              # Subclase
│   │   └── RepositorioCSV.java          # Carga de datos desde CSV
│   ├── view/
│   │   ├── IVista.java                  # Interfaz de vista
│   │   └── ConsolaVista.java            # Implementación de la vista
│   └── data/
│       └── contenidos.csv               # Archivo con datos de ejemplo
├── test/
│   └── controller/
│       └── ContenidoControllerTest.java # Prueba unitaria con JUnit
```

---

## 🎯 Objetivos

- Modelar distintos tipos de contenido audiovisual.
- Aplicar el principio de herencia y polimorfismo.
- Separar responsabilidades usando MVC.
- Leer datos desde un archivo `.csv`.
- Mostrar detalles de forma estructurada en consola.
- Validar funcionamiento mediante pruebas unitarias.

---

## 🧱 Diseño de Clases

### Superclase
- **ContenidoAudiovisual (abstracta)**: Atributos comunes como `id`, `titulo`, `duracionEnMinutos` y `genero`. Método abstracto `mostrarDetalles()`.

### Subclases
- **Pelicula**: Añade atributo `estudio`.
- **SerieDeTV**: Añade atributo `temporadas`.
- **Documental**: Añade atributo `tema`.

### Persistencia
- **RepositorioCSV**: Carga el contenido desde el archivo CSV y lo convierte en objetos de las subclases.

### Vista
- **IVista**: Interfaz para desacoplar la vista de la lógica.
- **ConsolaVista**: Implementa `mostrarContenidos()` e imprime usando `mostrarDetalles()`.

### Controlador
- **ContenidoController**: Recupera los datos desde el repositorio y los envía a la vista.

---

## 🧪 Pruebas Unitarias

- Se prueba la clase `ContenidoController` usando un `Mock` de `IVista`.
- Se verifica:
  - Que la lista no es nula ni vacía.
  - Que contiene los elementos esperados según el archivo CSV.

---

## 📥 Ejemplo del archivo CSV

```csv
pelicula,Inception,148,Ciencia Ficcion,Warner Bros
serie,Stranger Things,50,Terror,4
documental,Planeta Tierra,60,Naturaleza,Biomas del planeta
```

---

## 🧠 Principios SOLID Aplicados

- **S**: Cada clase tiene una sola responsabilidad.
- **O**: Las clases están abiertas a extensión, pero cerradas a modificación.
- **L**: Las subclases pueden sustituir a la superclase sin errores.
- **I**: Se usa una interfaz (`IVista`) específica para desacoplar.
- **D**: El controlador depende de una abstracción (`IVista`), no de una clase concreta.

---

## ▶️ Cómo Ejecutar

1. Compilar el proyecto:
```bash
javac src/**/*.java
```

2. Ejecutar la aplicación:
```bash
java src.App
```

3. Resultado: Se imprimen en consola los detalles de los contenidos cargados.

---

## 🔧 Posibles Mejoras

- Permitir agregar o editar contenidos desde consola o GUI.
- Conexión con base de datos.
- Exportación a otros formatos (JSON, XML).
- Validación y manejo de errores más robusto.

---

## 👨‍💻 Autor

Proyecto académico desarrollado como ejercicio de diseño orientado a objetos, arquitectura MVC, buenas prácticas y pruebas en Java.
