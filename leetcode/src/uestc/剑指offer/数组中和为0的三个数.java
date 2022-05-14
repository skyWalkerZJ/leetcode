package uestc.剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 数组中和为0的三个数
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/39:54
 */
public class 数组中和为0的三个数 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1;int right=nums.length-1;
            int target=-nums[i];
            while (left<right)
            {
                if(left>i+1&&nums[left]==nums[left-1]) {left++;continue;}
                if(right<nums.length-1&&nums[right]==nums[right+1]){right--;continue;}
                if(nums[left]+nums[right]>target)
                {
                    right--;
                }else if(nums[left]+nums[right]<target)
                {
                    left++;
                }else if(nums[left]+nums[right]==target)
                {
                    ArrayList<Integer> arrayList=new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[left]);
                    arrayList.add(nums[right]);
                    ans.add(arrayList);
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans=new int[]{-1,0,1,2,-1,-4};
        threeSum(ans);
    }
}
