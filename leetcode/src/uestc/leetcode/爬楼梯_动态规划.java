package uestc.leetcode;

/**
 * @author admin
 * @ClassName 爬楼梯_动态规划.java
 * @Description TODO
 * @createTime 2022年02月21日 13:57:00
 */
public class 爬楼梯_动态规划 {
    public int climbStairs(int n) {
        //f(n)=f(n-1)+f(n-2)
        if(n==2) return 2;
        if(n==1) return 1;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public int climbStairs_1(int n) {
        //f(n)=f(n-1)+f(n-2)
        if(n==2) return 2;
        if(n==1) return 1;
        int l1=1,l2=2;
        int temp=0;
        for (int i = 3; i <=n; i++) {
            temp=l1+l2;
            l1=l2;
            l2=temp;
        }
        return temp;
    }
}
