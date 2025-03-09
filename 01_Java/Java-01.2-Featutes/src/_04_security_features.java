/**
 * WHY : Allowing developers to create applications with more robust security policies.
 */


public class _04_security_features {
    public static void main(String[] args) {
        try {
            // Create a security manager
            System.setSecurityManager(new SecurityManager());
            System.out.println("Security Manager set up.");

            // Check for a specific permission
            SecurityManager sm = System.getSecurityManager();
            sm.checkRead("test.txt"); // Replace with an actual file path
            System.out.println("Read permission granted.");
        } catch (SecurityException e) {
            System.out.println("Read permission denied.");
        }
    }
}
