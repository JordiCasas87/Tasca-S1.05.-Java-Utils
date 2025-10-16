package model;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

    public class OrderFilesAZWritter {

        static ArrayList<String> lines = new ArrayList<>();

        public static void readAddOrderAZWritter(Path inputDirectory, Path outputWritteFile) {

            ArrayList<Path> firstOrder = new ArrayList<>();

            try (DirectoryStream<Path> content = Files.newDirectoryStream(inputDirectory)) {
                for (Path actualFile : content) {
                    firstOrder.add(actualFile);
                }
                firstOrder.sort(null);

                for (Path actualFile : firstOrder) {
                    if (Files.isRegularFile(actualFile)) {
                        String line = actualFile.getFileName() + "--- " + Files.getLastModifiedTime(actualFile) + " <-F->";
                        lines.add(line);


                    } else if (Files.isDirectory(actualFile)) {
                        String line = "     "+ actualFile.getFileName() + "---" + Files.getLastModifiedTime(actualFile) + " <-D->";
                        lines.add(line);

                        readAddOrderAZWritter(actualFile, outputWritteFile);
                    }
                }

            } catch (IOException e) {
                System.out.println("Error al leer la carpeta." + e.getMessage());
            }

            try {
                Files.write(outputWritteFile, lines);
            } catch (IOException e) {
                System.out.println("Error de escritura " + e.getMessage());
            }
        }

    }

