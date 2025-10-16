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
                    "1- Ordenar archivos de la A a la Z y guardar en archivo de texto.");


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

                    OrderFilesAZWritter.readAddOrderAZWritter(ruta1,ruta2);
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
            System.out.println();
        } while (option != 0);

    }
}
