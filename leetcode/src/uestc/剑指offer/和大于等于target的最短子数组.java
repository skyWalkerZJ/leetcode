package uestc.剑指offer;

/**
 * @author: zhangjin
 * @title: 和大于等于target的最短子数组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/310:55
 */
public class 和大于等于target的最短子数组 {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
