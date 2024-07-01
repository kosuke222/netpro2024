package networking.udp;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        try (DatagramSocket serverSocket = new DatagramSocket(9876)) {
            byte[] receiveData = new byte[1024];
            byte[] sendData;

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String received = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + received);

                // 受信したデータを大文字に変換して返信
                String toSend = received.toUpperCase();
                sendData = toSend.getBytes();
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
                System.out.println("Sent: " + toSend);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
