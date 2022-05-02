package uestc.network;

/**
 * @author: zhangjin
 * @title: gcd
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/513:38
 */
public class gcd {
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    // 求最小公倍数
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        String socketAddress="/192.168.247.1:57375";
        System.out.println(socketAddress.substring(1, socketAddress.indexOf(":")));
    }

}
