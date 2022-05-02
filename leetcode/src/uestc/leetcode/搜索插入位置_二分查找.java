package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 搜索插入位置
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2012:57
 */
public class 搜索插入位置_二分查找 {
    public int searchInsert(int[] nums, int target) {
        int low=0;int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>target)
            {
                high=mid-1;
            }else if(nums[mid]==target)
            {
                return mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
