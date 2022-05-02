package uestc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 找到字符串中所有字母异位词_滑动窗口_哈希表 {
    //滑动窗口
    public static List<Integer> findAnagrams_1(String s,String p)
    {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
        int[] ptemp=new int[26];
        int[] stemp=new int[26];
        for (int i = 0; i < p.length(); i++) {
            ptemp[p.charAt(i)-'a']++;
            stemp[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(stemp,ptemp)) list.add(0);
        for (int i = 0; i < s.length()-p.length();i++) {
            stemp[s.charAt(i)-'a']--;
            stemp[s.charAt(i+p.length())-'a']++;
            if(Arrays.equals(stemp,ptemp)) list.add(i+1);
        }
        return list;
    }
    //只适用于P中所有字母都不重复的情况
    public static List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();
        HashMap map=new HashMap();
        HashMap temp=new HashMap();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            map.put(p.charAt(i),1);
        }
        int left=0,right=0;int count=0;
        while (right<=s.length()-1)
        {
            if(map.containsKey(s.charAt(right)))
            {
                count++;
                temp.put(s.charAt(right),1);
            }else{
                left=right+1;
                temp.clear();
                count=0;
            }
            if(temp.size()==p.length())
            {
                temp.remove(s.charAt(right-p.length()+1));
                list.add(left);
                left++;
                count=p.length()-1;
            }
            if(count==p.length())
            {
                temp.remove(s.charAt(left));
                left++;
                temp.clear();
                for (int i = left; i <= right; i++) {
                    temp.put(s.charAt(i),1);
                }
                count--;
            }
            right++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("baa", "aa"));
    }
}
