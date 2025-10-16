# 🧾 Proyecto: Ordenar archivos — Exercici 1 (Java Utils)

Este programa permite **listar y ordenar alfabéticamente** los archivos de una carpeta elegida por el usuario.  
Se ejecuta **desde la terminal del sistema**, mostrando un menú sencillo con opciones de gestión.

---

## ⚙️ Estructura del proyecto

```
src/
 └── main/
      └── java/
           ├── main/
           │    └── MainApp.java
           └── model/
                └── OrderFilesAZ.java
```

---

## 🧭 Requisitos previos

- Tener **Java 17 o superior** instalado.  
- Comprobar que los comandos `java` y `javac` funcionan correctamente en la terminal:  

  ```bash
  java -version
  javac -version
  ```

---

## 🏁 Instrucciones para compilar y ejecutar

1. **Abrir la terminal** (en macOS/Linux) o el símbolo del sistema (en Windows).

2. **Navegar hasta la carpeta del código fuente.**  
   Por ejemplo:

   ```bash
   cd ~/IdeaProjects/S1.5-Java\ Utils/src/main/java
   ```

   *(El carácter `\` sirve para escapar el espacio entre “Java” y “Utils” en macOS/Linux.)*

3. **Compilar los archivos fuente (.java) para generar los archivos bytecode (.class):**

   ```bash
   javac main/MainApp.java model/OrderFilesAZ.java
   ```

4. **Ejecutar el programa principal:**

   ```bash
   java main.MainApp
   ```

---

## 🧩 Ejemplo de ejecución

Salida esperada al iniciar:

```
MENU DE GESTION:
0 - Salir
1 - Ordenar archivos
```

Si se elige la opción `1`, el programa pedirá una ruta:

```
Introduce la ruta de la carpeta que quieres ordenar:
```

👉 Aquí el usuario debe **copiar y pegar la ruta completa de la carpeta que quiera ordenar**, por ejemplo:

```
/Users/tu_usuario/Desktop/MiCarpeta
```

---

## 📄 Ejemplo de salida del programa

```
Archivos en la carpeta (sin ordenar):

notas.txt
imagen.png
resumen.pdf

Archivos ordenados de la A a la Z:

imagen.png
notas.txt
resumen.pdf
```

---

## 💡 Notas adicionales

- No hace falta recompilar cada vez, solo si se cambia el código fuente.  
- El programa solo ordena los archivos del directorio indicado, no las subcarpetas.  
- Funciona en cualquier sistema operativo con Java instalado.

---

## 👨‍💻 Autor

**Jordi Casas**  
Curso Java — Nivel 1, Módulo “Utils”  
Probado y ejecutado correctamente desde la terminal del sistema.
