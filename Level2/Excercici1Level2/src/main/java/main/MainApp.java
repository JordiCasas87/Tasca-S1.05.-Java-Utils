package main;

import model.ConfigProperties;
import model.OrderFilesAZWritter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class MainApp {

    public static void main(String[] args) {

        Properties myLinks = ConfigProperties.getProperties();

        Path inputDirectory = Paths.get(myLinks.getProperty("input.directory"));
        Path outputwritteFile = Paths.get(myLinks.getProperty("output.file"));

        OrderFilesAZWritter.readAddOrderAZWritter(inputDirectory,outputwritteFile);


        }
    }



