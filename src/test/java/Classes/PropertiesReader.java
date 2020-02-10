package Classes;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    public static String getPropertyValue(String propertyFile, String propertyName) {

        String resourceName = "Properties/" + propertyFile + ".properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        String propertyValue = null;

        try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
            props.load(resourceStream);
        } catch (IOException e) {
            System.out.println("Error, cannot read property file. Is the file exists?");
        }

        propertyValue = props.getProperty(propertyName);
        if (propertyValue == null) {
            throw new RuntimeException("Error, cannot read property. Is property \"" + propertyName + "\" exists in \""+propertyFile+".properties\"?");
        }

        return propertyValue;
    }
}
