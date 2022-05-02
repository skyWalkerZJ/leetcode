package uestc.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @ClassName 堆转储.java
 * @Description TODO
 * @createTime 2022年02月21日 15:42:00
 */
class Student{
    byte [] bytes=new byte[1024*1024];
}
public class 堆转储 {
    public static void main(String[] args) throws InterruptedException {
        List list=new ArrayList();
        for(int i=0;i<200;i++)
        {
            list.add(new Student());
        }
        Thread.sleep(100000000L);
        TimeUnit.HOURS.sleep(1);
    }
}
