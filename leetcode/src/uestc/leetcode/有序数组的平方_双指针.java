package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 有序数组的平方
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2216:43
 */
public class 有序数组的平方_双指针 {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int last=nums.length-1;
        int left=0;int right=nums.length-1;
        while (left<=right)
        {
            if(nums[right]*nums[right]>=nums[left]*nums[left])
            {
                ans[last]=nums[right]*nums[right];
                right--;
            }else{
                ans[last]=nums[left]*nums[left];
                left++;
            }
            last--;
        }
        return ans;
    }
}
