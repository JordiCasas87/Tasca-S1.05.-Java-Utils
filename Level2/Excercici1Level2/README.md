# 🧾 Proyecto: Parametrizar lectura y escritura con Properties — Exercici 1 (Level 2)

Este programa **lee las rutas desde un archivo de configuración** `config.properties` y ejecuta la opción de **listar un directorio recursivamente** y **guardar el resultado en un `.txt`**.  
A diferencia de ejercicios previos, **no se piden rutas por consola**: se toman del `.properties`.

---

## ⚙️ Estructura sugerida del proyecto

```
Level2/Excercici1Level2/
 ├── src/
 │   ├── main/
 │   │   ├── java/
 │   │   │   ├── main/
 │   │   │   │   └── MainApp.java
 │   │   │   └── model/
 │   │   │       ├── ConfigProperties.java
 │   │   │       └── OrderFilesAZWritter.java
 │   │   └── resources/
 │   │       └── config.properties
 ├── pom.xml (si usas Maven)
 └── target/
```

> Si tu estructura es distinta, ajusta las rutas de compilación/ejecución y la ubicación del `config.properties`.

---

## 🧭 Requisitos previos

- **Java 17 o superior** instalado.
- Verificar comandos en terminal:
  ```bash
  java -version
  javac -version
  ```

---

## 🗂️ Archivo de configuración `config.properties` (debe editarse)

Edita `src/main/resources/config.properties` y pon **rutas válidas en tu equipo**:

```properties
# Carpeta que se listará recursivamente
input.directory=/Users/tu_usuario/Desktop/MiCarpeta

# Ruta (incluye nombre de archivo) donde guardar el resultado .txt
output.file=/Users/tu_usuario/Desktop/listado.txt
```

**Notas importantes:**
- Las rutas son **específicas de cada máquina**. Si otra persona ejecuta el programa, tendrá que **editar este archivo** con sus rutas.
- En macOS/Linux, si ejecutas comandos con rutas que incluyen espacios, usa **comillas** o **escapes** (por ejemplo `Java\ Utils`).

---

## 🛠️ También debes editar `ConfigProperties.java` (importante)

Tu clase actual usa una **ruta absoluta** para abrir el `config.properties`:

```java
// Versión con ruta absoluta (tu código actual)
FileInputStream accesToProperties = new FileInputStream(
    "/Users/jcasas87/IdeaProjects/S1.5-Java Utils/Level2/Excercici1Level2/src/main/resources/config.properties"
);
```

Debes **cambiar esa ruta** para que apunte a **dónde esté realmente tu `config.properties`** en tu equipo.  
Si lo mueves a otra carpeta o si otra persona clona tu proyecto, esta ruta deberá actualizarse.

### ✅ Opción recomendada (sin rutas absolutas)
Cargar el `config.properties` **desde el classpath** (carpeta `src/main/resources`) evita tener que tocar rutas por máquina:

```java
// Reemplaza el FileInputStream por esta versión basada en classpath
try (InputStream in = ConfigProperties.class.getClassLoader()
        .getResourceAsStream("config.properties")) {

    if (in == null) {
        throw new FileNotFoundException("No se encontró config.properties en el classpath");
    }
    Properties myLinks = new Properties();
    myLinks.load(in);
    return myLinks;

} catch (IOException e) {
    System.out.println("Error al cargar configuración: " + e.getMessage());
    return new Properties();
}
```

> Con esta opción, **no hay que poner rutas absolutas en el código**: basta con que el archivo esté en `src/main/resources/config.properties` al compilar/ejecutar.
>
> Si prefieres mantener la versión con `FileInputStream`, **recuerda actualizar la ruta absoluta** cada vez que cambie la ubicación del proyecto.

---

## 🏁 Compilar y ejecutar desde la terminal (sin Maven)

Sitúate en la carpeta `src/main/java` y compila **todas las clases** (ajusta la ruta a tu caso):

```bash
cd ~/IdeaProjects/S1.5-Java\ Utils/Level2/Excercici1Level2/src/main/java

javac main/MainApp.java model/OrderFilesAZWritter.java model/ConfigProperties.java
```

Ejecuta el programa principal:

```bash
java main.MainApp
```

> Si usas la **opción recomendada de classpath**, asegúrate de que el `config.properties` esté disponible en el classpath.  
> En un proyecto sencillo sin empaquetado, puedes ejecutar desde la raíz del proyecto añadiendo `-cp` con `src/main/java:src/main/resources` en macOS/Linux:
>
> ```bash
> cd ~/IdeaProjects/S1.5-Java\ Utils/Level2/Excercici1Level2
> javac -cp src/main/java src/main/java/main/MainApp.java src/main/java/model/*.java
> java -cp src/main/java:src/main/resources main.MainApp
> ```
>
> En Windows, separa rutas con `;` en lugar de `:`:
> ```bat
> java -cp src\main\java;src\mainesources main.MainApp
> ```

---

## 🧩 Uso (menú)

Al ejecutar:

```
MENU DE GESTION:
0 - Salir
1 - Ordenar archivos de la A a la Z y guardar en archivo de texto.
```

La opción `1` **lee las rutas de `config.properties`** y genera el `.txt` indicado.

---

## 📄 Ejemplo de salida (contenido del TXT)

```
📁 Documents --- Última modificación: 2025-10-16T23:01:45Z <-D->
   Apuntes.txt --- Última modificación: 2025-10-16T23:03:10Z <-F->
   Libros --- Última modificación: 2025-10-16T23:04:22Z <-D->
      Java.pdf --- Última modificación: 2025-10-16T23:05:02Z <-F->
README.md --- Última modificación: 2025-10-16T23:06:30Z <-F->
```

---

## ✅ Checklist rápido

- [ ] He **editado `src/main/resources/config.properties`** con mis rutas.
- [ ] Si mantengo `FileInputStream` en `ConfigProperties.java`, **he actualizado la ruta absoluta**.
- [ ] Preferiblemente, he migrado `ConfigProperties.java` a **carga por classpath** para no depender de rutas absolutas.
- [ ] Compilo y ejecuto desde terminal con el **classpath** correcto si uso recursos.

---

## 👨‍💻 Autor

**Jordi Casas**  
Curso Java — Nivel 1, Módulo “Utils”  
Exercici 1 (Level 2): Parametrización con `config.properties`.
