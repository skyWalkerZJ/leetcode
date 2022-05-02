package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 打家劫舍
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2220:20
 */
public class 打家劫舍_动态规划 {
    //动态规划
    public static int rob(int[] nums) {
        if(nums==null) return 0;
        int[] dp=new int[nums.length];
        if(nums.length==1) dp[0]=nums[0];
        if(nums.length>=2){
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];
    }
    //动态规划+滚动数组
    public static int rob_1(int[] nums) {
        if(nums==null) return 0;
        int before=0;
        int later=0;
        if(nums.length==1) return nums[0];
        if(nums.length>=2)
        {
            before=nums[0];
            later=Math.max(before,nums[1]);
        }
        for (int i = 2; i < nums.length; i++) {
            int temp=later;
            later=Math.max(before+nums[i],later);
            before=temp;
        }
        return later;
    }

    public static void main(String[] args) {
        int []ans=new int[]{2,1,1,2};
        System.out.println(rob(ans));
    }
}
