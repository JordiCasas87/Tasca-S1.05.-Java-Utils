
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


    public class OrderFilesAZ {

        public static void readAddOrderAZ(Path ruta) {

            ArrayList <Path> firstOrder = new ArrayList<>();

            try (DirectoryStream<Path> content = Files.newDirectoryStream(ruta)) {
                for (Path actualFile : content){
                    firstOrder.add(actualFile);
                }
                firstOrder.sort(null);

                for (Path actualFile : firstOrder) {

                    if (Files.isRegularFile(actualFile)) {
                        System.out.println("      "+actualFile.getFileName() + "--- " + Files.getLastModifiedTime(actualFile) + " <-F->");


                    } else if (Files.isDirectory(actualFile)) {
                        System.out.println("" + actualFile.getFileName() + "---" + Files.getLastModifiedTime(actualFile) + " <-D->");

                        readAddOrderAZ(actualFile);
                    }
                }

            } catch (IOException e) {
                System.out.println("Error al leer la carpeta." + e.getMessage());
            }
        }

    }







