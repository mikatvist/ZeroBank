package com.zerobank.utilities;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigurationReader {
//read information from configuration properties
    private static final Properties properties = new Properties();
    static {
        try (FileInputStream in = new FileInputStream("configuration.properties")) {  //change InputStream first word
            properties.load(in);
        } catch (Exception e) {//
            e.printStackTrace();//show as information
            System.out.println("Failed to load properties file");
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}






