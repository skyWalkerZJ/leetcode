package uestc.jvm;

/**
 * @author admin
 * @ClassName stackDemo.java
 * @Description 栈帧过大和栈帧过多可能导致栈内存溢出 StackOverFlowError 可以通过设置XSS参数修改栈内存
 * @createTime 2022年02月20日 14:23:00
 */
public class stackDemo {
    static int number=0;
    public static void test()
    {
        number++;
        test();
    }
    public static void main(String[] args) {
       try {
           test();
       }catch (Exception e)
       {
           e.printStackTrace();
       }finally {
           System.out.println(number);
       }
    }
}
