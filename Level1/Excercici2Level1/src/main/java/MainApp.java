import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

      menu();

        }
        public static void menu () {
            int option = -1;

            do {
                System.out.println(" MENU DE GESTION: \n" +
                        "0- Salir.\n" +
                        "1- Ordenar archivos.");


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

                        System.out.println("Ruta introducida: '" + rutaUser + "'");
                        System.out.println();

                        Path ruta2 = Paths.get(rutaUser);
                        OrderFilesAZ.readAddOrderAZ(ruta2);
                        break;
                    default:
                        System.out.println("Opcion incorrecta!");
                }
                System.out.println();
            } while (option != 0);
    }
}

