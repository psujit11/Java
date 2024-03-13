import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class MyRMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099); // default port
            MyRemoteInterface remoteObject = (MyRemoteInterface) registry.lookup("MyRemoteObject");
            String result = remoteObject.sayHello();
            System.out.println("Response from server: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }  } }

