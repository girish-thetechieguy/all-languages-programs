import java.rmi.*;
import java.rmi.server.*;

interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}

public class _04_improved_rmi_server extends UnicastRemoteObject implements MyRemote {
    public _04_improved_rmi_server() throws RemoteException {}

    public String sayHello() {
        return "Hello, Remote World!";
    }

    public static void main(String[] args) {
        try {
            _04_improved_rmi_server obj = new _04_improved_rmi_server();
            Naming.rebind("MyRemote", obj);
            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
