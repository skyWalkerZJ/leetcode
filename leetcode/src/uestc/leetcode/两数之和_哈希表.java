package uestc.leetcode;

import java.util.HashMap;

/**
 * @author admin
 * @ClassName 两数之和_哈希表.java
 * @Description TODO
 * @createTime 2022年02月14日 16:36:00
 */
public class 两数之和_哈希表 {
    //暴力枚举破解 时间复杂度O(n^2) 空间复杂度O(1)
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    //哈希表
    public static int[] twoSum_1(int[] nums, int target)
    {
        int[] ans=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hashMap.containsKey(target-nums[i]))
            {
                ans[0]=i;
                ans[1]=hashMap.get(target-nums[i]);
            }
            hashMap.put(nums[i],i);
        }
        return ans;
    }
    public static int[] twoSum_2(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hashMap.containsKey(target-nums[i]))
            {
                return new int[]{hashMap.get(target-nums[i]),i};
            }else
            {
                hashMap.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums =new int[4];
        nums[0]=2;
        nums[1]=7;
        nums[2]=11;
        nums[3]=15;
        int target =9;
        int[] res=twoSum_1(nums,target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
