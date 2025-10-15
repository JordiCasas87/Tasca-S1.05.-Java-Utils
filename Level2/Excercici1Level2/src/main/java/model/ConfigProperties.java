package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    public static Properties getProperties (){
        Properties myLinks = new Properties();

        try{
            FileInputStream accesToProperties = new FileInputStream("/Users/jcasas87/IdeaProjects/S1.5-Java Utils/Level2/Excercici1Level2/src/main/resources/config.properties");
            myLinks.load(accesToProperties);

        }catch (IOException e){
            System.out.println("Error al acceder al archivo");
        }

        return myLinks;

    }


}
