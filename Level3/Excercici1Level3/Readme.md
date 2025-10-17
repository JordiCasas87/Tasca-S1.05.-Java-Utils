# Ejercicio 1 - Nivel 3: Config

## Descripción
Este ejercicio forma parte del nivel 3 del módulo **Java Utils**.  
El objetivo es aprender a **utilizar una clase de configuración (`Config`)** para leer información desde un archivo `.properties` y usar esos valores dentro del programa.

El programa carga datos de configuración (como rutas de archivos o claves) desde un fichero externo y los usa en las clases `AppMain` y `EncryptClass`.

---

## Estructura del proyecto

```
Exercici1Level3/
│
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── main/
│   │   │   │   └── AppMain.java
│   │   │   └── model/
│   │   │       └── EncryptClass.java
│   │   └── resources/
│   │       └── config.properties
│   └── test/
│       └── java/
│
├── pom.xml
└── .gitignore
```

---

## Funcionamiento
1. El programa **lee los valores del archivo `config.properties`** mediante la clase `Config`.
2. Esos valores se utilizan para definir rutas, nombres de archivo o parámetros de ejecución.
3. La clase `EncryptClass` se encarga de realizar operaciones (como cifrar o descifrar) usando la información del archivo de configuración.
4. `AppMain` actúa como clase principal y gestiona el flujo del programa.

---

## ⚠️ Configuración de rutas

El archivo `config.properties` contiene **rutas que dependen de cada usuario**.  
Por eso, **debes modificar las rutas con las tuyas propias antes de ejecutar el programa**.

Puedes hacerlo de dos formas:

### 1. Usando rutas absolutas
Por ejemplo:
```
input.path=/Users/jordi/Desktop/entrada.txt
output.path=/Users/jordi/Desktop/salida.txt
```
Estas rutas indican la ubicación exacta en tu sistema de archivos.

### 2. Usando rutas relativas
Por ejemplo:
```
input.path=src/resources/entrada.txt
output.path=src/resources/salida.txt
```
Estas rutas son relativas al proyecto y funcionan si los archivos están dentro de la carpeta `src/resources`.

---

## Ejemplo de archivo `config.properties`

```
input.path=/Users/tu_usuario/Documents/entrada.txt
output.path=/Users/tu_usuario/Documents/salida.txt
encryption.key=MiClaveSegura123
```

---

## Ejecución

1. Abre el proyecto en **IntelliJ IDEA** (u otro IDE).
2. Edita el archivo `config.properties` con tus rutas locales.
3. Ejecuta la clase `AppMain`.
4. El programa leerá la configuración y mostrará el resultado de las operaciones por consola.

---

## Dependencias

Este proyecto usa **Maven**, por lo que las dependencias necesarias se gestionan automáticamente mediante el archivo `pom.xml`.

---

## Autor
Ejercicio desarrollado por **Jordi** para el nivel 3 de *Java Utils*.
