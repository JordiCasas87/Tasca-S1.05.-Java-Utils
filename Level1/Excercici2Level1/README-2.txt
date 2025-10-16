# 🧾 Proyecto: Llistar arbre de directoris — Exercici 2 (Java Utils)

Este programa permite **listar recursivamente** el contenido de un directorio, mostrando todos los archivos y subcarpetas **ordenados alfabéticamente** dentro de cada nivel.  
Además, indica si cada elemento es un **directorio (D)** o un **fitxer (F)**, junto con su **última fecha de modificación**.

---

## ⚙️ Estructura del proyecto

```
Excericici2Level1/
 ├── src/
 │    ├── main/
 │    │    └── java/
 │    │         ├── MainApp.java
 │    │         └── OrderFilesAZ.java
 │    └── test/
 │         └── java/
 ├── pom.xml
 └── target/
```

---

## 🧭 Requisitos previos

- **Java 17 o superior** instalado.  
- Comprobar que los comandos `java` y `javac` funcionan correctamente en la terminal:

  ```bash
  java -version
  javac -version
  ```

---

## 🏁 Instrucciones para compilar y ejecutar

1. **Abrir la terminal** (macOS/Linux) o **símbolo del sistema** (Windows).

2. **Navegar hasta la carpeta del proyecto:**

   ```bash
   cd ~/IdeaProjects/Excericici2Level1/src/main/java
   ```

3. **Compilar los archivos fuente:**

   ```bash
   javac MainApp.java OrderFilesAZ.java
   ```

4. **Ejecutar el programa principal:**

   ```bash
   java MainApp
   ```

---

## 🧩 Ejemplo de ejecución

```
MENU DE GESTION:
0 - Salir
1 - Llistar arbre de directoris
```

Si se elige la opción `1`, el programa pedirá una ruta:

```
Introduce la ruta del directorio:
```

👉 El usuario debe introducir una **ruta completa**, por ejemplo:

```
/Users/jordi/Desktop/Projectes
```

---

## 📄 Ejemplo de salida del programa

```
📁 Projectes (D) - Última modificación: 2025-10-16 21:31:00
 ├── 🗂️ Exercici1 (D) - Última modificación: 2025-10-15 18:45:12
 │    ├── MainApp.java (F) - Última modificación: 2025-10-15 18:40:22
 │    └── OrderFilesAZ.java (F) - Última modificación: 2025-10-15 18:42:01
 ├── 🗂️ Exercici2 (D) - Última modificación: 2025-10-16 21:29:11
 └── README.md (F) - Última modificación: 2025-10-16 21:30:10
```

---

## 💡 Notas adicionales

- El listado se muestra **en orden alfabético** dentro de cada nivel.  
- Se recorren **todas las subcarpetas de forma recursiva**.  
- Los nombres se muestran con sangrado para indicar los niveles del árbol.  
- La fecha de modificación se obtiene automáticamente del sistema de archivos.

---

## 👨‍💻 Autor

**Jordi Casas**  
Curso Java — Nivel 1, Módulo “Utils”  
Ejercicio 2: Llistat recursiu d’arbre de directoris.
