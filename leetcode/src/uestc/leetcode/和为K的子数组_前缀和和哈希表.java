package uestc.leetcode;

import java.util.HashMap;

/**
 * @author admin
 * @ClassName 和为K的子数组.java
 * @Description TODO
 * @createTime 2022年03月06日 21:36:00
 */
public class 和为K的子数组_前缀和和哈希表 {
    public int subarraySum(int[] nums, int k) {
        int count=0;int sum=0;
        HashMap map=new HashMap();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            if(map.containsKey(sum-k))
            {
                count+=(int)map.get(sum-k);
            }
            map.put(sum,(int)map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
