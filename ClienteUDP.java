import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClienteUDP {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("10.0.0.2");

        String msg = input.nextLine();
        byte[] buf = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 12000);
        socket.send(packet);

        socket.close();
        input.close();
    }

}
