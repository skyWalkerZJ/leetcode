package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 最长公共前缀
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/110:23
 */
public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String ans=strs[0];
        for (int i = 1; i < strs.length; i++) {
            ans=longestCommonPrefix(ans,strs[i]);
        }
        return ans;
    }
    public static String longestCommonPrefix(String s1,String s2)
    {
        int index=0;
        int length=Math.min(s1.length(),s2.length());
        for(;index<length;index++)
        {
            if(s1.charAt(index)!=s2.charAt(index))
            {
                break;
            }
        }
        return s1.substring(0,index);
    }
}
