package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 长度最小的子数组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/310:19
 */
public class 长度最小的子数组 {
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
