import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckLocalAddress {
    public static void main(String[] args) {
        try {
            // ローカルホストのIPアドレスを取得
            InetAddress localHost = InetAddress.getLocalHost();
            
            // ホスト名を取得
            String hostName = localHost.getHostName();
            System.out.println("Host name is: " + hostName);
            
            // ホストアドレスを取得
            String hostAddress = localHost.getHostAddress();
            System.out.println("IP address is: " + hostAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
