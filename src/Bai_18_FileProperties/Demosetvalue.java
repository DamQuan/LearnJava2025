package Bai_18_FileProperties;
import Bai_18_FileProperties.helpers.PropertiesHelper;

public class Demosetvalue {
    public static void main(String[] args) {
        PropertiesHelper.setFile("src/Bai_18_FileProperties/local.properties");

        PropertiesHelper.setValue("Author:", "Dam");
        PropertiesHelper.setValue("Message:", "Hello");
        PropertiesHelper.getValue("Author");
    }
}
