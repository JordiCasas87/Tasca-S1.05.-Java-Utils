

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


    public class OrderFilesAZ {

        static ArrayList <Path> totalList = new ArrayList<>();

        public static void readAndAdd(Path ruta1) {

            try (DirectoryStream<Path> content = Files.newDirectoryStream(ruta1)) {

                for (Path actualFile : content) {
                    if (Files.isRegularFile(actualFile)) {
                        totalList.add(actualFile);

                    } else if (Files.isDirectory(actualFile)) {
                        totalList.add(actualFile);
                        readAndAdd(actualFile);
                    }
                }

            } catch (IOException e) {
                System.out.println("Error al leer la carpeta." + e.getMessage());
            }
        }


        public static void readAndOrder (){
            try {
                System.out.println("\nOrder A to Z \n");
                totalList.sort(null);

                for (Path order : totalList) {
                    if (Files.isRegularFile(order)) {
                        System.out.println(order.getFileName() + "--- " + Files.getLastModifiedTime(order) + " <-F->");
                    } else if (Files.isDirectory(order)) {
                        System.out.println(order.getFileName() + "---"+  Files.getLastModifiedTime(order) + " <-D->");
                    }

                }
                System.out.println("El tamaño es: " + totalList.size());
            }catch (IOException e){
                System.out.println("Error" + e.getMessage());
            }
        }

    }







