package uestc.leetcode;

/**
 * @author admin
 * @ClassName 最长回文串_字符串.java
 * @Description TODO
 * @createTime 2022年03月06日 21:48:00
 */
public class 最长回文串_字符串 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }
        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
