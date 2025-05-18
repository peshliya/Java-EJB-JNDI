package lk.jiat.ee.client;

import lk.jiat.ee.webapp.remote.UserDetails;

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

            UserDetails userDetails = (UserDetails) ic.lookup("lk.jiat.ee.webapp.remote.UserDetails");
            System.out.println(userDetails.getName());

            ic.rebind("AppName", "JIAT Client Application");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }

    }

}
