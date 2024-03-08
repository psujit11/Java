import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class NetworkConfiguration {
    public static void main(String[] args) {
        try {
            // Get the local host's IP address
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("IP Address: " + localHost.getHostAddress());

            // Get the MAC address (Media Access Control) of the first network interface
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
            byte[] macBytes = networkInterface.getHardwareAddress();
            StringBuilder macAddress = new StringBuilder();
            for (byte b : macBytes) {
                macAddress.append(String.format("%02X:", b));
            }
            if (macAddress.length() > 0) {
                macAddress.deleteCharAt(macAddress.length() - 1);
                System.out.println("MAC Address: " + macAddress);
            } else {
                System.out.println("MAC Address not available.");
            }

            // Display the name and display name of the network interface
            System.out.println("Name: " + networkInterface.getName());
            System.out.println("Display Name: " + networkInterface.getDisplayName());

            // Check if the network interface is virtual
            System.out.println("Is virtual: " + networkInterface.isVirtual());

            // Check if the network interface supports multicast
            System.out.println("Supports multicast: " + networkInterface.supportsMulticast());

        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        }
    }
}
