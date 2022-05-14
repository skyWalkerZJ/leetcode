package uestc.leetcode;

import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 寻找数组的中心下标
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/616:44
 */
public class 寻找数组的中心下标 {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
