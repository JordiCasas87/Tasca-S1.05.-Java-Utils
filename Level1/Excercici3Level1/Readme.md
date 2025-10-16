# 🧾 Proyecto: Guardar listado de archivos — Exercici 3 (Java Utils)

Este programa permite **listar recursivamente** el contenido de un directorio, mostrando todos los archivos y subcarpetas **ordenados alfabéticamente** dentro de cada nivel.  
A diferencia del ejercicio anterior, el resultado **no se muestra por pantalla**, sino que se **guarda en un archivo de texto (.txt)** en la ruta indicada por el usuario.

---

## ⚙️ Estructura del proyecto

```
Exercici3Level1/
 ├── src/
 │    ├── main/
 │    │    └── java/
 │    │         ├── MainApp.java
 │    │         └── OrderFilesAZWritter.java
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
   cd ~/IdeaProjects/S1.5-Java\ Utils/Level1/Exercici3Level1/src/main/java
   ```

3. **Compilar los archivos fuente (.java):**

   ```bash
   javac MainApp.java OrderFilesAZWritter.java
   ```

   Esto generará los archivos `.class` en la misma carpeta.

4. **Ejecutar el programa principal:**

   ```bash
   java MainApp
   ```

---

## 🧩 Ejemplo de ejecución

```
MENU DE GESTION:
0 - Salir
1 - Ordenar archivos
```

Si el usuario elige la opción `1`, el programa pedirá dos rutas:

```
Introduce la ruta de la carpeta que quieres ordenar:
```

*(Ruta del directorio a listar)*

```
Introduce la ruta de la carpeta con el archivo donde quieres guardar:
```

*(Ruta del archivo .txt donde se guardará el resultado)*

---

## 📄 Ejemplo de contenido del archivo .txt generado

```
📁 Documents --- Última modificación: 2025-10-16T23:01:45Z <-D->
   Apuntes.txt --- Última modificación: 2025-10-16T23:03:10Z <-F->
   Libros --- Última modificación: 2025-10-16T23:04:22Z <-D->
      Java.pdf --- Última modificación: 2025-10-16T23:05:02Z <-F->
README.md --- Última modificación: 2025-10-16T23:06:30Z <-F->
```

---

## 💡 Notas adicionales

- El contenido se **guarda automáticamente** en el archivo `.txt` especificado.  
- El recorrido es **recursivo** y **alfabético** dentro de cada nivel.  
- Se indica si cada elemento es **Directorio (D)** o **Archivo (F)** y su **última fecha de modificación**.  
- El programa debe ejecutarse **desde la terminal**.

---

## 👨‍💻 Autor

**Jordi Casas**  
Curso Java — Nivel 1, Módulo “Utils”  
Ejercicio 3: Guardar el listado recursivo de archivos en un archivo de texto.
