# 🧾 Proyecto: Serialización y deserialización de objetos — Exercici 5 (Java Utils)

Este programa permite **serializar un objeto Java en un archivo `.ser`** y posteriormente **deserializarlo para volver a cargarlo en memoria**.  
Amplía los ejercicios anteriores añadiendo la gestión de objetos mediante **serialización**.

---

## ⚙️ Estructura del proyecto

```
Exercici5Level1/
 ├── src/
 │    ├── main/
 │    │    └── java/
 │    │         ├── main/
 │    │         │    └── MainApp.java
 │    │         └── model/
 │    │              ├── OrderFilesAZReaderSerial.java
 │    │              └── UserGame.java
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
   cd ~/IdeaProjects/S1.5-Java\ Utils/Level1/Exercici5Level1/src/main/java
   ```

3. **Compilar los archivos fuente (.java):**

   ```bash
   javac main/MainApp.java model/OrderFilesAZReaderSerial.java model/UserGame.java
   ```

   Esto generará los archivos `.class` en sus respectivas carpetas.

4. **Ejecutar el programa principal:**

   ```bash
   java main.MainApp
   ```

---

## 🧩 Menú principal y funcionalidades

Al ejecutar el programa, se muestra un menú como el siguiente:

```
MENU DE GESTION:
0 - Salir
1 - Serializar objeto (guardar en archivo .ser)
2 - Deserializar objeto (leer desde archivo .ser)
```

### 🟦 Opción 1 — Serializar objeto

El programa crea un objeto `UserGame` (por ejemplo, con nombre, edad, puntuación, etc.)  
y lo guarda en un archivo binario `.ser` mediante **ObjectOutputStream**.

Ejemplo:

```
Introduce el nombre del jugador:
Jordi
Introduce la puntuación:
1500

Objeto serializado correctamente en: /Users/jordi/Desktop/userdata.ser
```

---

### 🟩 Opción 2 — Deserializar objeto

El programa lee el archivo `.ser` indicado y muestra el contenido del objeto por consola.  
Ejemplo:

```
Introduce la ruta del archivo .ser que quieres leer:
 /Users/jordi/Desktop/userdata.ser

Datos cargados desde el archivo:
Nombre: Jordi
Puntuación: 1500
```

---

## 💡 Notas adicionales

- El archivo `.ser` almacena los datos del objeto en formato binario.  
- Es necesario que la clase (`UserGame`) implemente la interfaz `Serializable`.  
- Al deserializar, el objeto se reconstruye con los mismos valores que tenía al ser guardado.  
- El programa debe ejecutarse **desde la terminal**, no desde el IDE.

---

## 👨‍💻 Autor

**Jordi Casas**  
Curso Java — Nivel 1, Módulo “Utils”  
Ejercicio 5: Serializar y deserializar objetos Java mediante ficheros `.ser`.
