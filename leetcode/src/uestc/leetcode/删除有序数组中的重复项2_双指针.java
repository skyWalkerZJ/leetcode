package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 删除有序数组中的重复项2
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2112:38
 */
public class 删除有序数组中的重复项2_双指针 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int left=2;int right=2;
        for(;right<nums.length;right++)
        {
            if(nums[left-2]!=nums[right])
            {
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,1,1,2,2,3};
        removeDuplicates(arr);
    }
}
