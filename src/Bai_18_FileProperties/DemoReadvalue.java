package Bai_18_FileProperties;
import Bai_18_FileProperties.helpers.PropertiesHelper;


public class DemoReadvalue {
    public static void main(String[] args) {
        PropertiesHelper.loadAllFiles();

        System.out.println("BROWSER: " + PropertiesHelper.getValue("browser"));
        System.out.println("URL: " + PropertiesHelper.getValue("url"));
        System.out.println("EMAIL: " + PropertiesHelper.getValue("email"));
        System.out.println("PASSWORD: " + PropertiesHelper.getValue("password"));
        System.out.println("AUTHOR: " + PropertiesHelper.getValue("Author:"));
    }
}
