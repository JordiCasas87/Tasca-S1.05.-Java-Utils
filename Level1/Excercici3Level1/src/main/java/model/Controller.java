package model;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Controller {
static Scanner sc = new Scanner(System.in);

    public static void fileOrder (){
        System.out.println("Introduce la ruta de la carpeta que quieres ordenar: ");
        String rutaUser = sc.nextLine();

        if (rutaUser.startsWith("\"") && rutaUser.endsWith("\"")) {
            rutaUser = rutaUser.substring(1, rutaUser.length() - 1);
        } else if (rutaUser.startsWith("'") && rutaUser.endsWith("'")) {
            rutaUser = rutaUser.substring(1, rutaUser.length() - 1);
        }

        System.out.println("Introduce la ruta de la carpeta con el archivo donde quieres guardar: ");
        String rutaUserWrite = sc.nextLine();

        if (rutaUserWrite.startsWith("\"") && rutaUserWrite.endsWith("\"")) {
            rutaUserWrite = rutaUserWrite.substring(1, rutaUserWrite.length() - 1);
        } else if (rutaUserWrite.startsWith("'") && rutaUserWrite.endsWith("'")) {
            rutaUserWrite = rutaUserWrite.substring(1, rutaUserWrite.length() - 1);
        } else if (!rutaUserWrite.endsWith(".txt")) {
            System.out.println("Debes de guardar en un archivo .txt");
            return;

        }

        System.out.println("Ruta introducida: '" + rutaUser + "'");
        System.out.println("Ruta salida introducida: '" + rutaUserWrite + "'");
        System.out.println();

        Path ruta1 = Paths.get(rutaUser);
        Path ruta2 = Paths.get(rutaUserWrite);

        OrderFilesAZWritter.readAddOrderAZWritter(ruta1,ruta2);

    }


}
