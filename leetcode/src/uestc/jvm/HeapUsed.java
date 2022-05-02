package uestc.jvm;

import java.util.ArrayList;

/**
 * @author admin
 * @ClassName HeapUsed.java
 * @Description 使用工具监视堆使用情况
 * @createTime 2022年02月20日 19:39:00
 */
public class HeapUsed {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1........");
        Thread.sleep(10000);
        ArrayList list=new ArrayList(1024*10*1024);
        System.out.println("2........");
        Thread.sleep(10000);
        System.gc();
        System.out.println("3........");
        Thread.sleep(300000);
    }
}
