package uestc.leetcode;

/**
 * @author admin
 * @ClassName 递增的三元子序列.java
 * @Description TODO
 * @createTime 2022年03月06日 19:24:00
 */
public class 递增的三元子序列_贪心 {
    //贪心
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int first=nums[0];int second=Integer.MAX_VALUE;
        for (int i = 1; i <nums.length; i++) {
            int num=nums[i];
            if(num>second) return true;
            else if(num>first)
            {
                second=num;
            }else {
                first=num;
            }
        }
        return false;
    }
    //双向遍历
    public static boolean increasingTriplet_1(int[] nums) {
        if(nums.length<3) return false;
        int first=nums[0];int second=Integer.MAX_VALUE;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int l=0,r=nums.length-1;
        int min=nums[0],max=nums[nums.length-1];
        while (l!=nums.length-1&&r!=0)
        {
            left[l]=min=Math.min(nums[l],min);
            right[r]=max=Math.max(nums[r],max);
            l++;r--;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>left[i]&&nums[i]<right[i]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr=new int[]{20,100,10,12,5,13};
        System.out.println(increasingTriplet_1(arr));
    }
}
