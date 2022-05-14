package uestc.剑指offer;

import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 和为K的子数组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/616:14
 */
public class 和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,1);
        int sum=0;int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hashMap.containsKey(sum-k))
            {
                count+=hashMap.get(sum-k);
            }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
