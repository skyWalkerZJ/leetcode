package uestc.leetcode;

/**
 * @author admin
 * @ClassName 统计各位数字之和为偶数的整数个数.java
 * @Description TODO
 * @createTime 2022年02月21日 09:08:00
 */
public class 统计各位数字之和为偶数的整数个数 {
    public int countEven(int num) {
        int count=0;
        int temp;
        for (int i = 2; i <= num; i++) {
            temp=0;int k=i;
            while(k>0)
            {
                temp+=(k%10);
                k=k/10;
            }
            if((temp&1)==0) count++;
        }
        return count;
    }
}
