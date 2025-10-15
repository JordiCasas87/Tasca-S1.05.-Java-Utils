import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    public static Properties getProperties (){
        Properties misDirecciones = new Properties();

        try{
            FileInputStream accesoAPropiedades = new FileInputStream("/Users/jcasas87/IdeaProjects/S1.5-Java Utils/Level2/Excercici1Level2/src/main/resources/config.properties");
            misDirecciones.load(accesoAPropiedades);
            //String rutaDirectorio = misDirecciones.getProperty("input.directory");
            //String rutaArchivoTexto = misDirecciones.getProperty("output.file");
        }catch (IOException e){
            System.out.println("Error al accder al archivo");
        }

        return misDirecciones;

    }


}
