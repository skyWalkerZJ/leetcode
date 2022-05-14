package uestc.剑指offer;

import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 字符串中的变位词
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/616:58
 */
public class 字符串中的变位词 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        int sLength=s1.length();
        for(int i=0;i<s1.length();i++)
        {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)) return true;
        for(int i=s1.length();i<s2.length();i++)
        {
            arr2[s2.charAt(i-sLength)-'a']--;
            arr2[s2.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)) return true;
        }
        return false;
    }
}
