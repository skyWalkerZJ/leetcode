package uestc.leetcode;

/**
 * @author admin
 * @ClassName 在排序数组中查找元素的第一个和最后一个位置_二分查找.java
 * @Description TODO
 * @createTime 2022年02月25日 14:11:00
 */
public class 在排序数组中查找元素的第一个和最后一个位置_二分查找 {
    public int[] searchRange(int[] nums, int target) {
        int left=getIndex(nums,target,true);
        int right=getIndex(nums,target,false)-1;
        return new int[]{left,right};
    }
    public static int getIndex(int[] nums,int target,boolean flag)
    {
        int ans=nums.length;int left=0,right=nums.length-1;
        while (left<right)
        {
            int mid=(left+right)/2;
            if(nums[mid]>target||(flag&&nums[mid]>=target))
            {
                right=mid-1;
                ans=mid;
            }else {
                left=mid+1;
            }
        }
        return ans;
    }
}
