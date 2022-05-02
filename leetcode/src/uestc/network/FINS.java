package uestc.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: zhangjin
 * @title: FINS
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2719:18
 */
public class FINS {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket=new Socket("127.0.0.1",9600);
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes=new byte[24];
        bytes[0]=0x46;
        bytes[1]=0x49;
        bytes[2]=0x4e;
        bytes[3]=0x53;

        bytes[4]=0x00;
        bytes[5]=0x00;
        bytes[6]=0x00;
        bytes[7]=0x10;

        bytes[8]=0x00;
        bytes[9]=0x00;
        bytes[10]=0x00;
        bytes[11]=0x01;

        bytes[12]=0x00;
        bytes[13]=0x00;
        bytes[14]=0x00;
        bytes[15]=0x00;

        bytes[16]= (byte) 0x00;
        bytes[17]=0x00;
        bytes[18]=0x00;
        bytes[19]=0x03;

        bytes[20]=0x00;
        bytes[21]=0x00;
        bytes[22]=0x00;
        bytes[23]= (byte) 0x28;
        outputStream.write(bytes);
        Thread.sleep(1000);
        outputStream.close();
    }

}
