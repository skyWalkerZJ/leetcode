package uestc.leetcode;

public class 寻找峰值_迭代爬坡_二分查找 {
    //遍历找到最大值，最大值就是峰值
    public int findPeakElement(int[] nums) {
        int max=nums[0];int res=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) {max=nums[0];res=i;}
        }
        return res;
    }
    //迭代爬坡
    public static int findPeakElement_1(int nums[])
    {

        int left=0;int right=nums.length-1;
        int mid=(left+right)/2;
        while(left<right)
        {
            mid=(left+right)/2;
            if(mid==left)
            {
                if(nums[mid]<nums[right]) return right;
                else return mid;
            }
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid+1]&&nums[mid]<nums[mid-1]){
                right=mid;
            }else{
                left=mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int []res=new int[]{6,5,4,3,2,3,2};
        System.out.println(findPeakElement_1(res));
    }
}
