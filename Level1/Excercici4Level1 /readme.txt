# 🧾 Proyecto: Ordenar y leer archivos — Exercici 4 (Java Utils)

Este programa permite **listar recursivamente** el contenido de un directorio y **guardar el resultado en un archivo de texto (.txt)**, así como **leer cualquier archivo .txt y mostrar su contenido por consola**.  
Amplía los ejercicios anteriores añadiendo la opción de lectura de archivos de texto ya existentes.

---

## ⚙️ Estructura del proyecto

```
Exercici4Level1/
 ├── src/
 │    ├── main/
 │    │    └── java/
 │    │         ├── MainApp.java
 │    │         └── OrderFilesAZReader.java
 │    └── test/
 │         └── java/
 ├── pom.xml
 └── target/
```

---

## 🧭 Requisitos previos

- Tener **Java 17 o superior** instalado.  
- Comprobar que los comandos funcionan correctamente en la terminal:

  ```bash
  java -version
  javac -version
  ```

---

## 🏁 Instrucciones para compilar y ejecutar desde la terminal

1. **Abrir la terminal** (macOS/Linux) o el **Símbolo del sistema** (Windows).

2. **Navegar hasta la carpeta del código fuente:**

   ```bash
   cd ~/IdeaProjects/S1.5-Java\ Utils/Level1/Exercici4Level1/src/main/java
   ```

3. **Compilar los archivos fuente (.java):**

   ```bash
   javac MainApp.java OrderFilesAZReader.java
   ```

   Esto generará los archivos `.class` en la misma carpeta.

4. **Ejecutar el programa principal:**

   ```bash
   java MainApp
   ```

---

## 🧩 Menú principal y funcionalidades

Al ejecutar el programa, se muestra el siguiente menú:

```
MENU DE GESTION:
0 - Salir
1 - Ordenar archivos y guardar en TXT
2 - Leer archivo TXT y mostrar por consola
```

### 🟦 Opción 1 — Ordenar archivos y guardar en TXT

El programa solicita dos rutas:

```
Introduce la ruta de la carpeta que quieres ordenar:
```
*(Ruta del directorio que se recorrerá recursivamente.)*

```
Introduce la ruta de la carpeta con el archivo donde quieres guardar:
```
*(Ruta del archivo .txt donde se guardará el resultado.)*

Ejemplo:

```
/Users/jordi/Desktop/MiCarpeta
/Users/jordi/Desktop/listado.txt
```

El programa recorre todos los subdirectorios y genera un archivo `.txt` con los nombres **ordenados alfabéticamente**, indicando si cada elemento es un **Directorio (D)** o un **Archivo (F)**, junto con su **última fecha de modificación**.

**Ejemplo de contenido del archivo generado:**

```
📁 Documents --- Última modificación: 2025-10-16T23:01:45Z <-D->
   Apuntes.txt --- Última modificación: 2025-10-16T23:03:10Z <-F->
   Libros --- Última modificación: 2025-10-16T23:04:22Z <-D->
      Java.pdf --- Última modificación: 2025-10-16T23:05:02Z <-F->
README.md --- Última modificación: 2025-10-16T23:06:30Z <-F->
```

---

### 🟩 Opción 2 — Leer archivo TXT y mostrar su contenido

El programa solicita una ruta:

```
Introduce la ruta del archivo TXT que quieres leer:
```

*(Por ejemplo:)*

```
/Users/jordi/Desktop/listado.txt
```

El contenido del archivo se muestra directamente en consola:


## 💡 Notas adicionales

- Los listados se generan y leen desde archivos `.txt` indicados por el usuario.  
- El recorrido de directorios es **recursivo** y **ordenado alfabéticamente**.  
- El programa debe ejecutarse **desde la terminal**, no desde el IDE.  
- No es necesario recompilar cada vez, solo si se modifica el código fuente.

---

## 👨‍💻 Autor

**Jordi Casas**  
Curso Java — Nivel 1, Módulo “Utils”  
Ejercicio 4: Ordenar archivos y leer el contenido de archivos de texto desde consola.
