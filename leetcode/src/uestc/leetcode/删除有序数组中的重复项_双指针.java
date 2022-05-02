package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 删除有序数组中的重复项
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/2023:18
 */
public class 删除有序数组中的重复项_双指针 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int left=1;int right=1;
        for (; right < nums.length; right++) {
            if(nums[right]!=nums[right-1])
            {
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}
