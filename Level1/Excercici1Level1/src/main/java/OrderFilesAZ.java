import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class OrderFilesAZ {

    /*- Exercici 1
Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
    */

    public OrderFilesAZ() {
    }


    public static void readAndOrder(Path ruta1) {

        try (DirectoryStream<Path> content = Files.newDirectoryStream(ruta1)) {
            ArrayList<Path> orderfiles = new ArrayList<>();

            for (Path actualFile : content) {
                System.out.println(actualFile.getFileName());
                orderfiles.add(actualFile);
            }
            System.out.println("\nOrder a to Z \n");
            orderfiles.sort(null);

            for (Path order : orderfiles){
                System.out.println(order.getFileName());
            }

        } catch (IOException e) {

            System.out.println("Error al leer la carpeta." + e.getMessage());
        }
    }

    }




