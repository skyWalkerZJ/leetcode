package uestc.leetcode;

import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 连续数组
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/616:25
 */
public class 连续数组 {
    public int findMaxLength(int[] nums) {
        int sum=0;int ans=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) sum+=-1;
            else sum+=nums[i];
            if(hashMap.containsKey(sum))
            {
                ans=Math.max(ans,i-hashMap.get(sum));
            }else{
                hashMap.put(sum,i);
            }
        }
        return ans;
    }
}
