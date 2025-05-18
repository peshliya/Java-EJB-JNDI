package lk.jiat.ee.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        try {
            Properties env = new Properties();
            env.put("org.omg.CORBA.ORBInitialHost", "localhost"); // or 127.0.0.1
            env.put("org.omg.CORBA.ORBInitialPort", "3700");

            InitialContext ic = new InitialContext(env);

            String appName = (String) ic.lookup("AppName");
            System.out.println("App Name: " + appName);
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }

    }
}
