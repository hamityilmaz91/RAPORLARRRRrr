package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_reader {




   static Properties properties= new Properties();

static {
    FileInputStream fis = null;
    try {
        fis = new FileInputStream("config.properties");
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    try {
        properties.load(fis);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }







}

public static String getProperty(String string){


    return properties.getProperty(string);

}


}
