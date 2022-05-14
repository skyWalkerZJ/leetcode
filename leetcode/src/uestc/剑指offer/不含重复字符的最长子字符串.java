package uestc.剑指offer;

import java.util.HashMap;

/**
 * @author: zhangjin
 * @title: 不含重复字符的最长子字符串
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/617:07
 */
public class 不含重复字符的最长子字符串 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        if(s.length()<2) return s.length();
        int left=0;int right=0;int ans=0;
        for(;right<s.length();right++)
        {
            if(!hashMap.containsKey(s.charAt(right)))
            {
                hashMap.put(s.charAt(right),right);
                ans=Math.max(ans,hashMap.size());
            }else{
                int temp=hashMap.get(s.charAt(right));
                while (left<=temp)
                {
                    hashMap.remove(s.charAt(left));
                    left++;
                }
                hashMap.put(s.charAt(right),right);
            }
        }
        return ans;
    }
}
