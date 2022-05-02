package uestc.leetcode;

/**
 * @author admin
 * @ClassName 只出现一次的数字_异或.java
 * @Description TODO
 * @createTime 2022年02月25日 13:29:00
 */
public class 只出现一次的数字_异或 {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums)
        {
            res=res^num;
        }
        return res;
    }
}
