import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class MainApp {

    /*
    - Exercici 1
Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració.
Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.
De l'exercici anterior, parametritza el següent:
1 Directori a llegir.      2- Nom i directori del fitxer TXT resultant.
     */


    public static void main(String[] args) {

        Properties misAccesosEnPropiedades = ConfigProperties.getProperties();

        Path rutaDirectorio = Paths.get(misAccesosEnPropiedades.getProperty("input.directory"));
        Path rutaEscrituraArchivo = Paths.get(misAccesosEnPropiedades.getProperty("output.file"));

        OrderFilesAZWritter.readAddOrderAZWritter(rutaDirectorio,rutaEscrituraArchivo);


        }

    }



