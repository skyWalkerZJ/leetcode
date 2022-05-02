package uestc.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @ClassName HeapDemo.java
 * @Description 堆内存溢出 可以通过设置Xmx参数修改堆内存大小
 * @createTime 2022年02月20日 15:21:00
 */
public class HeapDemo {
    public static void main(String[] args) {
        int i=0;
        List list=new ArrayList<>();
        String s="hello";
        try {
            while(true)
            {
                list.add(s);
                s=s+s;
                i++;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
