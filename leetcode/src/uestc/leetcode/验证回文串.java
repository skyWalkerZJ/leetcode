package uestc.leetcode;

/**
 * @author: zhangjin
 * @title: 验证回文串
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/5/622:28
 */
public class 验证回文串 {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;int right=s.length()-1;
        while (left<=right)
        {
            while (left<right&&!((s.charAt(left)<='z'&&s.charAt(left)>='a')||(s.charAt(left)<='9'&&s.charAt(left)>='0'))) left++;
            while (right>left&&!((s.charAt(right)<='z'&&s.charAt(right)>='a')||(s.charAt(right)<='9'&&s.charAt(right)>='0'))) right--;
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(l!=r) return false;
            left++;right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
}
