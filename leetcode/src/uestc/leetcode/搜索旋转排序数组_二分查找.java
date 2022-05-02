package uestc.leetcode;

public class 搜索旋转排序数组_二分查找 {
    public static int search(int[] nums, int target) {
        return search_1(nums,0,nums.length-1,target);
    }
    public static int search_1(int[] nums, int left,int right,int target) {
        int mid=(left+right)/2;
        if(nums[mid]==target) return mid;
        if(nums[right]==target) return right;
        if(mid==left) return -1;
        if(nums[mid]>=nums[left])
        {
            if(target<nums[mid]&&nums[left]<=target) return reallySearch(nums,left,mid,target);
            else return search_1(nums,mid,right,target);
        }else
        {
            if(target>nums[mid]&&nums[right]>=target) return reallySearch(nums,mid,right,target);
            else return search_1(nums,left,mid,target);
        }
    }
    public static int reallySearch(int nums[],int left,int right,int target)
    {
        while (left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]<target) left=mid+1;
            else if(nums[mid]==target) return mid;
            else right=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] res=new int[]{4,5,6,7,0,1,2};
        System.out.println(search(res, 3));
    }
}
