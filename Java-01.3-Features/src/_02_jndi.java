/**
 * Note : JNDI provides a unified interface for accessing different naming and directory services.
 */

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class _02_jndi {
    public static void main(String[] args) {
        try {
            // Create an initial context
            Context ctx = new InitialContext();
            System.out.println("JNDI Initial Context created.");
            // Lookup an object (this is just a placeholder)
            // Object obj = ctx.lookup("java:comp/env/myResource");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
