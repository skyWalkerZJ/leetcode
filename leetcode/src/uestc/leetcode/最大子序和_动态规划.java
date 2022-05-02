package uestc.leetcode;

/**
 * @author admin
 * @ClassName 最大子序和_动态规划.java
 * @Description 假设 nums 数组的长度是 n，下标从 0 到 n−1。
 */
public class 最大子序和_动态规划 {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre+x,x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
    public static int maxSubArray_1(int[] nums) {
        int pre=0;int maxAns=nums[0];
        for(int x:nums)
        {
            pre=Math.max(pre+x,x);
            maxAns=Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
