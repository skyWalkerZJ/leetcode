package uestc.剑指offer;

/**
 * @author: zhangjin
 * @title: 前n个数字二进制中1的个数
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/214:18
 */
public class 前n个数字二进制中1的个数 {
    //Brian Kernighan 算法
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=countOnes(i);
        }
        return ans;
    }
    public static int countOnes(int x)
    {
        int count=0;
        while (x>0)
        {
            x=x&(x-1);
            count++;
        }
        return count;
    }
    //动态规划 最高有效位
    public int[] countBits_1(int n) {
        int[] ans=new int[n+1];
        int highBit=0;
        for(int i=1;i<=n;i++)
        {
            if((i&(i-1))==0)
            {
                highBit=i;
            }
            ans[i]=ans[i-highBit]+1;
        }
        return ans;
    }
    //动态规划 最低有效位
    public int[] countBits_2(int n) {
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            ans[i]=ans[i>>1]+i&1;
        }
        return ans;
    }
    //动态规划 最低设置位
    public int[] countBits_3(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }
}
