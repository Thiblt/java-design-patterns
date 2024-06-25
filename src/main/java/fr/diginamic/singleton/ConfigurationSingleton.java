package fr.diginamic.singleton;


import java.util.ResourceBundle;

public class ConfigurationSingleton {

    private static ConfigurationSingleton instance= new ConfigurationSingleton();
    private ResourceBundle configuration;

    private ConfigurationSingleton() {
        configuration = ResourceBundle.getBundle("configuration");
    }

    public static synchronized ConfigurationSingleton getInstance() {
        return instance;
    }

    public String getProperty(String key) {
        return configuration.getString(key);
    }

    
}