package uestc.leetcode;

import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 最接近的三数之和_双指针
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/4/1921:56
 */
public class 最接近的三数之和_双指针 {
    //暴力
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length==0) return 0;
        int c=Integer.MAX_VALUE;int res=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int temp=nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-temp)<c)
                    {
                        c=Math.abs(target-temp);
                        res=temp;
                    }
                }
            }
        }
        return res;
    }
    //双指针
    public int threeSumClosest_1(int[] nums,int target)
    {
        Arrays.sort(nums);int gap=Integer.MAX_VALUE;int ans=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left=i+1;int right=nums.length-1;
            while (left<right)
            {
                int t=nums[i]+nums[left]+nums[right];
                if(t==target) return t;
                if(t>target)
                {
                    right--;
                }else{
                    left++;
                }
                if(Math.abs(target-t)<gap)
                {
                    gap=Math.abs(target-t);
                    ans=t;
                }
            }
        }
        return ans;
    }
}
