import model.Controller;
import model.OrderFilesAZWritter;

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
                    OrderFilesAZWritter.getLines().clear();
                   Controller.fileOrder();
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
            System.out.println();
        } while (option != 0);

    }

}
