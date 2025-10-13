import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {

    public static void main(String[] args) {

        Path ruta1 = Paths.get("/Users/jcasas87/Desktop/RESUMEN GIT CURSO");
        OrderFilesAZ.readAndOrder(ruta1);

    }
}
