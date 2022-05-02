package uestc.leetcode;

/**
 * @author admin
 * @ClassName 多数元素_摩尔投票法_分治.java
 * @Description TODO
 * @createTime 2022年02月25日 14:04:00
 */
public class 多数元素_摩尔投票法_分治 {
    //摩尔投票法
    public int majorityElement(int[] nums) {
        int count=0;int candidate=nums[0];
        for(int num:nums)
        {
            if(count==0) candidate=num;
            if(num==candidate) count++;
            else count--;
        }
        return candidate;
    }
    //分治
    //哈希表
    //随机化
}
