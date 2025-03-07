/**
 * Note:Enhancements to RMI, including support for distributed garbage collection.
 * (This example shows a simple RMI server and client setup.)
 */

import java.rmi.*;
public class _04_improved_rmi_client {
    public static void main(String[] args) {
        try {
            MyRemote obj = (MyRemote) Naming.lookup("//localhost/MyRemote");
            System.out.println(obj.sayHello()); // Output: Hello, Remote World!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
