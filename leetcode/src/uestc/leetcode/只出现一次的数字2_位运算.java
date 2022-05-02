package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 只出现一次的数字2_位运算
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2220:58
 */
public class 只出现一次的数字2_位运算 {
    public int singleNumber(int[] nums)
    {
        int ans=0;
        for (int i = 0; i < 32; i++) {
            int total=0;
            for(int num:nums)
            {
                total+=((num>>i)&1);
            }
            if(total%3!=0){
                ans +=(1<<i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a=-5;
        int b=5;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(a^b);
    }
}
