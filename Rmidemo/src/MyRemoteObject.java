import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface {
    public MyRemoteObject() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello, This is Rmi hehehehehahahahah";
    }
}
