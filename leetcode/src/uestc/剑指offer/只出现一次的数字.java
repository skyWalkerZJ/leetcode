package uestc.剑指offer;

/**
 * @author: zhangjin
 * @title: 只出现一次的数字
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/214:46
 */
public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int total=0;
            for(int num:nums)
            {
                total+=((num>>i)&1);
            }
            if(total%3!=0) ans+=(1<<i);
        }
        return ans;
    }
}
