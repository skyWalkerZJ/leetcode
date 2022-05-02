package uestc.network;



import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author admin
 * @ClassName SynQueel.java
 * @Description TODO
 * @createTime 2022年03月04日 21:34:00
 */
public class SynQueel {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(502);
        Socket accept = socket.accept();

        InetAddress localAddress = accept.getLocalAddress();
        System.out.println(localAddress.getHostName()+" "+localAddress.getHostAddress()+" ");
        for(byte b:localAddress.getAddress())
        {
            System.out.print(b);
        }
        System.out.println();
        SocketAddress remoteSocketAddress = accept.getRemoteSocketAddress();
        System.out.println("remoteSocketAddress"+remoteSocketAddress);
        int localPort = accept.getLocalPort();
        System.out.println("localport"+localPort);

        InputStream inputStream = accept.getInputStream();
        byte temp[]=new byte[1024];
        int len=0;
        while((len=inputStream.read(temp))!=-1){
            for (int i = 0; i < len; i++) {
                System.out.print(temp[i]);
            }
        }
    }
}
