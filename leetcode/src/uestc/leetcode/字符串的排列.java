package uestc.leetcode;

import java.util.Arrays;

/**
 * @author: zhangjin
 * @title: 字符串的排列
 * @ProjectName: leetcode
 * @Description:
 * @date: 2022/3/2714:29
 */
public class 字符串的排列 {
    //滑动窗口
    public static boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        int[] ct1=new int[26];
        int[] ct2=new int[26];
        for (int i = 0; i < s1.length(); i++) {
            ct1[s1.charAt(i)-'a']++;
            ct2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(ct1,ct2)) return true;
        for (int i = n; i < s2.length(); i++) {
            ct2[s2.charAt(i)-'a']++;
            ct2[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(ct1,ct2)) return true;
        }
        return false;
    }
    //滑动窗口优化
    public static boolean checkInclusion_1(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt = new int[26];
        for (int i = 0; i < n; ++i) {
            --cnt[s1.charAt(i) - 'a'];
            ++cnt[s2.charAt(i) - 'a'];
        }
        int diff = 0;
        for (int c : cnt) {
            if (c != 0) {
                ++diff;
            }
        }
        if (diff == 0) {
            return true;
        }
        for (int i = n; i < m; ++i) {
            int x = s2.charAt(i) - 'a', y = s2.charAt(i - n) - 'a';
            if (x == y) {
                continue;
            }
            if (cnt[x] == 0) {
                ++diff;
            }
            ++cnt[x];
            if (cnt[x] == 0) {
                --diff;
            }
            if (cnt[y] == 0) {
                ++diff;
            }
            --cnt[y];
            if (cnt[y] == 0) {
                --diff;
            }
            if (diff == 0) {
                return true;
            }
        }
        return false;
    }

}
