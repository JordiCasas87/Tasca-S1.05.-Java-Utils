package main;

import model.OrderFilesAZReaderSerial;
import model.UserGame;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {

    public static void main(String[] args) {

        Path ruta = Paths.get("/Users/jcasas87/Desktop/Doc Varios 2025");
        Path ruta2 = Paths.get("/Users/jcasas87/Desktop/Astrofisica.txt");

        OrderFilesAZReaderSerial.readAddOrderAZWritter(ruta);
        OrderFilesAZReaderSerial.fileReader(ruta2);

        //Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.

        UserGame Mario = new UserGame(100,"Mario","Champo World",75);

        OrderFilesAZReaderSerial.serialize(Mario);

        OrderFilesAZReaderSerial.deserialize();





    }

}
