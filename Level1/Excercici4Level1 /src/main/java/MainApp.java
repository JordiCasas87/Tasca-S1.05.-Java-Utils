import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {

    public static void main(String[] args) {

        Path ruta = Paths.get("/Users/jcasas87/Desktop/Doc Varios 2025");
        Path ruta2 = Paths.get("/Users/jcasas87/Desktop/Astrofisica.txt");

        OrderFilesAZReader.readAddOrderAZWritter(ruta);
        OrderFilesAZReader.fileReader(ruta2);

    }

}
