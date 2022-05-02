package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 跳跃游戏
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2318:54
 */
public class 跳跃游戏_贪心 {
    public boolean canJump(int[] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            max=Math.max(max,i+nums[i]);
        }
        return max>=nums.length-1;
    }
}
