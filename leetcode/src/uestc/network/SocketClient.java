package uestc.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author admin
 * @ClassName SocketCilent.java
 * @Description TODO
 * @createTime 2022年03月04日 21:43:00
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",502);
        OutputStream outputStream = socket.getOutputStream();
        //byte[] bytes=new byte[]{(byte) 0xff,(byte) 0xff,(byte) 0xff,(byte) 0xff,(byte) 0xff, (byte)255};
        byte[] bytes=new byte[12];

        /*bytes[0]=(byte)0x97;
        bytes[1]=(byte)0x96;
        bytes[2]=(byte)0x00;
        bytes[3]=(byte)0x00;
        bytes[4]=(byte)0x00;
        bytes[5]=(byte)0x06;
        bytes[6]=(byte)0x01;
        bytes[7]=(byte)0x01;
        bytes[8]=(byte)0x00;
        bytes[9]=(byte)0x02;
        bytes[10]=(byte)0x00;
        bytes[11]=(byte)0x08;*/
        outputStream.write(bytes);
        socket.close();
    }
}
