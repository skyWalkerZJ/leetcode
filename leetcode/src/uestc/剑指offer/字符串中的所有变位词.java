package uestc.剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zhangjin
 * @title: 字符串中的所有变位词
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/622:10
 */
public class 字符串中的所有变位词 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()) return ans;
        int pLength=p.length();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<p.length();i++)
        {
            arr1[s.charAt(i)-'a']++;
            arr2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)) ans.add(0);
        for(int i=p.length();i<s.length();i++)
        {
            arr1[s.charAt(i-pLength)-'a']--;
            arr1[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)) ans.add(i-pLength+1);
        }
        return ans;
    }
}
