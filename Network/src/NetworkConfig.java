import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.InetAddress;
import java.util.Enumeration;

public class NetworkConfig {

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    displayInterfaceInfo(networkInterface);
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private static void displayInterfaceInfo(NetworkInterface networkInterface) throws SocketException {
        System.out.println("Display name: " + networkInterface.getDisplayName());
        System.out.println("Name: " + networkInterface.getName());
        System.out.println("Index: " + networkInterface.getIndex());
        System.out.println("MTU: " + networkInterface.getMTU());
        System.out.println("Hardware address: " + networkInterface.getHardwareAddress());
        System.out.println("Is loopback: " + networkInterface.isLoopback());
        System.out.println("Is point-to-point: " + networkInterface.isPointToPoint());
        System.out.println("Is up: " + networkInterface.isUp());
        System.out.println("Is virtual: " + networkInterface.isVirtual());
        System.out.println("Supports multicast: " + networkInterface.supportsMulticast());
        System.out.println("IP addresses:");
        Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
        while (addresses.hasMoreElements()) {
            InetAddress address = addresses.nextElement();
            System.out.println(" " + address);
        }
        System.out.println("-------------------------------------------------");
    }
}
