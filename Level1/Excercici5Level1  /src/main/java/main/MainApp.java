package main;

import model.OrderFilesAZReaderSerial;
import model.UserGame;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        int option = -1;
        do {
            System.out.println(" MENU DE GESTION: \n" +
                    "0- Salir.\n" +
                    "1- Ordenar archivos de la A a la Z y guardar en archivo de texto.\n" +
                    "2- Leer archivo.\n" +
                    "3- Serializar objeto UserGame.\n" +
                    "4- Deserializar objeto UserGame.");


            option = sc.nextInt();
            sc.nextLine();


            switch (option) {

                case 0:
                    System.out.println("Adios!");
                    break;
                case 1:
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
                    }

                    System.out.println("Ruta introducida: '" + rutaUser + "'");
                    System.out.println("Ruta salida introducida: '" + rutaUserWrite + "'");
                    System.out.println();

                    Path ruta1 = Paths.get(rutaUser);
                    Path ruta2 = Paths.get(rutaUserWrite);

                    OrderFilesAZReaderSerial.readAddOrderAZWritter(ruta1, ruta2);
                    break;
                case 2:
                    System.out.println("Introduce la ruta de la carpeta con el archivo que quieres leer: ");
                    String rutaUserRead = sc.nextLine();

                    if (rutaUserRead.startsWith("\"") && rutaUserRead.endsWith("\"")) {
                        rutaUserRead = rutaUserRead.substring(1, rutaUserRead.length() - 1);
                    } else if (rutaUserRead.startsWith("'") && rutaUserRead.endsWith("'")) {
                        rutaUserRead = rutaUserRead.substring(1, rutaUserRead.length() - 1);
                    }
                    Path ruta3 = Paths.get(rutaUserRead);
                    System.out.println("Ruta salida introducida: '" + rutaUserRead + "'");

                    OrderFilesAZReaderSerial.fileReader(ruta3);
                    break;
                case 3:
                    System.out.println("Introduce la ruta de la carpeta con el archivo donde quieres guardar la serializacion: ");
                    String rutaUserWriteSerial = sc.nextLine();

                    if (rutaUserWriteSerial.startsWith("\"") && rutaUserWriteSerial.endsWith("\"")) {
                        rutaUserWriteSerial = rutaUserWriteSerial.substring(1, rutaUserWriteSerial.length() - 1);
                    } else if (rutaUserWriteSerial.startsWith("'") && rutaUserWriteSerial.endsWith("'")) {
                        rutaUserWriteSerial = rutaUserWriteSerial.substring(1, rutaUserWriteSerial.length() - 1);
                    }
                    Path ruta4 = Paths.get(rutaUserWriteSerial);

                    OrderFilesAZReaderSerial.serialize(new UserGame(100,"MArio","Earth",80), ruta4);
                    break;
                case 4:
                    System.out.println("Introduce la ruta de la carpeta con el archivo donde quieres Deserializar: ");
                    String rutaUserWriteDesSerial = sc.nextLine();

                    if (rutaUserWriteDesSerial.startsWith("\"") && rutaUserWriteDesSerial.endsWith("\"")) {
                        rutaUserWriteDesSerial = rutaUserWriteDesSerial.substring(1, rutaUserWriteDesSerial.length() - 1);
                    } else if (rutaUserWriteDesSerial.startsWith("'") && rutaUserWriteDesSerial.endsWith("'")) {
                        rutaUserWriteDesSerial = rutaUserWriteDesSerial.substring(1, rutaUserWriteDesSerial.length() - 1);
                    }
                    Path ruta5 = Paths.get(rutaUserWriteDesSerial);
                    OrderFilesAZReaderSerial.deserialize(ruta5);
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
            System.out.println();
        } while (option != 0);
    }


}
