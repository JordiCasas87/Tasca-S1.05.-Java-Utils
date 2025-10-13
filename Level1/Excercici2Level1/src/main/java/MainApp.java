import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {

    public static void main(String[] args) {

        Path ruta = Paths.get("/Users/jcasas87/Desktop/Doc Varios 2025");

        OrderFilesAZ.readAddOrderAZ(ruta);

    }

}
