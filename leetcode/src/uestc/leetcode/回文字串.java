package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 回文字串
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/622:45
 */
public class 回文字串 {
    public int countSubstrings(String s) {
        int ans=0;
        int length=s.length();
        for(int i=0;i<length;i++)
        {
            //1. 以i一个字母为中心向两边扩 2.以i和i+1为中心向两边扩
            ans++;
            int left=i-1;int right=i+1;
            while (left>=0&&right<length)
            {
                if(s.charAt(left)==s.charAt(right)) {ans++;left--;right++;}
                else break;
            }
            if(i<length-1)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    ans++;
                    left=i-1;right=i+2;
                }
                while (left>=0&&right<length)
                {
                    if(s.charAt(left)==s.charAt(right)) {ans++;left--;right++;}
                    else break;
                }
            }
        }
        return ans;
    }
}
