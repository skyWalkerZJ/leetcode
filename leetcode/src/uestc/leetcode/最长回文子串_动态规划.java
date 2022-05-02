package uestc.leetcode;

/**
 * @author admin
 * @ClassName 最长回文子串_动态规划.java
 * @Description TODO
 * @createTime 2022年02月24日 19:08:00
 */
public class 最长回文子串_动态规划 {
    public static String longestPalindrome(String s) {
        String res="";
        //获取奇数个字符长度的回文子串
        if(s.length()<2) return s;
        for (int i = 1; i < s.length(); i++) {
            int left=i-1,right=i+1;
            String maxString=s.substring(i,i+1);
            while(left>=0&&right<s.length())
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    if(maxString.length()<s.substring(left,right+1).length())
                    {
                        maxString=s.substring(left,right+1);
                    }
                    left--;right++;
                }else{
                    break;
                }
            }
            if(res.length()<maxString.length()) res=maxString;
        }
        //获取偶数字长的回文子串
        for(int i=0;i<s.length()-1;i++)
        {
            if(!(s.charAt(i)==s.charAt(i+1))) continue;
            String maxString=s.substring(i,i+2);
            int left=i-1;int right=i+2;
            while(left>=0&&right<s.length())
            {
                if(s.charAt(left)==s.charAt(right))
                {
                    if(maxString.length()<s.substring(left,right+1).length())
                    {
                        maxString=s.substring(left,right+1);
                    }
                    left--;right++;
                }else break;
            }
            if(res.length()<maxString.length()) res=maxString;
        }
        return res;
    }

    public static void main(String[] args) {
        //String s="asdfgfdsaasdasqweqwe";
        String s="abcdeasdasdasdasdasdasdasdaaada";
        System.out.println(longestPalindrome(s));
    }
}
