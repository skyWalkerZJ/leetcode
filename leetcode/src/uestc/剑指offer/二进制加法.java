package uestc.剑指offer;

/**
 * @author: zhangjin
 * @title: 二进制加法
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/214:05
 */
public class 二进制加法 {
    public String addBinary(String a, String b) {
        StringBuffer stringBuffer=new StringBuffer(a);
        a=stringBuffer.reverse().toString();
        b=new StringBuffer(b).reverse().toString();
        int jinwei=0;
        int index=0;
        StringBuffer buffer=new StringBuffer();
        while (index<a.length()&&index<b.length())
        {
            int t=jinwei+a.charAt(index)-'0'+b.charAt(index)-'0';
            if(t%2==1) buffer.append('1');
            else buffer.append('0');
            jinwei=t/2;
            index++;
        }
        if(index!=a.length())
        {
            while (index<a.length())
            {
                int t=jinwei+a.charAt(index)-'0';
                if(t%2==1) buffer.append('1');
                else buffer.append('0');
                jinwei=t/2;
                index++;
            }
        }else if(index!=b.length())
        {
            while (index<b.length())
            {
                int t=jinwei+b.charAt(index)-'0';
                if(t%2==1) buffer.append('1');
                else buffer.append('0');
                jinwei=t/2;
                index++;
            }
        }
        if(jinwei==1) buffer.append('1');
        return buffer.reverse().toString();
    }
}
