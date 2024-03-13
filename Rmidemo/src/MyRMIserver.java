import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class MyRMIserver {
    public static void main(String[] args) {
        try {
            MyRemoteObject remoteObject = new MyRemoteObject();
            Registry registry = LocateRegistry.createRegistry(1099); // default port
            registry.bind("MyRemoteObject", remoteObject);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
