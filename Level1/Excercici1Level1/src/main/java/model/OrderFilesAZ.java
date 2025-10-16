package model;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class OrderFilesAZ {

    public OrderFilesAZ() {
    }

    public static void readAndOrder(Path ruta) {

        try (DirectoryStream<Path> content = Files.newDirectoryStream(ruta)) {
            ArrayList<Path> orderfiles = new ArrayList<>();

            for (Path actualFile : content) {
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




