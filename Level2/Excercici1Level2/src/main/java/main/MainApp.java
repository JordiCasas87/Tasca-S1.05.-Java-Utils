package main;

import model.ConfigProperties;
import model.OrderFilesAZWritter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        menu();

    }
    public static void menu() {
        int option = -1;

        do {
            System.out.println(" MENU DE GESTION: \n" +
                    "0- Salir.\n" +
                    "1- Ordenar archivos de la A a la Z y guardar en archivo de texto.");


            option = sc.nextInt();
            sc.nextLine();


            switch (option) {

                case 0:
                    System.out.println("Adios!");
                    break;
                case 1:
                    Properties myLinks = ConfigProperties.getProperties();
                    Path inputDirectory = Paths.get(myLinks.getProperty("input.directory"));
                    Path outputwritteFile = Paths.get(myLinks.getProperty("output.file"));

                    OrderFilesAZWritter.readAddOrderAZWritter(inputDirectory, outputwritteFile);
                    System.out.println("Guardado en archivo correctamente!");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
            System.out.println();
        } while (option != 0);

    }

        }




