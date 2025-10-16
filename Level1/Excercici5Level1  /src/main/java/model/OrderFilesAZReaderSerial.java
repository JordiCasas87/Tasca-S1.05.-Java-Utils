package model;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OrderFilesAZReaderSerial {

    static ArrayList<String> lines = new ArrayList<>();

    public static void readAddOrderAZWritter(Path ruta1 ,Path ruta2) {

        Path pathFileWritte = ruta2;
        ArrayList<Path> firstOrder = new ArrayList<>();

        try (DirectoryStream<Path> content = Files.newDirectoryStream(ruta1)) {
            for (Path actualFile : content) {
                firstOrder.add(actualFile);
            }
            firstOrder.sort(null);

            for (Path actualFile : firstOrder) {
                if (Files.isRegularFile(actualFile)) {
                    String line = "       "+ actualFile.getFileName() + "--- " + Files.getLastModifiedTime(actualFile) + " <-F->";
                    lines.add(line);


                } else if (Files.isDirectory(actualFile)) {
                    String line = actualFile.getFileName() + "---" + Files.getLastModifiedTime(actualFile) + " <-D->";
                    lines.add(line);

                    readAddOrderAZWritter(actualFile, ruta2);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer la carpeta." + e.getMessage());
        }

        try {
            Files.write(pathFileWritte, lines);
        } catch (IOException e) {
            System.out.println("Error de escritura " + e.getMessage());
        }
    }


    public static void fileReader ( Path path){
        try {
            List<String> linesFile = Files.readAllLines(path);
            for (String lines : linesFile){
                System.out.println(lines);
            }

        }catch (IOException e){
            System.out.println("Error de lectura del archivo de texto" + e.getMessage());
        }
    }

    public static void serialize(UserGame user, Path ruta4) {
        try (FileOutputStream fileToSerial = new FileOutputStream (ruta4.toFile());
             ObjectOutputStream fileToSerialOut = new ObjectOutputStream(fileToSerial)) {

            fileToSerialOut.writeObject(user);
            System.out.println("Objeto serializado correctamente");

        } catch (IOException e) {
            System.out.println("Error al serializar " + e.getMessage());
        }

    }

    public static void deserialize(Path ruta4) {
        try (FileInputStream fileIn = new FileInputStream(ruta4.toFile());
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)){

            UserGame userDeserialized = (UserGame) objectIn.readObject();
            System.out.println("objeto des serializado correctamente");
            // check de que deserialize.
            System.out.println(userDeserialized);


        } catch (IOException  | ClassNotFoundException e) {
            System.out.println("Error en des serializar " + e.getMessage());
        }


    }

}
