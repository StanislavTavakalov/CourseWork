package by.bntu.fitr.povt.jit.coursework.resource;

import java.util.ResourceBundle;

public class ConfigurationManager {

    private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.config");

    private ConfigurationManager() {
    }

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
