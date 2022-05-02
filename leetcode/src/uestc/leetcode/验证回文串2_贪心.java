package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 验证回文串2_贪心
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2318:28
 */
public class 验证回文串2_贪心 {
    public boolean validPalindrome(String s) {
        int low=0;int high=s.length()-1;
        while (low<high)
        {
            if(s.charAt(low)==s.charAt(high))
            {
                low++;high--;
            }else{
                return validPalindrome_1(s,low,high-1)||validPalindrome_1(s,low+1,high);
            }
        }
        return true;
    }
    public static boolean validPalindrome_1(String s,int low, int high)
    {
        while (low<high)
        {
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}
