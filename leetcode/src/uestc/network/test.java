package uestc.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: zhangjin
 * @title: test
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2719:25
 */
public class test {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(9600);
        Socket accept = socket.accept();
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
