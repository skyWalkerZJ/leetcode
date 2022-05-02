package uestc.leetcode;

import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 数组拆分_贪心
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2318:20
 */
public class 数组拆分_贪心 {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
}
