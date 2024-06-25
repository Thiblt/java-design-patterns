package fr.diginamic.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConfigurationSingletonTest {

    @Test
    public void testSingletonInstance() {
        ConfigurationSingleton instance1 = ConfigurationSingleton.getInstance();
        ConfigurationSingleton instance2 = ConfigurationSingleton.getInstance();
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertEquals(instance1, instance2);
    }

    @Test
    public void testGetProperty() {
        ConfigurationSingleton instance = ConfigurationSingleton.getInstance();
        String dbUrl = instance.getProperty("db.url");
        String dbUser = instance.getProperty("db.user");
        String dbPassword = instance.getProperty("db.password");

        assertEquals("jdbc:mysql://localhost:3306/mabase", dbUrl);
        assertEquals("root", dbUser);
        assertEquals("1234", dbPassword);
    }
}
